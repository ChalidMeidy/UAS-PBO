public class WarungPadangBeraksi {
    public static void main(String[] args) {
        WarungPadang AyamGulai = new WarungPadang();
        AyamGulai.makanan = "Ayam Gulai + Minum";
        AyamGulai.minuman = "Es Teh Manis";
        AyamGulai.harga   = 20000;
        AyamGulai.kategori= "Paket Hemat";

        WarungPadang Rendang = new WarungPadang();
        Rendang.makanan = "Rendang + Minum";
        Rendang.minuman = "Es Teh Manis";
        Rendang.harga   = 23000;
        Rendang.kategori= "Paket Hemat";

        System.out.println(AyamGulai.harga);
        System.out.println(AyamGulai.harga + Rendang.harga);
    }
}
