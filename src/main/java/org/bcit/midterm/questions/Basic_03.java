package org.bcit.midterm.questions;

public class Basic_03 {
  // Basic Question 03 (5 estimated points, 3 TODOs)
  // Idea: tests your ability to create super/sub classes.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Basic_03_myClass.

  // TODO 1: Create a subclass that extends this class with a new
  // dimension called z, which is also a private float.
  private float x;
  private float y;

  /**
   * Constructor if no parameters given.
   */
  public Basic_03() {
    this.x = 0f;
    this.y = 0f;
  }

  /**
   * Constructor if parameters given.
   * @param x magnitude in x direction
   * @param y magnitude in y direction
   */
  public Basic_03(float x, float y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Adds two vectors together.
   * TODO 2: override this in the subclass to also add z.
   * YOU MUST USE super for full marks.
   *
   * @param vec vector to add
   */
  public void add(Basic_03 vec) {
    this.x += vec.x;
    this.y += vec.y;
  }

}
