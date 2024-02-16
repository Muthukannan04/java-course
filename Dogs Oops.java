import java.util.*;

class Dog {
    String name;
    String breed;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dog d[] = new Dog[n];
        String name, breed;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            d[i] = new Dog(); 
            name = sc.next();
            breed = sc.next();
            d[i].setName(name);
            d[i].setBreed(breed);
            if (breed.equals("Labrador")) {
                System.out.println(d[i].getName() + " is a " + d[i].getBreed() + " which is arrogant");
            } else {
                System.out.println(d[i].getName() + " is a " + d[i].getBreed() + " which is nice");
            }
        }
    }
}
