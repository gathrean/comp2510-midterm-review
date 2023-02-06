package org.bcit.midterm.questions;

public class Basic_07 {
  // Basic Question 07 (5 estimated points, 2 TODOs)
  // Idea: tests your ability to trace code.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Basic_07_myClass.

  Basic_07_robot robot;

  public Basic_07() {
    this.robot = new Basic_07_robot();
  }

  public void run() {
    this.robot.run();
  }

  public String answer() {
    // Write your answer in the string below.
    // I've given the first two calls as an example.
    String a = """
      Basic_07();
      Basic_07_robot();
      """;
    return a;
  }

  public static void main(String[] args) {
    // TODO 1: Write down all calls made below this comment in the correct order.
    // Write your answer in the function called answer();
    Basic_07 basic = new Basic_07();
    basic.run();
  }
}
