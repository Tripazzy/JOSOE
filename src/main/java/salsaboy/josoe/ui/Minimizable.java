package salsaboy.josoe.ui;

public interface Minimizable {
    int USER = 0;
    int SYSTEM = 1;
    int ERROR = 2;
    /**
     * The method to run when it is minimized.
     * @param reason The reason it was minimized.
     */
    void onMinimize(int reason);

    /**
     * The method to run when it is unminimized.
     * @param reason The reason it was unminimized.
     */
    void onMaximize(int reason);
}
