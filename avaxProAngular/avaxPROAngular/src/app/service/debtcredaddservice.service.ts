import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Debtcredcls } from '../model/debtcredcls';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DebtcredserviceService {
  private debtCredSaveUrl: string;
 
  constructor(private http: HttpClient) {
    this.debtCredSaveUrl='http://localhost:8090/api/avaxpro/adddebtcred';
  }
 
  public save(debtcredt: Debtcredcls) {
    console.log(debtcredt.handledBy);
    console.log(debtcredt.branch);
    console.log(debtcredt.agingReportType);
    return this.http.post<Debtcredcls>(this.debtCredSaveUrl, debtcredt);
  }
 
}
