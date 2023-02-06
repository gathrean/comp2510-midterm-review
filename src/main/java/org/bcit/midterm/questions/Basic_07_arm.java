package org.bcit.midterm.questions;

public class Basic_07_arm {
  String label;
  public Basic_07_arm(String label) {
    this.label = label;
  }

  public void move() {
    System.out.format("Swing %s arm", label);
  }
}
