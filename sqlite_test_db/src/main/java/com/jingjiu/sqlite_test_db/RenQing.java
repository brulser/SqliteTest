package com.jingjiu.sqlite_test_db;


/**
 * Created by pc on 2017/6/18.
 * Email:565881738@qq.com wellcome For Your Letters
 * Tel： 13638667479
 * Company：lafons
 * Alias： Brulser
 * Name：Shun Yao
 * 中文名：姚舜
 * Label：Focus, Seriousness, Efficiency, Results.
 */
public class RenQing {

    private int id;
    private int age;
    private String name;
    private boolean type;
    private int count;

    public RenQing(int id, int age, String name, boolean type, int count) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.type = type;
        this.count = count;
    }

    @Override
    public String toString() {
        return "RenQing{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", count=" + count +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
