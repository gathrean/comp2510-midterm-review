package org.bcit.midterm.answers;

public class Basic_02_vector {
  private int x;
  private int y;

  private String label;

  public Basic_02_vector(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Basic_02_vector(int x, int y, String label) {
    this.x = x;
    this.y = y;
    this.label = label;
  }

  public Basic_02_vector(Basic_02_vector pos1, Basic_02_vector dir, String b02) {
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public Basic_02_vector add(Basic_02_vector other) {
    this.x += other.getX();
    this.y += other.getY();
    return this;
  }

  public void move() {
  }
}
