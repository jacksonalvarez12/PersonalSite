import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-output',
  templateUrl: './output.component.html',
  styleUrls: ['./output.component.css']
})
export class OutputComponent implements OnInit {

  data: any;

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.api.getContent().subscribe((data: any)=>{
      this.data = data;
    });
    alert(this.data)
  }


}
