package org.bcit.midterm.questions;

public class Basic_07_leg {
  String label;
  Basic_07_foot foot;

  public Basic_07_leg(String label) {
    this.label = label;
    this.foot = new Basic_07_foot(label);
  }

  public void move() {
    this.foot.move();
    System.out.format("Move %s leg.", label);
  }
}
