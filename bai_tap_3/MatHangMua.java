package bai_tap_3;

public class MatHangMua {
    private int soLuong, matHangMuaID;
    private HoaDon hd; 
    private MatHang mh;

    public MatHangMua(int soLuong, int matHangMuaID, HoaDon hd, MatHang mh) {
        this.soLuong = soLuong;
        this.matHangMuaID = matHangMuaID;
        this.hd = hd;
        this.mh = mh;
    }
    
    public void ThemMatHangMuaCuaHoaDon(MatHangMua mhm, MatHang mh){
        hd.ThemHoaDon(this,mh);
    }
    public int getSoLuong(){
        return soLuong;
    }
    
}
