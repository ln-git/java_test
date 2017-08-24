package ru.stqa.my.sandbox;

public class PointsDistance {

  public static void main(String[] args) {
    Point p1 = new Point(4,5);
    Point p2 = new Point (7,8);

    System.out.println("Расстояние между двумя точками =" + distance(p1, p2));
  }

  public static double distance(Point p1, Point p2){

    return Math.sqrt(Math.pow(p2.x-p1.x,2)+Math.pow(p2.y-p1.y,2));
  }
}
