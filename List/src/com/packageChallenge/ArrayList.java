package com.packageChallenge;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
//        testing some functions of the ArrayList

        List<Employee> employeeList = new java.util.ArrayList<>();


        employeeList.add(new Employee("Jane", "Jones", 123 ));
        employeeList.add(new Employee("John", "Doe", 456 ));
        employeeList.add(new Employee("Mary", "Smith", 223 ));
        employeeList.add(new Employee("Mike","Wilson", 324 ));


        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("___________________________");

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4567));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("___________________________");

        Object[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        System.out.println(employeeList.contains(new Employee("Mary" , "Smith", 223)));

    }
}
