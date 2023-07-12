public class Mobil {
    String warna = "Merah";
    String merk = "BMW";

    void maju (){
        System.out.println("Mobil" + merk + "warna" + warna + "bergerak maju");
    }
    void mundur (){
        System.out.println("Mobil" +merk + "warna" + warna + "bergerak mundur");
    }
    public static void main(String[]args) {
        // Membuat object mobilSaya
        Mobil mobilSaya = new Mobil();

        // Memanggil Object
        mobilSaya.maju();
        mobilSaya.mundur();
    }
}

