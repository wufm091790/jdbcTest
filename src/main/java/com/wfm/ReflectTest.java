package com.wfm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: JdbcTest
 * @description: test for reflect
 * @author: wfm
 * @create: 2018-11-19 15:49
 **/
public class ReflectTest {
    public static void main(String args[]) {
        try {
            Class clazz = Class.forName("com.wfm.Student");
            Constructor con = clazz.getConstructor(String.class,int.class,char.class,String.class);
            System.out.println(con);
            Object obj = con.newInstance("wufm",22,'m',"15810257605");
            //obj.toString();
            Student stu = (Student)obj;
            System.out.println(stu.toString());

            //尝试invoke
            String str = args[0];

            Method m = clazz.getMethod(str,null);
            int age = (Integer)m.invoke(obj,null);
            System.out.println(age);

//            Field[] fields = clazz.getDeclaredFields();
//            for(Field f : fields) {
//                f.setAccessible(true);
//                System.out.println(f.getName());
//                System.out.println(f.get(obj));
//            }

            Field f = clazz.getDeclaredField("name");
            System.out.println(f.getName()+":"+f.get(obj));
            f.set(obj,"xdz");
            System.out.println(f.getName()+":"+f.get(obj));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
