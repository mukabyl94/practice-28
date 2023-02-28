import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>();
//        Random ran = new Random();
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        integers.add(ran.nextInt(10));
//        System.out.println(integers);
//        int i = (int) integers.stream().filter(x -> x%2 == 0).count();
//        System.out.println(i);

//        List<String> strings = new ArrayList<>();
//        strings.add("Tom");
//        strings.add("Jon");
//        strings.add("Jack");
//        strings.add("Lukas");
//        strings.add("James");
//        strings.add("Oliver");
//        strings.add("Elijah");
//        strings.stream().filter(s ->s.startsWith("J")).forEach(System.out::println);
//        strings.stream().filter(s ->s.indexOf("J") == 0).forEach(System.out::println);


        List<User> users = new ArrayList<>();
        users.add(new User("Jon", 1998));
        users.add(new User("Oliver", 1996));
        users.add(new User("Elijah", 2005));
        users.add(new User("Justin", 2006));
        users.add(new User("James", 2011));
        users.add(new User("Lukas", 2009));
        users.add(new User("Tomi", 2010));
        users.add(new User("Barack", 1997));
        users.add(new User("Henry", 2008));
        users.stream().map(age -> 2023 - age.getYearOfBirth()).collect(Collectors.toList());
        System.out.println(users.stream().map(age2 -> 2023 - age2.getYearOfBirth() > 18 ? "Jashy jetken" : "jashy jete elek").collect(Collectors.toList()));
        System.out.println(users.stream().filter(age2 -> 2023 - age2.getYearOfBirth() > 18).count());
    }
}