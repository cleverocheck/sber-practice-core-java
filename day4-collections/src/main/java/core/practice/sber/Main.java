package core.practice.sber;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    private static final int ITERATIONS = 1000000;
    private static final int ELEMENTS_COUNT = 10000;

    public static void main(String[] args) {
        benchmarkAdd();
        benchmarkGet();
    }

    private static void benchmarkAdd() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random(0);

        long startTreeSet = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            treeSet.add(random.nextInt());
        }
        long endTreeSet = System.currentTimeMillis();

        HashSet<Integer> hashSet = new HashSet<>();

        long startHashSet = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            hashSet.add(random.nextInt());
        }
        long endHashSet = System.currentTimeMillis();

        System.out.println("TreeSet add: " + (endTreeSet - startTreeSet) + " ms");
        System.out.println("HashSet add: " + (endHashSet - startHashSet) + " ms");
    }

    private static void benchmarkGet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random(0);

        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            treeSet.add(i);
        }
        Integer[] treeElements = treeSet.toArray(new Integer[0]);

        long startTreeSet = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            treeSet.contains(treeElements[random.nextInt(treeElements.length)]);
        }
        long endTreeSet = System.currentTimeMillis();

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            hashSet.add(i);
        }
        Integer[] hashElements = hashSet.toArray(new Integer[0]);

        long startHashSet = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            hashSet.contains(hashElements[random.nextInt(hashElements.length)]);
        }
        long endHashSet = System.currentTimeMillis();

        System.out.println("TreeSet get: " + (endTreeSet - startTreeSet) + " ms");
        System.out.println("HashSet get: " + (endHashSet - startHashSet) + " ms");
    }
}