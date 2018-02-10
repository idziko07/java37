import java.util.Locale;
import java.util.Scanner;

public class Load {

    public Person add(){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj imie:");
        String firstName;
        firstName = input.nextLine();

        System.out.println("Podaj nazwisko:");
        String lastName;
        lastName = input.nextLine();

        System.out.println("Podaj wiek:");
        int age;
        age = input.nextInt();

        System.out.println("Podaj pesel:");
        int pesel;
        pesel = input.nextInt();

        Person person = new Person(firstName,lastName,age,pesel);
        return person;
    }
}
