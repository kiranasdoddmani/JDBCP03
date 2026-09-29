package org.example;

import org.example.config.DBConfig;
import java.sql.Statement;

public class AppTest {
    public static void main(String[] args) {
        try {

       //     String sql = "UPDATE Students SET marks = 90 WHERE id = 1";
            String sql="DELETE FROM Students WHERE id=1";
             Statement statement= DBConfig.getInstance();

            int row=statement.executeUpdate(sql);
          //  System.out.println("DataBase is Successfully Updated");
            System.out.println("DataBase is Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
