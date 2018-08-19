package com.packageChallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTables {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTables(){
        hashtable = new LinkedList[10];
        for(int i = 0; i < hashtable.length; i++){
            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get (String key){
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while(iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }

        return null;

    }


    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

        StoredEmployee employee = null;
        int index = -1;

        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) {
                break;
            }
        }

        if (employee == null || !employee.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }
    }

        public void printHashTable(){
            for (int i = 0; i < hashtable.length; i++){
                if(hashtable[i].isEmpty()){
                    System.out.println("Position " + i + " : is empty");
                } else{
                    System.out.println("Position " + i + ": ");
                    ListIterator<StoredEmployee> iterator1 = hashtable[i].listIterator();
                    System.out.print(iterator1.next().employee);
                    System.out.print("-->");
                }
                System.out.println("null");

            }
    }


    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

}
