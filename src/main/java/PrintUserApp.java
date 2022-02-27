import java.util.List;

public class PrintUserApp {

//    public static void main(String[] args) {
//
//        User snizhanna = User.createInstance("Snizhanna","Osadets","\"snizhanna@gmail.com\"",18,1998,"FEMALE");
//        User bohdan = User.createInstance("Bohdan","Osadets","bohdan@gmail.com",18,1998,"MALE");
//        User stepan = User.createInstance("Stepan","Posadets","bohdan@gmail.com",18,1998,"MALE");
//
//        printUser(snizhanna);
//        printUser(bohdan);
//        printUser(stepan);
//
//        snizhanna.sayHello();
//        bohdan.sayHello();
//        stepan.sayHello();
////        bohdan.doSomethingToOtherUser(snizhanna);
////        snizhanna.doSomethingToOtherUser(bohdan);
////        snizhanna.doSomethingToOtherUser(snizhanna);
////        bohdan.doSomethingToOtherUser(bohdan);
//        bohdan.doSomethingToOtherUser(stepan);
//
//        snizhanna.makeFriendship(bohdan);
//        snizhanna.makeFriendship(stepan);
//
//        System.out.println("Snizhanna's friends quantity " + snizhanna.friends.size());
//
//        snizhanna.showFriends();
//        bohdan.showFriends();
//
//    }

    private static void printUser(User user) {
        System.out.println(user.firstName + " " + user.lastName + " ");
    }
}
