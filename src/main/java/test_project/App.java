package test_project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<main.java.test_project.User> userList=new ArrayList<>();
        userList.add(new main.java.test_project.User("name1",20));
        userList.add(new main.java.test_project.User("name2",25));
        userList.add(new main.java.test_project.User("name3",30));
        userList.add(new main.java.test_project.User("name4",35));
        userList.add(new main.java.test_project.User("name5",40));
        userList.add(new main.java.test_project.User("name6",45));
        userList.add(new main.java.test_project.User("name7",50));
        userList.add(new main.java.test_project.User("name8",55));

//        userList.stream().filter(user->user.getAge()>30&&user.getAge()<45).forEach(user-> System.out.println(user));
//
//        userList=userList.stream().filter(user->user.getAge()>30&&user.getAge()<45).collect(Collectors.toList());

        System.out.println(userList.stream().map(user -> user.getName()).collect(Collectors.toList()));

    }
}
