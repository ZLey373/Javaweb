package com.zl;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException {
        System.out.println( "Hello World!" );
        // useSSL=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
        String url="jdbc:mysql://localhost:3306/jdbc";

        String name="root";
        String password="925828";
        // 1、加载驱动
      //  Class.forName("com.mysql.cj.jdbc.Driver");

        // 获取连接对象
        Connection connection = DriverManager.getConnection(url, name, password);

        // 编写sql语句
        String sql="select * from jdbc.user";

        // 获取执行sql语句的对象
        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){  //循环一次，游标移动一行
            System.out.println("id：" + rs.getString(1)); //  获取第一列的数据
            System.out.println("name：" + rs.getString("name"));  //获取字段为name的数据
            System.out.println("password：" + rs.getString(3)); //  获取第三列的数据
            System.out.println("-------------------");
        }

        //关闭资源
        statement.close();
        connection.close();
    }

}

