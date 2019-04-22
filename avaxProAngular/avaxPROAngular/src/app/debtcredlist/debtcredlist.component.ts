import { Component, OnInit } from '@angular/core';
import { Debtcredcls } from '../model/debtcredcls';
import { DebtcredserviceService } from '../service/debtcredservice.service';

@Component({
  selector: 'app-debtcredlist',
  templateUrl: './debtcredlist.component.html',
  styleUrls: ['./debtcredlist.component.css']
})
export class DebtcredlistComponent implements OnInit {

  debtcred: Debtcredcls[];
 
  constructor(private debtcredservice: DebtcredserviceService) {
  }
 
  ngOnInit() {
    this.debtcredservice.findAll().subscribe(data => {
      this.debtcred = data;
    });
  }

}
