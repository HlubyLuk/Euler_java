package cz.hlubyluk.euler.solvers;

/**
 * All solvers must implement {@link #solve()} method. Created by HlubyLuk on 05/11/2016.
 */
public abstract class SolverBase<T> {
    /**
     * Start your solver. @return result instance of {@link T}.
     */
    public abstract T solve();
}
