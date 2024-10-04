import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);
 System.out.println("Podaj Swoje Imię");
 String name = scanner.nextLine();
 System.out.println("Podaj Swoje Nazwisko");
 String surname = scanner.nextLine();
 System.out.println("W jakeij jesteś klasie");
 String Klasa = scanner.nextLine();
 System.out.println("Ile masz lat");
 int age = scanner.nextInt();
 System.out.println("Witaj mam na imię " + name + " a na naziwsko mam " + surname + " i chodzędo do  klasy " + Klasa + " i jeszcze mam " + age + " lat ");




        
    }
}