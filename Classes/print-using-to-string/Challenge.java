package Classes.print-using-to-string;

public class Challenge {
    private String name;
    private String  age;

    public Challenge(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
         return ("Name=>" + name + " and " + "Age=>" + age);
    }
}
