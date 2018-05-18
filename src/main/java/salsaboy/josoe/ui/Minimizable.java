package main.java.salsaboy.josoe.ui;

public interface Minimizable {
    int USER = 0;
    int SYSTEM = 1;
    int ERROR = 2;
    /**
     * The method to run when it is minimized.
     * @param reason The reason it was minimized.
     *               Should be <code>Minimizable.USER</code>, <code>Minimizable.SYSTEM</code>, or <code>Minimizable.ERROR</code>
     */
    void onMinimize(int reason);
}
