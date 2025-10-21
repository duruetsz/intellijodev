import java.util.Scanner;

class gecipkalmadurumu {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("birinci notu giriniz");
        int birinci = Scanner.nextInt();

        System.out.print("ikinci notu girin");
        int ikinci = Scanner.nextInt();

        double not = (birinci * 0.4) + (ikinci * 0.6);

        if (not >= 75) {
            System.out.print("geçtiniz");
        } else {
            System.out.print("kaldınız");
        }

    }
}