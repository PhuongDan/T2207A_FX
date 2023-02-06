public class Sdt {
    String ten;
    String sodienthoai;

    public Sdt(String ten,String sodienthoai) {
        this.ten = ten;
        this.sodienthoai = sodienthoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public String toString(){
        return this.ten+"--"+this.sodienthoai;
    }
}
