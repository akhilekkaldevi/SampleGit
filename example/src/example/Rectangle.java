package example;

import java.util.Arrays;

public class Rectangle {
	Point leftBottom;
	Point rightTop;

	public Rectangle(int xOfLeftBottom, int yOfLeftBottom, int xOfrightTop, int yOfrightTop) {
		leftBottom = new Point();
		rightTop = new Point();
		leftBottom.x = xOfLeftBottom;
		leftBottom.y = yOfLeftBottom;
		rightTop.x = xOfrightTop;
		rightTop.y = yOfrightTop;
	}

	public int[] isColliding(Rectangle rectangle) {
		if (leftBottom.x > rectangle.rightTop.x || rectangle.leftBottom.x > rightTop.x)
			return null;
		if (leftBottom.y > rectangle.rightTop.y || rectangle.leftBottom.y > rightTop.y)
			return null;
		int a[] = { Math.max(leftBottom.x, rectangle.leftBottom.x), Math.max(leftBottom.y, rectangle.leftBottom.y),
				Math.min(rightTop.x, rectangle.rightTop.x), Math.min(rightTop.y, rectangle.rightTop.y) };
		return a;

	}

}
