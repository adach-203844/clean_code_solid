package pl.ttpsc.solid.lsp.shape;

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
}
