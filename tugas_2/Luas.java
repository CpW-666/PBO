package tugas_2;

public class Luas {
    public static void main(String[] args) {

        int sisi = 5; 
        int luasPersegi = sisi * sisi;
        int kelilingPersegi = 4 * sisi;
        System.out.println("Luas persegi: " + luasPersegi);
        System.out.println("Keliling persegi: " + kelilingPersegi);

        
        int alas = 6;
        int tinggi = 4;
        int luasSegitiga = (alas * tinggi) / 2; 
        System.out.println("Luas segitiga: " + luasSegitiga);
        
        
        float jariJari = 7f;
        float phi = 22f / 7f; 
        float luasLingkaran = phi * jariJari * jariJari;
        float kelilingLingkaran = 2 * phi * jariJari;
        System.out.println("Luas lingkaran: " + luasLingkaran);
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
        
        
        int volumeKubus = sisi * sisi * sisi;
        int luasPermukaanKubus = 6 * (sisi * sisi);
        System.out.println("Volume kubus: " + volumeKubus);
        System.out.println("Luas permukaan kubus: " + luasPermukaanKubus);
    }
}