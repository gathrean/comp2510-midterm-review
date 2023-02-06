package org.bcit.midterm.questions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;

public class Basic_04 {
  // Basic Question 04 (5 estimated points, 3 TODOs)
  // Idea: tests your ability to create interfaces.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Basic_04_myClass.

  // TODO 1: Create an interface called ITimeable.
  // The interface must have the following methods:
  // - start(): sets start to the current time, clears laps
  // - lap(): adds a time to laps
  // - print(): prints each date, finishing with the time now
  //  TODO 2: implement ITimeable in this class with the above effects.

  private Date start;
  private Date now;
  private ArrayList<Date> laps;

  public Basic_04() {
    this.start = new Date();
    this.now = new Date();
    this.laps = new ArrayList<Date>();
  }

}
