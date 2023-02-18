package org.bcit.midterm.answers;

public class Basic_02 {
  // Basic Question 02 (5 estimated points, 4 TODOs)
  // Idea: tests your ability to create compositions of classes.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Basic_02_myClass.

  // TODO 1: Define a new vector class with two private attributes,
  //  int x and int y, along with getters and setters for x and y.

  Basic_02 position;
  Basic_02 direction;
  String label;
  private Basic_02 x;

  /**
   * Constructor for Basic_02
   *
   * @param position x,y vector
   * @param direction x,y vector
   * @param label string
   */
  public Basic_02(Basic_02 position, Basic_02 direction, String label) {
    // TODO 2: finish the constructor

    this.position = position;
    this.direction = direction;
    this.label = label;
  }

  /**
   * Outcome should be:
   *  this.position.x == this.position.x + this.direction.x
   *  this.position.y == this.position.y + this.direction.y
   */
  public void move() {
    position = position.add(direction);
  }

  private Basic_02 add(Basic_02 direction) {
    return null;
  }

  public static void main(String[] args) {
    // TODO 3: implement methods in Basic_02_vector such that
    // the following has no errors when compiling.
    Basic_02_vector pos0 = new Basic_02_vector(0, 0);
    Basic_02_vector dir = new Basic_02_vector(1, 1);
    pos0.add(dir);
    Basic_02_vector pos1 = new Basic_02_vector(pos0.getX(), pos0.getY());
    Basic_02_vector b02 = new Basic_02_vector(pos1, dir, "b02");
    b02.move();
  }
}
