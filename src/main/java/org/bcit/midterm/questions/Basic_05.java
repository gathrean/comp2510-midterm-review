package org.bcit.midterm.questions;

public class Basic_05 {
  // Basic Question 05 (5 estimated points, 4 TODOs)
  // Idea: tests your ability to create exceptions.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Basic_05_myClass.

  // TODO 1: Make a new exception class called Basic_05_exception.
  public int addPositive(int a, int b) throws Basic_05_exception {
    if (a < 0 || b < 0) {
      // TODO 2: Make Basic_05_exception take parameters
      // and print a useful error message.
      throw Basic_05_exception(a, b);
    } else {
      return a + b;
    }
  }

  public static void main(String[] args) {
    // TODO 3: call addPositive with one call that will throw an
    // exception, and another that will not throw an exception.
    // In both cases, handle the exception.
  }

}
