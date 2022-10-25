import { TestBed } from '@angular/core/testing';

import { NhomquyenmenuService } from './nhomquyenmenu.service';

describe('NhomquyenmenuService', () => {
  let service: NhomquyenmenuService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NhomquyenmenuService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
