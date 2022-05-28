/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

/**
 *
 * @author ADMIN
 */
public class NguoiMua {
    private String maNguoiMua;
    private String tenNguoiMua;
    private String soDienThoai;
    private String diaChi;
    private String email;

    public NguoiMua() {
    }

    public NguoiMua(String maNguoiMua, String tenNguoiMua, String soDienThoai, String diaChi, String email) {
        this.maNguoiMua = maNguoiMua;
        this.tenNguoiMua = tenNguoiMua;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.email = email;
    }

    public String getMaNguoiMua() {
        return maNguoiMua;
    }

    public void setMaNguoiMua(String maNguoiMua) {
        this.maNguoiMua = maNguoiMua;
    }

    public String getTenNguoiMua() {
        return tenNguoiMua;
    }

    public void setTenNguoiMua(String tenNguoiMua) {
        this.tenNguoiMua = tenNguoiMua;
    }

    

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
