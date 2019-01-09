package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import example.Rectangle;


class RectangleTesting {
	Rectangle r1 = new Rectangle(0, 0, 3, 3);
	Rectangle r2 = new Rectangle(2, 0, 4, 4);
	Rectangle r3 = new Rectangle(0, 6, 4, 10);
	Rectangle r4 = new Rectangle(1, 1, 2, 2);
	
	

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	void testIsColliding() {
		assertEquals(true, r1.isColliding(r2));
		assertEquals(true, r2.isColliding(r1));
		assertEquals(false, r2.isColliding(r3));
		assertEquals(true, r1.isColliding(r4));
		assertEquals(true, r4.isColliding(r1));
	}
	
	@Test
	void testGetOverlappedRectangle() {
		Rectangle r=new Rectangle(2,0,3,3);
		Rectangle rect =new Rectangle(5,4,7,6);
		assertTrue(r.isEqual(r1.getOverlappedRectangle(r2)));
		assertTrue(r4.isEqual(r1.getOverlappedRectangle(r4)));
		assertTrue(rect.isEqual(new Rectangle(0,4,7,12).getOverlappedRectangle(new Rectangle(5,0,10,6))));
		
		
	}
}
