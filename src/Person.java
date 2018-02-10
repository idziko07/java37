public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws Exception{
        this.firstName = firstName;
        if(this.firstName.equals(null) || this.firstName.length() == 0)
            throw new NullPointerException();
        if(this.firstName.length() < 2)
            throw new NameUndefinedException("Imię jest za krótkie powinno mieć wiecej niż 2 znaki");


        this.lastName = lastName;
        if (this.lastName.equals(null) || this.lastName.length() == 0)
            throw new NullPointerException();
        if(this.lastName.length() < 2)
            throw new NameUndefinedException("Nazwisko jest za krótkie powinno mieć wiecej niż 2 znaki");

        this.age = age;
        if(age < 1)
            throw new IncorrectAgeException("Wiek powinnien być wiekszy od 0");

        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + pesel;
    }
}
