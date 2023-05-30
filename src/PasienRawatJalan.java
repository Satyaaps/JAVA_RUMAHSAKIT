public class PasienRawatJalan extends Pasien {
    private double biayaKonsultasi;

    public PasienRawatJalan(int id, String nama, String alamat, double biayaKonsultasi) {
        super(id, nama, alamat);
        this.biayaKonsultasi = biayaKonsultasi;
    }

    public double hitungBiayaRawatJalan() {
        return biayaKonsultasi;
    }

}