package main.lesson_20190925;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class UserRepo {
    List<User> users=new ArrayList<>();

    List<User> getAll(){
        return users;
    }

    User getUser(Integer id){
        return users.get(id);
    }

    User getUserOptional(Integer id){
        return Optional.ofNullable(users.get(id)).orElse(new User("default user",0));
    }
    User getUserOptional2(Integer id){
        return Optional.ofNullable(users.get(id)).orElseThrow(()->new MyException());
    }

    void addUser(User value){
        users.add(value);
    }

    @Override
    public String toString() {
        return "UserRepo{" +
                "users=" + users +
                '}';
    }

    //    void removeUser
}
