package org.bcit.midterm.questions;

public class Basic_07_robot {
  Basic_07_arm leftArm;
  Basic_07_arm rightArm;
  Basic_07_leg leftLeg;
  Basic_07_leg rightLeg;

  public Basic_07_robot() {
    this.leftArm = new Basic_07_arm("left");
    this.rightArm = new Basic_07_arm("right");
    this.leftLeg = new Basic_07_leg("left");
    this.rightLeg = new Basic_07_leg("right");
  }

  public void run() {
    leftArm.move();
    rightArm.move();
    leftLeg.move();
    rightLeg.move();
  }
}
