import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MessageService {

  http = inject(HttpClient);

  constructor() { }

  getMessagesFromApi() {
    const url = 'http://localhost:8080/api/messages/';
    return this.http.get<Array<String>>(url);
  }
}
