package cn.testutils.bean;

/**
 * Created by ZLS on 2018/5/6.
 */
public class Person {
    public  Person(){
        System.out.println("-------------- Person ---------------");
    }
    private String name;
    private  String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
