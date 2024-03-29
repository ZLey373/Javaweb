package top.zley.pojo;

/**
 * @author: ZLey
 * @description uesr实体类
 * @date: 2023/9/4 11:03
 */

public class user {
    private String name;
    private int age;

    public user() {
    }

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
