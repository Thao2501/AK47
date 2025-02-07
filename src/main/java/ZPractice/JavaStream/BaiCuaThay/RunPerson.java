package ZPractice.JavaStream.BaiCuaThay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RunPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Luke Skywalker", 172, 77, "blond", "fair", "blue", "19BBY", "male");
        Person person2 = new Person("Darth Vader", 202, 136, "none", "white", "yellow", "41.9BBY", "male");
        Person person3 = new Person("Leia Organa", 150, 49, "brown", "light", "brown", "19BBY", "female");
        Person person4 = new Person("Owen Lars", 178, 120, "brown, grey", "light", "blue", "52BBY", "male");
        Person person5 = new Person("Beru Whitesun lars", 165, 75, "brown", "light", "blue", "47BBY", "female");
        Person person6 = new Person("Biggs Darklighter", 183, 84, "black", "light", "brown", "24BBY", "male");
        Person person7 = new Person("Obi-Wan Kenobi", 182, 77, "auburn, white", "fair", "blue-gray", "57BBY", "male");

        //Convert JSON ARRAY TO ARRAY OBJECT
        List<Person> characters = Arrays.asList(person1, person2, person3, person4, person5, person6, person7);
        characters.forEach(Person::info);

        //Làm sao tìm được các đối tượng mà có `mass` lớn hơn 100

        List<Person> personHasMassGreater100 = characters
                .stream()
                .filter(person -> person.getMass() > 100)
                .collect(Collectors.toList());

        personHasMassGreater100.forEach(Person::info);

        //total mass off all characters

        int totalMass = characters
                .stream()
                .mapToInt(Person::getMass)
                .sum();

        System.out.println("tong la: "+ totalMass);

        //Find Max mass person

        Person maxMass = characters.stream().max(Comparator.comparingInt(Person::getMass)).get();
        System.out.println("max la: "+ maxMass);

        //sort by name

        List<Person> sortPerson = characters.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());

        System.out.println(sortPerson);
    }

}
