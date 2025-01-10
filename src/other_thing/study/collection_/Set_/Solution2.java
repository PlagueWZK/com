package other_thing.study.collection_.Set_;

import java.util.HashSet;
import java.util.Objects;

public class Solution2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Employee2("smit",1588,new MyData(2001,5,5)));
        set.add(new Employee2("smit",1588,new MyData(2001,5,5)));
        set.add(new Employee2("smit",1588,new MyData(2002,5,5)));
        System.out.println(set);
    }
}



class Employee2 {
    private String name;
    private int salary;
    private MyData birthday;
    public Employee2(String name, int salary, MyData birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee = (Employee2) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && birthday.equals(employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}

class MyData {
    int year;
    int month;
    int day;
    MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return year == myData.year && month == myData.month && day == myData.day;
    }
    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}