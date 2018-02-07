import java.util.Locale;
import java.util.Scanner;

public class Load {

    public Person add(){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj imie:");
        String firstName;
        firstName = input.nextLine();
        if(firstName.length() == 0)
            throw new NameUndefinedException("Imie jest nullem");
        if(firstName.length() < 2)
            throw new NameUndefinedException("Imię jest za krótkie powinno mieć wiecej niż 2 znaki");


        System.out.println("Podaj nazwisko:");
        String lastName;
        lastName = input.nextLine();
        if(lastName.length() == 0)
            throw new NameUndefinedException("Nazwisko jest nullem");
        if(lastName.length() < 2)
            throw new NameUndefinedException("Nazwisko jest za krótkie powinno mieć wiecej niż 2 znaki");

        System.out.println("Podaj wiek:");
        int age;
        age = input.nextInt();
        if(age < 1)
            throw new IncorrectAgeException("Wiek powinnien być wiekszy od 0");

        System.out.println("Podaj pesel:");
        int pesel;
        pesel = input.nextInt();

        Person person = new Person(firstName,lastName,age,pesel);

        return person;
    }
}
