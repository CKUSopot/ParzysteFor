import java.util.Scanner;
/**
 * 8. Używając instrukcji for() napisz program ParzysteFor, który wypisze liczby
 * parzyste z przedziału od 2 do wartości podanej przez użytkownika.
 */
public class ParzysteFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        for(int i = 2; !(liczba < i); i += 2){
            System.out.println("i = " + i);
        }
    }
}
