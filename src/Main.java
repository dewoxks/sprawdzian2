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
 System.out.println("Witaj mam na imię " + name + "a na naziwsko mam " + surname );


        
    }
}