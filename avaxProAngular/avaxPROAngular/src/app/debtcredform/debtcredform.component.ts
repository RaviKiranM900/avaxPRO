import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Debtcredcls } from '../model/debtcredcls';
import { DebtcredserviceService } from '../service/debtcredservice.service';

@Component({
  selector: 'app-debtcredform',
  templateUrl: './debtcredform.component.html',
  styleUrls: ['./debtcredform.component.css']
})
export class DebtcredformComponent implements OnInit {

  debtCred: Debtcredcls;

  ngOnInit() {
  }
  
 
  constructor(private route: ActivatedRoute, private router: Router, private debtCredService: DebtcredserviceService) {
    this.debtCred = new Debtcredcls();
  }
 
  onSubmit() {
    console.log("test inside submit");
    this.debtCredService.save(this.debtCred).subscribe(result => this.gotoDebtCredList());
  }
 
  gotoDebtCredList() {
    this.router.navigate(['/debtcredlist']);
  }
}
