package org.bcit.midterm.questions;

public class Basic_07_foot {
  String label;
  public Basic_07_foot(String label) {
    this.label = label;
  }

  public void move() {
    System.out.format("Lift %s foot.", label);
  }
}
