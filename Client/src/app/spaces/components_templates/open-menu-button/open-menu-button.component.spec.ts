import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OpenMenuButtonComponent } from './open-menu-button.component';

describe('OpenMenuButtonComponent', () => {
  let component: OpenMenuButtonComponent;
  let fixture: ComponentFixture<OpenMenuButtonComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [OpenMenuButtonComponent]
    });
    fixture = TestBed.createComponent(OpenMenuButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
