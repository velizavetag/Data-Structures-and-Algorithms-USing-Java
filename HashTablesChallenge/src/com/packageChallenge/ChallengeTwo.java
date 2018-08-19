package com.packageChallenge;

import java.util.*;

public class ChallengeTwo {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("jane", "jones", 123));
        employees.add(new Employee("john", "doe", 5876));
        employees.add(new Employee("Mike", "Wilson", 333));
        employees.add(new Employee("Mary", "Smith", 55));
        employees.add(new Employee("john", "doe", 5876));
        employees.add(new Employee("Bill", "End", 34556));
        employees.add(new Employee("jame", "jones", 123));

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Employee> employeeTable = new HashMap<>();

        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employeeTable.containsKey(employee.getId())){
                remove.add(employee);
            } else{
                employeeTable.put(employee.getId(), employee);
            }
        }

        for (Employee employee : remove ){
            employees.remove(employee);
        }


        System.out.println("==============================================");

        employees.forEach(e -> System.out.println(e));


    }
}
