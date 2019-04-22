import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DebtcredlistComponent } from './debtcredlist/debtcredlist.component';
import { DebtcredformComponent } from './debtcredform/debtcredform.component';

const routes: Routes = [
  { path: 'debtcredlist', component: DebtcredlistComponent },
  { path: 'adddebtcred', component: DebtcredformComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
