package com.jackalvarez;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:4200")
public class Controller {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/test")
	public String getTestMessage() {
		return "This is a test";
	}
	
	@RequestMapping("/testsql")
	public SqlSnapshot getTestSQL() {
		String[] cols = {"Col 1", "Col 2", "Col 3"};
		String[][] sql = new String[3][3];
		for (int i = 0; i < sql.length; i++) {
			for (int j = 0; j < sql[0].length; j++) {
				sql[i][j] = "This is cell number " + (3 * i + j);
			}
		}
		return new SqlSnapshot(counter.getAndIncrement(), cols, sql);
	}

}
