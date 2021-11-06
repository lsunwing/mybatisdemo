package com.liuwei.mybatisdemo.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<MapObj, String> map = new HashMap<>();
        for (int i = 0; i < 15; i++) {
            map.put(new MapObj("" + i), "aaaa");
        }
        System.out.println(map);
        HashMapTest test = new HashMapTest();
        for (Customer c : test.getSet()) {
            System.out.println(c.certNo + " : " + c.name);
        }
    }

    public List<Customer> getList() {
        List<Customer> customerList = new ArrayList<>();
        try {
            File file = new File("D:\\lw\\data.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Customer cust = new Customer(data[0], data[1]);
                boolean isExist = false;
                for (Customer tmpCust : customerList) {
                    if (cust.equals(tmpCust)) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    customerList.add(cust);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public Set<Customer> getSet() {
        Set<Customer> customerSet = new HashSet<>();
        try {
            File file = new File("D:\\lw\\data.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Customer cust = new Customer(data[0], data[1]);
                customerSet.add(cust);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerSet;
    }

    class Customer {
        String certNo;
        String name;

        public Customer(String certNo, String name) {
            this.certNo = certNo;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return certNo.equals(customer.certNo) && name.equals(customer.name);
        }

        @Override
        public int hashCode() {
            return certNo.hashCode() + name.hashCode();
        }
    }
}
