import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SpacesRoutingModule } from './spaces-routing.module';
import { AreaComponent } from './area/area.component';
import { CardComponent } from './card/card.component';
import { DeskComponent } from './desk/desk.component';


@NgModule({
  declarations: [
    AreaComponent,
    CardComponent,
    DeskComponent
  ],
  imports: [
    CommonModule,
    SpacesRoutingModule
  ]
})
export class SpacesModule { }
