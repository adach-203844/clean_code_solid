package pl.ttpsc.solid.lsp.shape;

import java.util.Objects;

public class Square implements Shape {

  private double width;

  public Square(double width) {
    this.width = width;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public double surface() {
    return width * width;
  }

  @Override
  public double circumference() {
    return 4 * width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Square square = (Square) o;
    return Double.compare(square.width, width) == 0;
  }

  @Override
  public int hashCode() {

    return Objects.hash(width);
  }
}
