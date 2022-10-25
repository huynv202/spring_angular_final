import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class RoleService {
  private apiServerUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  public getRole(): Observable<any> {
    return this.http.get<any>(`${this.apiServerUrl}/role/all`);
  }

  public getRole1(id: any): Observable<any> {
    return this.http.get<any>(`${this.apiServerUrl}/role/all1/${id}`);
  }

  public deleteRole(id: number): Observable<any> {
    return this.http.delete<any>(`${this.apiServerUrl}/role/delete/${id}`);
  }

  public addRole(role: any): Observable<any> {
    return this.http.post<any>(`${this.apiServerUrl}/role/add`, role);
  }

  public updateRole(role: any): Observable<any> {
    return this.http.put<any>(`${this.apiServerUrl}/role/update`, role);
  }
}
