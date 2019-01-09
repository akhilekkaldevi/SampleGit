package example;

public class Rectangle {
	private Point leftBottom;
	private Point rightTop;

	public Rectangle(int xOfLeftBottom, int yOfLeftBottom, int xOfRightTop, int yOfRightTop) {
		leftBottom = new Point();
		rightTop = new Point();
		leftBottom.setX(xOfLeftBottom);
		leftBottom.setY(yOfLeftBottom);
		rightTop.setX(xOfRightTop);
		rightTop.setY(yOfRightTop);

	}

	public boolean isColliding(Rectangle rectangle) {
		if (leftBottom.getX() > rectangle.rightTop.getX() || rectangle.leftBottom.getX() > rightTop.getX())
			return false;
		if (leftBottom.getY() > rectangle.rightTop.getY() || rectangle.leftBottom.getY() > rightTop.getY())
			return false;
		return true;

	}

	public Rectangle getOverlappedRectangle(Rectangle rectangle) {
		if (isColliding(rectangle)) {
			Rectangle rect = new Rectangle(Math.max(leftBottom.getX(), rectangle.leftBottom.getX()),
					Math.max(leftBottom.getY(), rectangle.leftBottom.getY()),
					Math.min(rightTop.getX(), rectangle.rightTop.getX()),
					Math.min(rightTop.getY(), rectangle.rightTop.getY()));
			return rect;
		} else
			return null;
	}

	public boolean isEqual(Rectangle r) {
		if ((leftBottom.getX() == r.leftBottom.getX()) && (leftBottom.getY() == r.leftBottom.getY())
				&& (rightTop.getX() == r.rightTop.getX()) && (rightTop.getY() == r.rightTop.getY()))
			return true;
		return false;
	}

}
