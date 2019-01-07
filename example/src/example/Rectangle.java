package example;

import java.util.Arrays;

public class Rectangle {
	int ax1, ay1, cx1, cy1;

	public Rectangle(int ax1, int ay1, int cx1, int cy1) {
		this.ax1 = ax1;
		this.ay1 = ay1;
		this.cx1 = cx1;
		this.cy1 = cy1;
	}

	static void collide(Rectangle r1, Rectangle r2) {
		boolean b = false;
		if (r1.ax1 < r2.ax1) {
			if (r2.ax1 < r1.cx1 || r2.ay1 < r1.cy1)
				b = true;
		} else if (r2.ax1 < r1.ax1) {
			if (r1.ax1 < r2.cx1 || r1.ay1 < r2.cy1)
				b = true;

		}

		if (b) {
			int a[] = { Math.max(r1.ax1, r2.ax1), Math.max(r1.ay1, r2.ay1), Math.min(r1.cx1, r2.cx1),
					Math.min(r1.cy1, r2.cy1) };
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(0, 0, 3, 3);
		Rectangle r2 = new Rectangle(2, 0, 4, 4);
		Rectangle r3 = new Rectangle(5, 5, 10, 10);
		collide(r1, r2);

	}

}
