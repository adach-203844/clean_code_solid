package pl.ttpsc.solid.lsp.shape;

import java.util.Objects;

public class Rectangle implements Shape {

  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double surface() {
    return width * height;
  }

  @Override
  public double circumference() {
    return 2 * width + 2 * height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Double.compare(rectangle.width, width) == 0 &&
        Double.compare(rectangle.height, height) == 0;
  }

  @Override
  public int hashCode() {

    return Objects.hash(width, height);
  }
}
