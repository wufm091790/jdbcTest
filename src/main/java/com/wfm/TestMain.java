package com.wfm;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;

public class TestMain {
    public static void main(String[] args) {
        Connection conn;
        Properties pro = new Properties();
        try {
            InputStream in = TestMain.class.getClassLoader().getResourceAsStream("jdbc.properties");
            pro.load(in);
            String jdbcUrl = pro.getProperty("jdbcUrl");
            String jdbcUsername = pro.getProperty("jdbcUsername");
            String jdbcPassword = pro.getProperty("jdbcPassword");
            in.close();

            conn = DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
            if(!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            Statement statement = conn.createStatement();
            String sql = "select * from account";
            ResultSet rs = statement.executeQuery(sql);

            String name = null;
            Double money = null;
            while(rs.next()){
                //获取stuname这列数据
                name = rs.getString("name");
                //获取stuid这列数据
                money = rs.getDouble("money");

                //输出结果
                System.out.println(name + "\t" + money);
            }

            rs.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
