import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class LowerBoundedWildcardDemo {

    // Write operation using ? super Dog
    public static void addDogs(List<? super Dog> list) {
        list.add(new Dog());
        list.add(new Dog());

        System.out.println("Dogs added successfully.");
    }

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        addDogs(animals);

        for (Object obj : animals) {
            ((Animal) obj).sound();
        }
    }
}