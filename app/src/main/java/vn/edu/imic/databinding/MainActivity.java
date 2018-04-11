package vn.edu.imic.databinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*1. Vao build.gradle(level app) them dataBinding{enabled = true}
    * Databinding cho phep ta binding data mot cach tu dong
    * 2. De enable DataBinding trong layout thi thanh phan root cua layout
    * nen bat dau bang the <layout>. Trong no se la cac the con khac
    * nhu <data>, va <variable> duoc su dung
    * 3. Layout nen bat dau bang the <layout> la thanh phan goc.
    * Ben trong <layout> ta se co cac thanh phan khac
    * 4. Mot the <data> theo sau <layout>. Tat ca cac bien va phuong thuc
    * nen duoc khai bao trong the <data>.
    * 5. Ben trong the <data> mot bien se duoc khai bao bang cach su dung
    * the <variable>. The <variable> dua vao 2 thuoc tinh 'name' va 'type'.
    * Thuoc tinh nam se dinh danh ten con type nen duoc dung cho doi tuong class.
    * Trong truong hop nay la User class
    * 6. De bind data value, ta su dung annotaion @ trong the <TextView> de lay
    * gia tri name(@{user.name}) va email({user.email})
    * 7. De databinding duoc tich hop vao layout ta can clean project sau do
    * rebuild project.
    * 8. Viec sinh ra cac class binding data se sinh ra theo ten cua layout khin binding
    * duoc enabled. Vi du activity_main.xml thi no se sinh ra 1 class la
    * ActivityMainBinding(hau to Binding se duoc them vao cuoi).
    * 9. De bind data tren Ui ta can inflate layout binding lan dau su dung sinh class.
    * ActivityBinding inflate layout lan dau va binding.setUser() bind data User
    * vao ui. Khong can dung setContentView va findViewById()*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
