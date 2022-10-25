import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root',
})
export class NhomquyenService {
  private apiServerUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  public getNhomQuyen(): Observable<any> {
    return this.http.get<any>(`${this.apiServerUrl}/nhomquyen/all`);
  }

  public addNhomQuyen(nhomquyen: any): Observable<any> {
    return this.http.post<any>(`${this.apiServerUrl}/nhomquyen/add`, nhomquyen);
  }

  public updateNhomQuyen(nhomquyen: any): Observable<any> {
    return this.http.put<any>(
      `${this.apiServerUrl}/nhomquyen/update`,
      nhomquyen
    );
  }
}
