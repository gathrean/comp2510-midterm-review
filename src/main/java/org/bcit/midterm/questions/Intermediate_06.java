package org.bcit.midterm.questions;

public class Intermediate_06 {
  // Intermediate Question 06 (20 estimated points, 3 TODOs)
  // Idea: tests your ability to create appropriate test coverage.

  // README FIRST
  // This question must be answered on paper. Make sure to write your
  // name and student number on the paper.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Intermediate_06_myClass.
  Intermediate_06_VolleyballTeam volleyBallTeam1;

  public Intermediate_06() {
    volleyBallTeam1 = new Intermediate_06_VolleyballTeam();
  }

  public void run() {
    volleyBallTeam1.run();
  }

  public static void main(String[] args) {
    // TODO 1: Draw the communication diagram for the whole class
    // structure starting with this class.
    Intermediate_06 intermediate_06 = new Intermediate_06();
    // TODO 2: Draw the sequence diagram from this line on.
    intermediate_06.run();
  }
}
