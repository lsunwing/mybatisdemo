package com.liuwei.yeb.api.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {

    static Map<String, String> dataMap = new HashMap<>();
    static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        lock.writeLock();

    }

    public static String getName(String key) {
        lock.readLock().lock();
        try {
            return dataMap.get(key);
        } finally {
            lock.readLock().unlock();
        }
    }

    public static void setData(String key, String name) {
        lock.writeLock().lock();
        try {
            dataMap.put(key, name);
        } finally {
            lock.writeLock().unlock();
        }
    }
}
