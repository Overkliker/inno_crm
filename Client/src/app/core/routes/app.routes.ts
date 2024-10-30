import {Routes} from "@angular/router"

export const APP_ROUTES: Routes = [
    {
        path: "spaces",
        loadChildren: () => import ('src/app/spaces/spaces.module').then(m => m.SpacesModule)
    }
]
