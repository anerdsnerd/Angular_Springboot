import { Component, inject } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MessageService } from './message.service';
import { catchError } from 'rxjs';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angularDemo';
  messages: Array<String> = [''];

  messageService = inject(MessageService);

  ngOnInit(){
    this.messageService.getMessagesFromApi()
      .pipe(
        catchError((err)=>{
          console.log(err);
          throw err;
        })
      )
      .subscribe((messages)=>{
        this.messages = messages;
      })
  }
}
