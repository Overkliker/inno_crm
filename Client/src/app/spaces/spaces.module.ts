import { NgModule } from '@angular/core';
import {CommonModule, NgOptimizedImage} from '@angular/common';

import { SpacesRoutingModule } from './spaces-routing.module';
import { AreaComponent } from './area/area.component';
import { CardComponent } from './card/card.component';
import { DeskComponent } from './desk/desk.component';
import { MenuComponent } from './menu/menu.component';
import { PanelComponent } from './panel/panel.component';
import { StatusCardComponent } from './status-card/status-card.component';
import { AppModule } from '../app.module';
import { HeaderComponent } from './components_templates/header/header.component';
import { OpenMenuButtonComponent } from './components_templates/open-menu-button/open-menu-button.component';


@NgModule({
  declarations: [
    AreaComponent,
    CardComponent,
    DeskComponent,
    MenuComponent,
    PanelComponent,
    StatusCardComponent,
    HeaderComponent,
    OpenMenuButtonComponent,
  ],
  imports: [
    CommonModule,
    SpacesRoutingModule,
]
})
export class SpacesModule { }
