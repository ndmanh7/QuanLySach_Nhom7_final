/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

/**
 *
 * @author ADMIN
 */
public class ThongKe {
    private int soLuongTrongKho;
    private int soLuongNguoiMua;
    private int soSachDangChoMuon;

    public ThongKe() {
    }

    public ThongKe(int soLuongTrongKho, int soLuongNguoiMua, int soSachDangChoMuon) {
        this.soLuongTrongKho = soLuongTrongKho;
        this.soLuongNguoiMua = soLuongNguoiMua;
        this.soSachDangChoMuon = soSachDangChoMuon;
    }

    public int getSoLuongTrongKho() {
        return soLuongTrongKho;
    }

    public void setSoLuongTrongKho(int soLuongTrongKho) {
        this.soLuongTrongKho = soLuongTrongKho;
    }

    public int getSoLuongNguoiMua() {
        return soLuongNguoiMua;
    }

    public void setSoLuongNguoiMua(int soLuongNguoiMua) {
        this.soLuongNguoiMua = soLuongNguoiMua;
    }

    public int getSoSachDangChoMuon() {
        return soSachDangChoMuon;
    }

    public void setSoSachDangChoMuon(int soSachDangChoMuon) {
        this.soSachDangChoMuon = soSachDangChoMuon;
    }
    
    
}
