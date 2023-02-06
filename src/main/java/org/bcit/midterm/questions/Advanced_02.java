package org.bcit.midterm.questions;

public class Advanced_02 {
  // Advanced Question 02 (15 estimated points, 2 TODOs)
  // Idea: tests your ability to create and use Singletons.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Advanced_02_myClass.

  // TOD0 1: Implement a Singleton. The Singleton should have one attribute
  // private String label and a getter/setter method for it. The following
  // code should compile and behave as stated in the comment.
  public static void main(String[] args) {
    Advanced_02_Singleton singleton1 = Advanced_02_Singleton.getInstance();
    Advanced_02_Singleton singleton2 = Advanced_02_Singleton.getInstance();
    singleton1.setLabel("singleton1");
    singleton2.setLabel("singleton2");
    // Should print "singleton2"
    System.out.println(singleton1.getLabel());
  }
}
