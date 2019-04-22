import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Debtcredcls } from '../model/debtcredcls';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DebtcredserviceService {
  private debtCredUrl: string;
 
  constructor(private http: HttpClient) {
    this.debtCredUrl = 'http://localhost:8090/api/avaxpro/getalldebtcreditreports';
  }
 
  public findAll(): Observable<Debtcredcls[]> {
    console.log("inside debtcredlist method in service class of angular with URL : "+this.debtCredUrl);
    return this.http.get<Debtcredcls[]>(this.debtCredUrl);
  }

  public save(debtAndCredDto: Debtcredcls) {
    return this.http.post<Debtcredcls>('http://localhost:8090/api/avaxpro/adddebtcred', debtAndCredDto);
  }
 
}
