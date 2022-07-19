package collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static String don(String text) {

        return Arrays.stream(text.split("")).distinct().reduce("", (x, y) -> x + y);
    }

    public static void main(String[] args) {

        User user1 = new User("James", "Gosling", 63);
        User user2 = new User("Ken", "Thompson", 75);
        User user3 = new User("Richard", "Stallman", 65);

        List<User> userList = new ArrayList<User>();
        userList.stream().filter(user -> (user.getLastname().contains("a") && (user.getAge()==(65))) ).collect(Collectors.toList()).forEach(System.out::println);
    }
}
