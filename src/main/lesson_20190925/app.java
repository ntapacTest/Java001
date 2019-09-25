package main.lesson_20190925;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("name1", 20));
        userList.add(new User("name2", 25));
        userList.add(new User("name3", 30));
        userList.add(new User("name4", 35));
        userList.add(new User("name5", 40));
        userList.add(new User("name6", 45));
        userList.add(new User("name7", 50));
        userList.add(new User("name8", 55));

        MyFunc func = () -> System.out.println("my func");

        func.doSmth();

        MyFunc2<User> func2 = (user) -> {
            System.out.println(user);
            return user;
        };

        func2.doSmth(new User("Func2 User", 30));

        // Using optional

        UserRepo repo=new UserRepo();
        repo.addUser(new User("Name0",20));
        repo.addUser(new User("Name1",25));
        repo.addUser(new User("Name2",30));
        repo.addUser(new User("Name3",35));
        repo.addUser(null);

        System.out.println(repo.getUser(3).getAge());
        // System.out.println(repo.getUser(4).getAge()); // error NullPointerException
        System.out.println(repo.getUserOptional(4).getAge());
        System.out.println(repo.getUserOptional2(4).getAge());


    }
}
