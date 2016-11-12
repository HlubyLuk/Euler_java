package cz.hlubyluk.euler.solvers;

/**
 * A knapsack is a bin-packing problem, in which the goal is to maximize the total value of items in (typically)
 * a single bin. In this documentation you'll learn how to use or-tools to solve knapsack problems.
 * Created by HlubyLuk on 05/11/2016.
 */
public class SolverKnapsack extends SolverBase<Integer> {
    private final int capacity;
    private final int[] values;

    public SolverKnapsack(int capacity, int[] values) {
        this.capacity = capacity;
        this.values = values;
    }

    @Override
    public Integer solve() {
        int[] ways = new int[capacity + 1];
        ways[0] = 1;
        for (int value : values) for (int i = value; i <= this.capacity; i += 1) ways[i] += ways[i - value];
        return ways[this.capacity];
    }
}
