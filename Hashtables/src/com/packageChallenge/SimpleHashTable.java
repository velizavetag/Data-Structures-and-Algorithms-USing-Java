package com.packageChallenge;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;


    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }

        }

        if (occupied(hashedKey)) {
            System.out.println("Sorry, there's already an employee at posiiton  " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }


    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {


            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }

            if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
                return hashedKey;
            } else {
                return -1;
            }
        }
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("Empty");
            } else {
                System.out.println("Position " + i + hashtable[i].employee);

            }
        }
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldhashtable = hashtable;
        hashtable = new StoredEmployee[oldhashtable.length];

//        Rehashing., because if just using linear probing we're not deleting anything, and the load factor is too high.
        for(int i = 0; i< oldhashtable.length; i++){
            if(oldhashtable[i] != null){
                put(oldhashtable[i].key, oldhashtable[i].employee);
            }
         }

        return employee;
    }
}



