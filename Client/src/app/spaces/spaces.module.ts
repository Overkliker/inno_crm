import { NgModule } from '@angular/core';
import {CommonModule, NgOptimizedImage} from '@angular/common';

import { SpacesRoutingModule } from './spaces-routing.module';
import { AreaComponent } from './area/area.component';
import { CardComponent } from './card/card.component';
import { DeskComponent } from './desk/desk.component';
import { MenuComponent } from './menu/menu.component';
import { PanelComponent } from './panel/panel.component';
import { StatusCardComponent } from './status-card/status-card.component';


@NgModule({
  declarations: [
    AreaComponent,
    CardComponent,
    DeskComponent,
    MenuComponent,
    PanelComponent,
    StatusCardComponent
  ],
  imports: [
    CommonModule,
    SpacesRoutingModule,
    NgOptimizedImage
  ]
})
export class SpacesModule { }
