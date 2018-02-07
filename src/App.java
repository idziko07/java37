public class App {
    public static void main(String[] args) {
        Load load = new Load();
        Person person;

        try {
            person = load.add();
            System.out.println(person.toString());
        }catch (NameUndefinedException e){
            System.out.println(e.getMessage());
        }catch (IncorrectAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
