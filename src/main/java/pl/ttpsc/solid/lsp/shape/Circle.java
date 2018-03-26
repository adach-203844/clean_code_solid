package pl.ttpsc.solid.lsp.shape;

public class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double surface() {
    return Math.PI * radius * radius;
  }

  @Override
  public double circumference() {
    return 2 * Math.PI * radius;
  }
}
