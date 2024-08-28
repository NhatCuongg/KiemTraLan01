/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLySach {
    static List<Sach> listSach = new ArrayList<>();
    static Sach s = null;
    static Scanner sc = new Scanner(System.in);
    
    public static void dulieu(){
        listSach.add (new Sach("K011", "Lap trinh Java", 95000, 2017));
        listSach.add (new Sach("K012", "Co so du lieu", 85000, 2001));
        listSach.add (new Sach("K013", "Nhap mon Lap trinh", 72000, 2013));
        listSach.add (new Sach("K014", "Lap trinh Python", 39000, 2018));
        listSach.add (new Sach("K015", "Lap trinh C#", 82000, 2015));
            
    }

    void menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
