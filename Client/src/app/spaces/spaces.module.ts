import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SpacesRoutingModule } from './spaces-routing.module';
import { DeskComponent } from './desk/desk.component';
import { CardComponent } from './card/card.component';
import { AreaComponent } from './area/area.component';


@NgModule({
  declarations: [
    DeskComponent,
    CardComponent,
    AreaComponent
  ],
  imports: [
    CommonModule,
    SpacesRoutingModule
  ]
})
export class SpacesModule { }
