public class Main {
    public static void main(String[] args) {

    int[] list = {1,5,7,58,52,47,52,12,74,102,3,52,74};
    int toplam = 0;
    for (int i : list){
        toplam += i;
    }

        System.out.println("Dizi boyutu :"+list.length);
        System.out.println("Dizi toplamı :"+toplam);
        System.out.println("Dizi ortalaması :"+toplam/list.length);

    }
}