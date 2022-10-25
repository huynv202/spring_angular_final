import { TestBed } from '@angular/core/testing';

import { NhomquyenService } from './nhomquyen.service';

describe('NhomquyenService', () => {
  let service: NhomquyenService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NhomquyenService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
