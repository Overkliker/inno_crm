import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SpacesRoutingModule } from './spaces/spaces-routing.module';
import { AreaComponent } from './spaces/area/area.component';
import { APP_ROUTES } from './core/routes/app.routes';

const routes: Routes = [
  {
    path: '',
    component: AreaComponent,
    children: APP_ROUTES
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
