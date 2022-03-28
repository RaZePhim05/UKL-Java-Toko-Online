public class Tokoonline {
    public static void main(String[] args){
        Member member= new Member();
        Karyawan karyawan= new Karyawan();
        Laporan lapor= new Laporan();
        Transaksi transaksi= new Transaksi();
        Barang brng= new Barang();
        lapor.laporan(brng);
        lapor.laporan(member);
        lapor.laporan(transaksi, brng);
        transaksi.prosesTransaksi(member, transaksi, brng);
        lapor.laporan(transaksi, brng);
        lapor.laporan(brng);
        lapor.laporan(member);

    }
}
