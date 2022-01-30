import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dog {
    private String breed;
    private int age;
    private String name;

    public Dog(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }

    public Dog(String name) {
        this ("metis", 2, name);
    }

    private void woof(){
        System.out.println("Woof woof woof");
    }

    public void listen(String s){
        Pattern pattern = Pattern.compile("\\bed.*a\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            woof();
        }
    }
}