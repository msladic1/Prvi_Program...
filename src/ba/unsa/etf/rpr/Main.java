package ba.unsa.etf.rpr;
/*Primjer: Napišite program koji omogućuje unos broja n, a zatim na ekranu ispisuje sve brojeve između 1 i n koji su djeljivi
sa sumom svojih cifara. U programu napravite pomoćnu funkciju za izračunavanje sume cifara cijelog broja (int).*/
import java.util.Scanner;
public class Main {
    static int djeljivi(int n){
        int suma = 0, cifra, pom = n;
        while(pom!=0){
            cifra = pom%10;
            suma = suma + cifra;
            pom = pom/10;
        }
        if(n%suma == 0)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
	    int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();
        for(int i=1; i<=n; i++){
            if(djeljivi(i) == 1){
                System.out.print(i + " ");
            }
        }
    }
}
