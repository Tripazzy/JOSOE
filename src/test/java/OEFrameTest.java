import java.awt.*;

import salsaboy.josoe.ui.Fullscreenable;
import salsaboy.josoe.ui.Minimizable;
import salsaboy.josoe.ui.OEFrame;

public class OEFrameTest {

	static class MinimizableTest extends OEFrame implements Minimizable {

		public MinimizableTest(int width, int height, String title) {
			super(width, height, title);
		}

		@Override
		public void onMinimize(int reason) {}

		@Override
		public void onMaximize(int reason) {}

		@Override
		public void draw(Graphics g) {}

	}

	static class FullscreenableTest extends OEFrame implements Fullscreenable {

		public FullscreenableTest(int width, int height, String title) {
			super(width, height, title);
		}

		@Override
		public void onWindowed(int reason) {}

		@Override
		public void onFullscreened(int reason) {}

		@Override
		public void draw(Graphics g) {}

	}

	static class MinimizableFullscreenableTest extends OEFrame implements Minimizable, Fullscreenable {

		public MinimizableFullscreenableTest(int width, int height, String title) {
			super(width, height, title);
		}

		@Override
		public void onWindowed(int reason) {

		}

		@Override
		public void onFullscreened(int reason) {

		}

		@Override
		public void onMinimize(int reason) {

		}

		@Override
		public void onMaximize(int reason) {

		}

		@Override
		public void draw(Graphics g) {

		}
	}

	public static void main(String[] args) {
		OEFrame normal = new OEFrame(0, 0, "") {@Override public void draw(Graphics g) {}};
		MinimizableTest minimizable = new MinimizableTest(0, 0, "");
		FullscreenableTest fullscreenable = new FullscreenableTest(0, 0, "");
		MinimizableFullscreenableTest both = new MinimizableFullscreenableTest(0, 0, "");
		System.out.printf("Normal: %s, %s; Minimizable: %s, %s; Fullscreenable: %s, %s; Both: %s, %s",
				normal.isMinimizable, normal.isFullscreenable,
				minimizable.isMinimizable, minimizable.isFullscreenable,
				fullscreenable.isMinimizable, fullscreenable.isFullscreenable,
				both.isMinimizable, both.isFullscreenable
		);
	}
}
