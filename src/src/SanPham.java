public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuongTon;

    // 1. Constructor không tham số[cite: 4]
    public SanPham() {
    }

    // 2. Constructor 2 tham số[cite: 4]
    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    // 3. Constructor đủ 4 tham số (sử dụng this để gọi constructor 2 tham số)[cite: 4]
    public SanPham(String maSP, String tenSP, double donGia, int soLuongTon) {
        this(maSP, tenSP);
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    // Getter và Setter[cite: 4]
    public String getMaSP() { return maSP; }
    public void setMaSP(String maSP) { this.maSP = maSP; }

    public String getTenSP() { return tenSP; }
    public void setTenSP(String tenSP) { this.tenSP = tenSP; }

    public double getDonGia() { return donGia; }
    public void setDonGia(double donGia) { this.donGia = donGia; }

    public int getSoLuongTon() { return soLuongTon; }
    public void setSoLuongTon(int soLuongTon) { this.soLuongTon = soLuongTon; }

    // Phương thức hiển thị thông tin sản phẩm[cite: 4]
    public void hienThi() {
        System.out.printf("%-6s %-16s %10.0f   tồn %d\n", maSP, tenSP, donGia, soLuongTon);
    }
}