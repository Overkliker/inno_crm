import { Component } from '@angular/core';

@Component({
  selector: 'app-area',
  templateUrl: './area.component.html',
  styleUrls: ['./area.component.scss']
})
export class AreaComponent {
  isMenuOpen = false

  showMenu(){
    console.log(this.isMenuOpen)
    this.isMenuOpen = !this.isMenuOpen
  }
}
