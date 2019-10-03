package lesson_20191002_db;

import org.knowm.yank.Yank;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        String URL="jdbc:postgresql://ec2-54-228-246-214.eu-west-1.compute.amazonaws.com:5432/d79ut0j7jbh0ba";
        String USER="vwevpkepmeqldn";
        String PASS="0007c332efa7798831a5836a06d0a305e86c856308172613243a67bcd6feeb53";

        String SQL_SELECT="SELECT * FROM USERS";

        Properties dbProp=new Properties();
        dbProp.setProperty("jdbcUrl",URL);
        dbProp.setProperty("password",PASS);
        dbProp.setProperty("username",USER);

        Yank.setupDataSource(dbProp);
        User user=Yank.queryBean(SQL_SELECT,User.class,null);
        System.out.println("Yank user: "+user);

        String SQL_INSERT="INSERT INTO public.users (id, email, first_name, gender, last_name, last_visit, locale, username, userpic) VALUES ('109493335323360544727', 'smasim2016@outlook.com', 'Ivan', null, 'Petrov', '2019-07-04 19:34:03.957000', 'au', null, 'https://lh4.googleusercontent.com/-cynJQ5D4TQk/AAAAAAAAAAI/AAAAAAAABr4/vUDbM2NcbGk/photo.jpg');";

//        try (Connection conn = DriverManager.getConnection(URL, USER,PASS);
//             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {
//
//            preparedStatement.execute();
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

            List<User> result= new ArrayList<>();



        // auto close connection and preparedStatement
        try (Connection conn = DriverManager.getConnection(URL, USER,PASS);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                String id = resultSet.getString("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String locale = resultSet.getString("locale");

                result.add(new User(id,firstName,lastName,locale));

            }
            //result.forEach(x -> System.out.println(x));

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
