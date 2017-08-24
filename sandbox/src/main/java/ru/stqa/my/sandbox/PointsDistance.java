package ru.stqa.my.sandbox;

public class PointsDistance {

  public static void main(String[] args) {
    Point p1 = new Point(4,5);
    Point p2 = new Point (7,8);

    System.out.println("Расстояние между двумя точками =" + p2.distance(p1));
  }


}
