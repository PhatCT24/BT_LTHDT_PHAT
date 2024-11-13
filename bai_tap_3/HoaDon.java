package bai_tap_3;

import java.util.ArrayList;

public class HoaDon {
    private int HoaDonID; 
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    private ArrayList<MatHangMua> MHMList = new ArrayList<>();

    public HoaDon(int HoaDonID,String ngayBan, KhachHang kh) {
    	this.HoaDonID = HoaDonID;
        this.ngayBan = ngayBan;
        this.tongTien = 0;
        this.kh = kh;
    }
   
    public void ThemHoaDon(MatHangMua matHangMua, MatHang mh){
        MHMList.add(matHangMua);
        this.tongTien += matHangMua.getSoLuong() * mh.getGia();
    }
    
    public void InHoaDon() {
    	System.out.println("ID hóa đơn: " + HoaDonID + "\n"
    			+ "Ngày bán: " + ngayBan + "\n"
    			+ "Tổng tiền: "  + (int) tongTien + "\n"
    			+ "Khách Hàng: " + kh);
    }
   
}
