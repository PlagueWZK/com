package other_thing.study.collection_.Set_;

import java.util.HashSet;
import java.util.Objects;


@SuppressWarnings("all")
public class Solution {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Employee("mil", 18));
        set.add(new Employee("sim", 18));
        set.add(new Employee("mil", 18));
        set.add(new Employee("mil", 48));
        System.out.println(set);
    }

}

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Employee employee = (Employee) obj;
        return name.equals(employee.name) && age == employee.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}