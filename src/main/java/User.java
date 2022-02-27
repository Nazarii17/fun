import java.util.ArrayList;
import java.util.List;

public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    int birthDate;
    String sex;
    List<User> friends;
    Car car;

    public void sayHello() {
        System.out.println("\nhi! \nI'm " + firstName);
    }

    public void doSomethingToOtherUser(User user) {
        if (firstName.equals(user.firstName)) {
            System.out.println("\nI'm " + this.firstName + " (" + this.sex + ")" + "\nI fuck myself");
            return;
        }
        if (!sex.equals(user.sex)) {
            if (sex.equals("MALE")) {
                System.out.println("\nI'm " + this.firstName + " (" + this.sex + ")" + "\nI fuck " + user.firstName);
            } else if (sex.equals("FEMALE")) {
                System.out.println("\nI'm " + this.firstName + " (" + this.sex + ")" + "\nI'm fucked by " + user.firstName);
            }
        } else {
            System.out.println("\nI'm " + this.firstName + " (" + this.sex + ")" + "\nI drink with " + user.firstName + " (" + this.sex + ")");
        }
    }

    public static User createInstance(String firstName,
                                      String lastName,
                                      String email,
                                      int age,
                                      int birthDate,
                                      String sex) {
        User newInstance = new User();

        newInstance.firstName = firstName;
        newInstance.lastName = lastName;
        newInstance.email = email;
        newInstance.age = age;
        newInstance.birthDate = birthDate;
        newInstance.sex = sex;

        return newInstance;
    }

    public void makeFriendship(User user) {
        if (friends == null) {
            friends = new ArrayList<>();
        }
        this.friends.add(user);
        System.out.println("\nI'm " + this.firstName + ", in friendship with " + user.firstName);
    }

    public void showFriends() {
        if (this.friends != null && !this.friends.isEmpty()) {
            for (User user : this.friends) {
                System.err.println("\nSnizhanna's friend " + user.firstName);
            }
        } else {
            System.err.println("\nMy neme is " + firstName + " I' lonely");
        }
    }
}
