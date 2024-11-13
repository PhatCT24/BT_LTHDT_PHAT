package bai_tap_3;

import java.util.ArrayList;

public class MatHang {
	private int MatHangID, soLuong;
	private String tenMH;
    private float gia;
    private static ArrayList<MatHang> mathang = new ArrayList<>(); 
    
    public MatHang(int matHangID, int soLuong, String tenMH, float gia) {
  		this.MatHangID = matHangID;
  		this.soLuong = soLuong;
  		this.tenMH = tenMH;
  		this.gia = gia;
  	}
    
    public void ThemMatHangVaoKho() {
    	mathang.add(this);    
    }
    public int getMatHangID(){
        return MatHangID;
    }
    public float getGia(){
        return gia;
    }
    
}
