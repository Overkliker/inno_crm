import {Component, Input} from '@angular/core';
import {CardComponent} from "../card/card.component";

@Component({
  selector: 'app-desk',
  templateUrl: './desk.component.html',
  styleUrls: ['./desk.component.scss']
})
export class DeskComponent {

  @Input() cards: CardComponent[] = [];

  constructor(){
    this.cards.push(new CardComponent());
    this.cards.push(new CardComponent());
    this.cards.push(new CardComponent());
    this.cards.push(new CardComponent());
  }

}
