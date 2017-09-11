package ru.stqa.my.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PointDistanceTests {

  @Test
  public void testDistance1() {
    Point p1 = new Point (4,2);
    Point p2 = new Point (7,6);
    Assert.assertEquals(p2.distance(p1),5.0);
  }

  @Test
  public void testDistance2() {
    Point p1 = new Point(4,5);
    Point p2 = new Point(7,8);
    Assert.assertEquals(p2.distance(p1),4.242640687119285);
  }

  @Test
  public void testDistance3() {
    Point p1 = new Point (5.4, -3.6);
    Point p2 = new Point (-2.4,2.9);
    Assert.assertEquals(p2.distance(p1),10.153324578678651);
  }

  @Test
  public void testDistance4() {
    Point p1 = new Point (5,6);
    Point p2 = new Point (5,6);
    Assert.assertEquals(p2.distance(p1), 0.0);
  }

  @Test
  public void testDistance5() {
    Point p1 = new Point(5, 6);
    Point p2 = new Point(7,6);
    Assert.assertFalse(p2.distance(p1) < 0, "Меньше 0");
  }
}
