public class AsalSayilar {
    public static void main(String[] args) {

        String Asalsayilar = "";

        for (int i = 1; i <= 100; i++) {
            int sayac = 0;
            for (int k = i; k >= 1; k--) {
                if (i % k == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                Asalsayilar = Asalsayilar + i + " ";
            }
        }
        System.out.println(Asalsayilar);
    }
}
