public class Main {
    public static void main(String[] args) {
        // 1. Tạo Bàn phím cơ và Chuột không dây bằng constructor đủ tham số[cite: 3, 5]
        SanPham banPhim = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham chuotKhongDay = new SanPham("SP02", "Chuột không dây", 200000, 50);

        // 2. Tạo Tai nghe bằng constructor 2 tham số, dùng setter đặt giá và tồn kho[cite: 3, 5]
        SanPham taiNghe = new SanPham("SP03", "Tai nghe");
        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);

        // In danh sách sản phẩm
        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuotKhongDay.hienThi();
        taiNghe.hienThi();
        System.out.println();

        // 3. Lập 3 đơn hàng theo kịch bản[cite: 3, 5]
        DonHang don1 = new DonHang("An", banPhim, 2);       // An mua 2 bàn phím
        DonHang don2 = new DonHang("Bình", chuotKhongDay, 5); // Bình mua 5 chuột (được giảm 10%)
        DonHang don3 = new DonHang("Chi", taiNghe, 0);       // Chi mua tai nghe nhưng nhập nhầm số lượng 0 (tự sửa thành 1)

        // 4. In danh sách đơn hàng[cite: 3, 5]
        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-7s %-16s %-4s %10s\n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        don1.inDonHang();
        don2.inDonHang();
        don3.inDonHang();
    }
}