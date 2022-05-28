/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class DataIO {
    public static ArrayList<Sach> dsSach = new ArrayList<>();
    public static ArrayList<HoaDon> dsHoaDon = new ArrayList<>();
    public static ArrayList<NguoiMua> dsNguoiMua = new ArrayList<>();
    public static ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
    public static ArrayList<TaiKhoan> dsTaiKhoan = new ArrayList<>();
    
    public static void loadSach(){
        FileReader freader = null;
	BufferedReader buffer = null;
		
	File file = new File("src\\sach.txt");
		
	try {
		freader = new FileReader(file);
		buffer = new BufferedReader(freader);
		String line;
		while((line = buffer.readLine()) != null) {
			if(line.startsWith("#")) continue;
			String parts[] = line.split(";");
			String maSach = parts[0];
                        String tenSach = parts[1];
                        String theLoai = parts[2];
                        String tacGia = parts[3];
                        int soLuongCon = Integer.parseInt(parts[4]);
                        int donGia = Integer.parseInt(parts[5]);
                        String tinhTrang = parts[6];
			Sach sach = new Sach(maSach,tenSach,theLoai,tacGia,soLuongCon,donGia,tinhTrang);
                        dsSach.add(sach);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(freader != null) freader.close();
			} catch (Exception e2) {
			}
		}
    }
    
    public static void writeSach(){
        FileWriter fwriter = null;
	BufferedWriter buffer = null;
		
	File file = new File("src\\sach.txt");
		
	try {
		fwriter= new FileWriter(file);
		buffer = new BufferedWriter(fwriter);
		String line;
		for (int i = 0; i < dsSach.size(); i++) {
                Sach sach = dsSach.get(i);
                line = sach.getMaSach()+";"+sach.getTenSach()+";"+sach.getTheLoai()
                        +";"+sach.getTacGia()+";"+sach.getSoLuongCon()+";"
                        +sach.getDonGia()+";"+sach.getTinhTrang();
                
                buffer.write(line);
                buffer.newLine();
            }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(fwriter != null) fwriter.close();
			} catch (Exception e2) {
			}
		}
    }
    
    
    
    public static void loadNguoiMua(){
        FileReader freader = null;
	BufferedReader buffer = null;
		
	File file = new File("src\\nguoimua.txt");
		
	try {
		freader = new FileReader(file);
		buffer = new BufferedReader(freader);
		String line;
		while((line = buffer.readLine()) != null) {
			if(line.startsWith("#")) continue;
			String parts[] = line.split(";");
			String maNguoiMua = parts[0];
                        String tenNguoiMua = parts[1];
                        String soDienThoai = parts[2];
                        String diaChi = parts[3];
                        String email = parts[4];
			
                        NguoiMua nguoiMua = new NguoiMua(maNguoiMua,tenNguoiMua,soDienThoai,diaChi,email);
                        dsNguoiMua.add(nguoiMua);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(freader != null) freader.close();
			} catch (Exception e2) {
			}
		}
    }
    
    public static void writeNguoiMua(){
        FileWriter fwriter = null;
	BufferedWriter buffer = null;
		
	File file = new File("src\\nguoimua.txt");
		
	try {
		fwriter= new FileWriter(file);
		buffer = new BufferedWriter(fwriter);
		String line;
		for (int i = 0; i < dsNguoiMua.size(); i++) {
                NguoiMua nguoiMua = dsNguoiMua.get(i);
                line = nguoiMua.getMaNguoiMua()+";"+nguoiMua.getTenNguoiMua()+";"+
                        nguoiMua.getSoDienThoai()+";"+nguoiMua.getDiaChi()+";"+nguoiMua.getEmail();
                
                buffer.write(line);
                buffer.newLine();
            }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(fwriter != null) fwriter.close();
			} catch (Exception e2) {
			}
		}
    }
    
    public static void loadHoaDon(){
        FileReader freader = null;
	BufferedReader buffer = null;
		
	File file = new File("src\\hoadon.txt");
		
	try {
		freader = new FileReader(file);
		buffer = new BufferedReader(freader);
		String line;
		while((line = buffer.readLine()) != null) {
			if(line.startsWith("#")) continue;
			String parts[] = line.split(";");
			String maHoaDon = parts[0];
                        String maNguoiMua = parts[1];
                        String maSach = parts[2];
                        String ngayMua = parts[3];
                        int soLuongMua = Integer.parseInt(parts[4]);
                        int thanhTien = Integer.parseInt(parts[5]);
                        
                        HoaDon hoaDon = new HoaDon(maHoaDon,maNguoiMua,maSach,ngayMua,soLuongMua,thanhTien);
			dsHoaDon.add(hoaDon);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(freader != null) freader.close();
			} catch (Exception e2) {
			}
		}
    }
    
    public static void writeHoaDon(){
        FileWriter fwriter = null;
	BufferedWriter buffer = null;
		
	File file = new File("src\\hoadon.txt");
		
	try {
		fwriter= new FileWriter(file);
		buffer = new BufferedWriter(fwriter);
		String line;
		for (int i = 0; i < dsHoaDon.size(); i++) {
                HoaDon hoaDon = dsHoaDon.get(i);
                line = hoaDon.getMaHoaDon()+";"+hoaDon.getMaNguoiMua()+";"+hoaDon.getMaSach()+";"+
                        hoaDon.getNgayMua()+";"+hoaDon.getSoLuongMua()+";"+hoaDon.getThanhTien();
                
                buffer.write(line);
                buffer.newLine();
            }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(fwriter != null) fwriter.close();
			} catch (Exception e2) {
			}
		}
    }
    
    
    public static void loadNhanVien(){
        FileReader freader = null;
	BufferedReader buffer = null;
		
	File file = new File("src\\nhanvien.txt");
		
	try {
		freader = new FileReader(file);
		buffer = new BufferedReader(freader);
		String line;
		while((line = buffer.readLine()) != null) {
			if(line.startsWith("#")) continue;
			String parts[] = line.split(";");
			String maNhanVien = parts[0];
                        String tenNhanVien = parts[1];
                        String taiKhoan = parts[2];
                        String ngayVaoLam = parts[3];
                        int soNgayNghi = Integer.parseInt(parts[4]);
                        
			
                        NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien,taiKhoan, ngayVaoLam, soNgayNghi);
                        dsNhanVien.add(nhanVien);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(freader != null) freader.close();
			} catch (Exception e2) {
			}
		}
    }
    
    public static void writeNNhanVien(){
        FileWriter fwriter = null;
	BufferedWriter buffer = null;
		
	File file = new File("src\\hoadon.txt");
		
	try {
		fwriter= new FileWriter(file);
		buffer = new BufferedWriter(fwriter);
		String line;
		for (int i = 0; i < dsNhanVien.size(); i++) {
                NhanVien nhanVien = dsNhanVien.get(i);
                line = nhanVien.getMaNhanVien()+";"+nhanVien.getTenNhanVien()+";"+nhanVien.getTaiKhoan()+";"+nhanVien.getNgayVaoLam()+";"+
                        nhanVien.getSoNgayNghi();
                
                buffer.write(line);
                buffer.newLine();
            }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(fwriter != null) fwriter.close();
			} catch (Exception e2) {
			}
		}
    }
    
    public static void loadTaiKhoan(){
        FileReader freader = null;
	BufferedReader buffer = null;
		
	File file = new File("src\\taikhoan.txt");
		
	try {
		freader = new FileReader(file);
		buffer = new BufferedReader(freader);
		String line;
		while((line = buffer.readLine()) != null) {
			if(line.startsWith("#")) continue;
			String parts[] = line.split(";");
			String taiKhoan = parts[0];
                        String matKhau = parts[1];
                        
                        
                        TaiKhoan taiKhoan1 = new TaiKhoan(taiKhoan,matKhau);
			dsTaiKhoan.add(taiKhoan1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(buffer != null)	buffer.close();
				if(freader != null) freader.close();
			} catch (Exception e2) {
			}
		}
    }
    
    public static void loadData(){
        loadSach();
        loadHoaDon();
        loadNguoiMua();
    }
}
