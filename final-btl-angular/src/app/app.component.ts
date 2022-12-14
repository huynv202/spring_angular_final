import { Component, Input } from '@angular/core';
import { Nhomquyen } from './nhomquyen';
import { NhomquyenService } from './service/nhomquyen.service';
import { NhomquyenmenuService } from './service/nhomquyenmenu.service';
import { RoleService } from './service/role.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  @Input() nameNQ!: string;
  @Input() checkBox!: boolean;
  constructor(
    private nhomquyenService: NhomquyenService,
    private nhomquyenmenuService: NhomquyenmenuService,
    private roleService: RoleService
  ) {}
  check!: boolean;
  listNQ: any;
  listNQMenu: any;
  listNQ1: any;
  listRole: any;
  ngOnInit() {
    this.getAllNhomQuyen();
    this.getAllNhomQuyenMN();
    this.getAllRole();
    this.getNhomQuyenMenu1(1);
  }
  getAllNhomQuyen() {
    this.nhomquyenService.getNhomQuyen().subscribe((data) => {
      this.listNQ = data;
      console.log(this.listNQ);
    });
  }

  getAllRole() {
    this.roleService.getRole().subscribe((data) => {
      this.listRole = data;
      console.log(this.listRole);
    });
  }

  getAllNhomQuyenMN() {
    this.nhomquyenmenuService.getNhomQuyenMenu().subscribe((data) => {
      this.listNQMenu = data;
      console.log(this.listNQMenu);
    });
  }

  getNhomQuyenMenu1(id: number) {
    this.check = true;
    this.nhomquyenmenuService.getNhomQuyenMenu1(id).subscribe((data) => {
      this.listNQMenu = data;
      this.nhomquyenService.getNhomQuyen().subscribe((data) => {
        this.listNQ = data;
        this.nameNQ = this.listNQ[id - 1].name;
        console.log(this.listNQ[id - 1].name);
      });
      // this.nameNQ = this.listNQMenu[0].nhom_quyen.name;
      console.log(this.nameNQ);
      console.log(this.listNQMenu);
    });
  }

  getCheck(value: any, ck: boolean) {
    if (ck == true) {
      const uni = new Set(this.listDS);
      this.listDS = [...new Set([...uni, ...this.listDS.concat(value)])];
      console.log('list Q', this.listDS);
    } else {
      //remove element from listDS when ck = false
      this.listDS = this.listDS.filter((item: any) => item.id !== value.id);
      console.log(
        'list fil',
        this.listDS.filter((item: any) => item.id !== value.id)
      );
      console.log('list Q', this.listDS);
    }
    console.log(value);
  }

  listDS1: any;
  listDS: Array<any> = [];
  @Input() showRole!: string;

  getRoles123(value: any) {
    this.listDS1 = value;
    this.listDS = value.role_id;
    console.log('listDS', this.listDS);
    console.log(this.listDS1);
    console.log(value);
  }

  value = {
    id: 0,
    nhom_quyen: {
      id: 0,
      name: '',
    },
    menu_item: {
      id: 0,
      name: '',
      menu: {
        id: 0,
        name: '',
      },
    },
    role_id: [],
  };

  updateRole(data: any) {
    data = this.value;
    data.id = this.listDS1.id;
    data.nhom_quyen.id = this.listDS1.nhom_quyen.id;
    data.nhom_quyen.name = this.listDS1.nhom_quyen.name;
    data.menu_item.id = this.listDS1.menu_item.id;
    data.menu_item.name = this.listDS1.menu_item.name;
    data.menu_item.menu.id = this.listDS1.menu_item.menu.id;
    data.menu_item.menu.name = this.listDS1.menu_item.menu.name;
    data.role_id = this.listDS;
    console.log('data :', data);
    this.nhomquyenmenuService.updateNhomQuyenMenu(data).subscribe((resp) => {
      console.log(resp);
      this.getNhomQuyenMenu1(data.nhom_quyen.id);
    });
  }

  equal(list: any, id: number) {
    for (let i = 0; i < list?.length; i++) {
      if (list[i].id == id) {
        return true;
      }
    }
    return false;
  }

  reset(ck: boolean) {
    ck = false;
  }
}
