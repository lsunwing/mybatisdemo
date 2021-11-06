package com.liuwei.mybatisdemo.test;

public class BinaryTreeTest {

    static int pos = 0;

    public static void main(String[] args) {
        BiTreeNode root= new BiTreeNode("a");
        root.lChild = new BiTreeNode("b");
        root.rChild = new BiTreeNode("c");
        String[] array = new String[10];
        toArray(root, array);
        System.out.println(array);
    }

    static void toArray(BiTreeNode t, String[] array) {

        if (t == null) return;
        toArray(t.lChild, array);
        array[pos++] = (String) t.data;
        toArray(t.rChild, array);
    }

    static class BiTreeNode {
        BiTreeNode lChild;
        BiTreeNode rChild;
        String data;
        public BiTreeNode(String data) {
            this.data = data;
        }
    }
}
