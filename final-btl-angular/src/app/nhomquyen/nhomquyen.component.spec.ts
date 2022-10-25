import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NhomquyenComponent } from './nhomquyen.component';

describe('NhomquyenComponent', () => {
  let component: NhomquyenComponent;
  let fixture: ComponentFixture<NhomquyenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NhomquyenComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NhomquyenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
