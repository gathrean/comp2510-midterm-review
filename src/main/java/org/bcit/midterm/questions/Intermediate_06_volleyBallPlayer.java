package org.bcit.midterm.questions;

public class Intermediate_06_volleyBallPlayer {
  String label;
  public Intermediate_06_volleyBallPlayer(String label) {
    this.label = label;
  }
  public void bump() {
    System.out.format("Player %s bumped!", label);
  }
  public void set() {
    System.out.format("Player %s set!", label);
  }
  public void strike() {
    System.out.format("Player %s striked!", label);
  }
}
