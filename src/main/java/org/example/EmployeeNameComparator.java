package org.example;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparable<Employee>{

//    public int compare(Employee o1, Employee o2) {
//        int res = o1.getSurName().compareTo(o2.getSurName());
//        if (res == 0){
//            return o1.getName().compareTo(o2.getName());
//        }
//        return res;
//    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
