import java.util.Arrays;

public class odev25102025 {
    public static void main(String[] args) {

        int[] sayilar = {25, 9, 11, 20, 27, 14, 2025, 7, 8, 10, 52, 16, 36, 21, 91, 45, 63, 89, 78, 17, 51, 68, 76, 79, 83, 67, 47, 23, 55, 15, 53, 38, 73, 2011, 49, 92, 39, 28, 103, 225, 144, 169, 300, 500, 97, 777, 234, 123, 151, 326};

        Arrays.sort(sayilar);

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        }
    }
}