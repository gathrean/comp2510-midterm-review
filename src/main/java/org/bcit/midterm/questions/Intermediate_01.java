package org.bcit.midterm.questions;

public class Intermediate_01 {
  // Intermediate Question 01 (10 estimated points, 2 TODOs)
  // Idea: tests your ability to create appropriate test coverage.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Intermediate_01_myClass.

  private float x;
  private float y;

  // TODO 1: Create a test suite that fully tests this method.
  public void move(String dir, float amount) {
    if (dir == "LEFT") {
      this.x = this.x - amount;
    } else if (dir == "RIGHT") {
      this.x = this.x + amount;
    } else if (dir == "UP") {
      this.y = this.y + amount;
    } else if (dir == "DOWN") {
      this.y = this.y - amount;
    }
    if (this.x < 0) {
      this.x = 0;
    }
    if (this.y < 0) {
      this.y = 0;
    }
  }
}
