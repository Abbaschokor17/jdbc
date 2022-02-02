import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class MyJDBC {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "abbas1722000chokor?");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from people");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));
            }
            System.out.println("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
