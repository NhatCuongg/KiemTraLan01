/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

import static De01.QuanLySach.listSach;
import static De01.QuanLySach.sc;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main (String[] args){
        QuanLySach qls = new QuanLySach();
        qls.menu();
    }
    public static void menu(){
        int chon = 0;
        while (chon != 7){
            System.out.print("\n -----------QUAN LY SACH-----------");
            System.out.print(
                    "+ \n 1. Xuat toan bo sach va tong tri gia cac sach trong thu vien ra man hinh"
                    + "\n 2. Lay ra cac sach xuat ban truoc nam 2015"
                    + "\n 3. Tim cac sach co ky tu dau cua ten sach la" + "LapTrinh"
                    + "\n 4. Sap xep sach theo gia tang dan"
                    + "\n 5. Xoa sach theo ma sach"
                    + "\n 6. Sua gia bia cua sach theo ma sach"
                    + "\n 7. Tinh tong tri gia cua cac sach trong nha sach"
                    + "\n Chon hanh dong muon thuc hien: ");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    xuatSach();
                    break;
                case 2:
                    laySach();
                    break;
                case 3:
                    timSach();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoaSach();
                    break;
                case 6:
                    suaGia();
                    break;
                case 7:
                    tinhTong();
                    break;                   
            }            
        }
    }
    public static void xuatSach(){
        for (Sach s : listSach){
            System.out.print(s.toString());
        }
    }
    
    public static void laySach(){
        for (Sach s : listSach){
            if (s.getNamxuatban() < 2015){
                System.out.print(s);
            }
        }
    }
    
    public static void timSach(){
        for (Sach s : listSach){
            if (s.getTensach().contains("Lap trinh")){
                System.out.print(s);
            }
        }
    }
    
    public static void sapXep(){
        Collections.sort(listSach, (Sach s1, Sach s2) -> Double.compare(s2.getGiabia(), s1.getGiabia()));
    }
    
    public static void xoaSach(String masach){
        listSach.removeIf(s -> s.getMasach().equals(masach));
    }
    
    public static void suaGia(String masach, double giabia){
        for (Sach s : listSach) {
            if (s.getMasach().equals(masach)) {
                double giaMoi = 0;
                s.setGiabia(giaMoi);
                break;
            }
        }
    }
    
    public static double tinhTong(){
        double tong = 0;
        for (Sach s : listSach){
            tong += s.getGiabia();
        }
        return tong;
    }

    private static void suaGia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void xoaSach() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
