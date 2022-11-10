import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        double boy,kilo,indeks;

        System.out.print("Kilonuzu Giriniz: ");
        kilo=inp.nextDouble();

        System.out.print("Boyunuzu Giriniz: ");
        boy=inp.nextDouble();

        indeks= kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: "+ indeks);

    }
}