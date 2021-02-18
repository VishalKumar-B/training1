import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CcontainerComponent } from './ccontainer.component';

describe('CcontainerComponent', () => {
  let component: CcontainerComponent;
  let fixture: ComponentFixture<CcontainerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CcontainerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CcontainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
