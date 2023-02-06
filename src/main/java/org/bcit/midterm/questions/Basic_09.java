package org.bcit.midterm.questions;

import java.util.HashMap;
import java.util.Random;

public class Basic_09 {
  // Basic Question 09 (5 estimated points, 1 TODOs)
  // Idea: tests your ability to write a UML class diagram with a single class.

  // README FIRST
  // This question must be answered on paper. Make sure to write your
  // name and student number on the paper.
  // TODO 0: Draw the UML diagram for this class only.
  private HashMap<String, String> dict;
  private int size;
  private Random randomizer;

  public Basic_09() {
    dict = new HashMap<String, String>();
    size = 0;
    randomizer = new Random();
  }

  public float getRandom() {
    return randomizer.nextFloat();
  }

  public void addMessage(String s) {
    dict.put(String.format("%f", getRandom()), s);
  }

  public String getMessage(String s) {
    return dict.get(s);
  }
}
