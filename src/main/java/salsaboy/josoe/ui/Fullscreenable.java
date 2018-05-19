package salsaboy.josoe.ui;

public interface Fullscreenable {
    int WINDOWOPTION = 0;
    int APPLICATION = 1;
    int SYSTEM = 2;
    int ERROR = 3;
    
    /**
     * Runs when the window is released from fullscreen mode
     * @param reason the reason the window was windowed
     */
    void onWindowed(int reason);
    
    /**
     * Runs when the window is put into fullscreen mode
     * @param reason the reason the window was fullscreened
     */
    void onFullscreened(int reason);
}