package ICA.TimingArrayList;

import ICA.TimingArrayList.Tests.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Test[] tests = {
                new AddTest(),
                new GetTest(),
                new MaximumTest(),
                new MinimumTest(),
                new ShuffleTest(),
                new SortTest(),
                new ReverseTest(),
                new RemoveTest(),
        };

        for (int i = 1; i < 100000; i=i*10) {
            System.out.println("TEST CASE: " + i);
            ArrayList<Integer> list = new ArrayList<>();
            for (Test test : tests) {
                System.out.println(test.getName());
                long start = System.currentTimeMillis();
                test.runTest(list, i);
                long end = System.currentTimeMillis();
                System.out.println("Took " +  (end-start) + " milliseconds");
            }
        }
    }
}
