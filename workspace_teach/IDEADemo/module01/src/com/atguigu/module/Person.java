package com.atguigu.module;

import java.util.Objects;

/**
 * ClassName: Person
 * Package: com.atguigu.module
 * Description:
 *
 * @Author kurt
 * @Create 2022 /12/22 下午 10:54
 * @Version v1.0
 */
public class Person {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    //alt + insert 快捷鍵 生成getter and setter
    public void setId(int id) {
        this.id = id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
