package org.bcit.midterm.questions;

public class Basic_01 {
  // Basic Question 01 (5 estimated points, 3 TODOs)
  // Idea: tests your ability to create classes that persist state.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Basic_01_myClass.

  /**
   * Constructor for A_1_Ball.
   *
   * @param x the x position
   * @param y the y position
   * @param size the size of a Ball in pixels
   */
  public Basic_01(int x, int y, int size) {
    // TODO 1: Finish the constructor such that each variable
    // is stored as a class attribute.
  }

  /**
   * Changes this.x and this.y by dx and dy.
   *
   * @param dx amount to move in the x direction
   * @param dy amount to move in the y direction
   */
  public void move(int dx, int dy) {
    // TODO 3: Finish the move method
  }

  public static void main(String[] args) {
    Basic_01 a1 = new Basic_01(0, 0, 10);
    a1.move(1, 1); // outcome should be that a1.x == 1, a1.y == 1
  }

}
