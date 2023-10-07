package StructuralPatterns._07_bridge._01_java;

import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver"); // 구체는 Driver(Implementation)

        /* 아래는 모두 추상화 : DriverManager , Connection, Statement
        * 새로운 DB로 변경한다고 해서 추상화된 인터페이스인 추상화 요소들은 바뀌지 않음
        *  */
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~test", "sa", "")) {
            String sql = "CREATE TABLE ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            Statement statement = conn.createStatement();
            statement.execute(sql);

//            PreparedStatement statement1 = conn.prepareStatement(sql);
//            ResultSet resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
