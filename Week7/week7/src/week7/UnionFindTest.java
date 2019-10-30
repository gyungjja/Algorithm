package week7;

import java.util.*;


public class UnionFindTest {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);

        uf.union(0, 1);
        uf.union(1, 2);

        System.out.println(uf.find(1, 2));

        uf.union(5, 6);
        System.out.println(uf.find(5, 6));
        System.out.println(uf.find(5, 2));

        uf.union(6, 2);
        System.out.println(uf.find(1, 6));
        System.out.println(uf.find(0, 6));

        System.out.println(uf.find(1, 8));
    }
}