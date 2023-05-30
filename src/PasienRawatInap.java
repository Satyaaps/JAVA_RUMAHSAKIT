public class PasienRawatInap extends Pasien {
    private double biayaKamarPerHari;
    private int jumlahHari;

    public PasienRawatInap(int id, String nama, String alamat, double biayaKamarPerHari, int jumlahHari) {
        super(id, nama, alamat);
        this.biayaKamarPerHari = biayaKamarPerHari;
        this.jumlahHari = jumlahHari;
    }

    public double hitungBiayaRawatInap() {
        return biayaKamarPerHari * jumlahHari;
    }
}