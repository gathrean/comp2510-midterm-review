package org.bcit.midterm.questions;

import java.util.HashMap;

public class Advanced_01 implements Iterable<String> {
  // Advanced Question 01 (15 estimated points, 2 TODOs)
  // Idea: tests your ability to create and use Iterator and Iterable.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Advanced_01_myClass.

  // TODO 1: Implement the minimum need for Iterable such that the
  // for each loop in main can run. That includes any supporting methods
  // and classes needed. You can choose any order you'd like to iterate
  // through the HashMap, but each element must be visited once and
  // only once.

  HashMap<String, String> kvstore;
  public Advanced_01() {
    kvstore = new HashMap<String, String>();
  }
  public static void main(String[] args) {
    Advanced_01 av01 = new Advanced_01();
    for (String s : av01) {
      System.out.println(s);
    }
  }
}
