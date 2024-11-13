package bai_tap_3;

public class main {
    public static void main(String[] args) {
        //Thêm 3 mặt hàng X,Y,Z vào kho;
        MatHang mathangX = new MatHang(501,100,"X",20000);
        mathangX.ThemMatHangVaoKho();
        MatHang mathangY = new MatHang(502,130,"Y",25000);
        mathangY.ThemMatHangVaoKho();
        MatHang mathangZ = new MatHang(503,150,"Z",30000);
        mathangZ.ThemMatHangVaoKho();


        //Thêm 1 hóa đơn cho khách hàng Nguyễn Văn A, biết rằng khách hàng này đã mua 2 mặt hàng tên X,Y
        KhachHang khachhang_A = new KhachHang(1101,"Ha Noi","Nguyen Van A");

        HoaDon hoadonA = new HoaDon(111,"13/11/2024",khachhang_A);

        MatHangMua mhmX = new MatHangMua(20, mathangX.getMatHangID(), hoadonA, mathangX);
        MatHangMua mhmY = new MatHangMua(20, mathangY.getMatHangID(), hoadonA, mathangY);

        mhmX.ThemMatHangMuaCuaHoaDon(mhmX,mathangX);
        mhmY.ThemMatHangMuaCuaHoaDon(mhmY,mathangY);

      
        System.out.println("Hóa đơn của Nguyễn Văn A:");
        hoadonA.InHoaDon();
        //In ra thông tin hóa đơn Nguyễn Văn A đã mua
    }
}
