public class DonHang {
    private String tenKhach;
    private SanPham sanPham;
    private int soLuong;

    // Constructor nhận đủ 3 giá trị, tự động sửa số lượng thành 1 nếu nhỏ hơn 1[cite: 4]
    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    // Phương thức tính thành tiền (mua từ 5 cái trở lên giảm 10%)[cite: 3, 4]
    public double tinhThanhTien() {
        double thanhTien = sanPham.getDonGia() * soLuong;
        if (soLuong >= 5) {
            thanhTien *= 0.9; // Giảm 10%
        }
        return thanhTien;
    }

    // Phương thức in thông tin đơn hàng[cite: 4]
    public void inDonHang() {
        System.out.printf("%-7s %-16s %-4d %10.0f\n", tenKhach, sanPham.getTenSP(), soLuong, tinhThanhTien());
        if (soLuong >= 5) {
            System.out.println("       (đã giảm 10%)");
        }
    }
}