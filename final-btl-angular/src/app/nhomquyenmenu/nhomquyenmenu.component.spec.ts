import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NhomquyenmenuComponent } from './nhomquyenmenu.component';

describe('NhomquyenmenuComponent', () => {
  let component: NhomquyenmenuComponent;
  let fixture: ComponentFixture<NhomquyenmenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NhomquyenmenuComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NhomquyenmenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
