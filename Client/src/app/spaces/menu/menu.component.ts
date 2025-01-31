import {Component, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent {
  @Output('menuIsShowing') parentEvent: EventEmitter<any> = new EventEmitter();

  showMenu(){
    this.parentEvent.emit();
  }
}
