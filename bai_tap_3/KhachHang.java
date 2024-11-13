package bai_tap_3;

import java.util.ArrayList;
import java.util.List;

public class KhachHang {
    private int KhachHangID;
    private String tenKH, diaChi;
    private List<HoaDon> danhSachHoaDon = new ArrayList<>();
    
    public KhachHang(int KhachHangID, String tenKH, String diaChi) {
        this.KhachHangID = KhachHangID;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
    }
    
    public void themHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }
	@Override 
	public String toString() {
		return  "\n" +"-Tên Khách hàng: " + tenKH  + "\n"
				+ "-Mã Khách hàng: " + KhachHangID + "\n" 
				+ "-Địa chỉ Khách Hàng: " + diaChi;
	}
