import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factN = 1, factR = 1, factD=1;
        System.out.println("Kombinasyon hesabi icin degerleri giriniz ! C(n,r) ");
        System.out.print("n :");
        int n = sc.nextInt();
        System.out.print("r :");
        int r = sc.nextInt();

        if (n >= r) {
            for (int i = 1; i <= n; i++)
                factN *= i;
            for (int j = 1; j <= r; j++)
                factR *= j;
            for(int k =1; k<=(n-r);k++)
                factD *=k;
            int result=factN/(factR*factD);
            System.out.println("C(n,r) = "+result);
        } else {
            System.out.println("n degeri r den kucuk olamaz!!");
        }

    }
}
