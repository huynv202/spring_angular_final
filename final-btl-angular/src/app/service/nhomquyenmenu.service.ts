import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class NhomquyenmenuService {
  private apiServerUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  public getNhomQuyenMenu(): Observable<any> {
    return this.http.get<any>(`${this.apiServerUrl}/nhomquyenmn/all`);
  }

  public getNhomQuyenMenu1(id: any): Observable<any> {
    return this.http.get<any>(`${this.apiServerUrl}/nhomquyenmn/${id}`);
  }

  public deleteNhomQuyenMenu(id: number): Observable<any> {
    return this.http.delete<any>(
      `${this.apiServerUrl}/nhomquyenmn/delete/${id}`
    );
  }

  public addNhomQuyenMenu(nhomquyenmenu: any): Observable<any> {
    return this.http.post<any>(
      `${this.apiServerUrl}/nhomquyenmn/add`,
      nhomquyenmenu
    );
  }

  public updateNhomQuyenMenu(nhomquyenmenu: any): Observable<any> {
    return this.http.put<any>(
      `${this.apiServerUrl}/nhomquyenmn/update`,
      nhomquyenmenu,
      {
        headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
        // observe: 'response'
      }
    );
  }

  public updateRoleOnNhomQuyenMenu(
    id: any,
    nhomquyenmenu: any
  ): Observable<any> {
    return this.http.put<any>(
      `${this.apiServerUrl}/nhomquyenmn/update/${id}`,
      nhomquyenmenu
    );
  }
}
