package org.bcit.midterm.questions;

import java.sql.Driver;
import java.util.ArrayList;

public class Intermediate_02 {
  // Intermediate Question 02 (10 estimated points, 3 TODOs)
  // Idea: tests your ability to create and use interfaces.

  // README FIRST
  // I will ONLY be reading from the org.bcit.midterm.answers package.
  // TODO 0: Create a copy of this file in the answers package.
  // Put your answers in new classes that are labeled with the
  // question label, e.g., Intermediate_02_myClass.

  // TODO 1: Create a set of interfaces and implement them in the following class
  // structure. No need to write the internal logic of the methods, stubs are fine.
  // - Create classes called Car, Truck and Bike (prefix with Intermediate_02_).
  // - Create interfaces Drivable, Loadable, and Liftable (prefix with Intermediate_02_)
  // - All classes are Drivable. Drivables include the drive() method.
  // - Both Car and Truck are Loadable. Loadables include the load() method.
  // - Bike is Liftable. Liftables include the lift() method.

  public static void main(String[] args) {
    // TODO 2: Make sure this compiles (should be covered by TODO 1).
    ArrayList<Intermediate_02_Drivable> drivables = new ArrayList<Intermediate_02_Drivable>();
    ArrayList<Intermediate_02_Loadable> loadables = new ArrayList<Intermediate_02_Loadable>();
    ArrayList<Intermediate_02_Liftable> liftables = new ArrayList<Intermediate_02_Liftable>();
    drivables.add(new Intermediate_02_Car());
    drivables.add(new Intermediate_02_Truck());
    drivables.add(new Intermediate_02_Bike());
    loadables.add(new Intermediate_02_Car());
    loadables.add(new Intermediate_02_Truck());
    liftables.add(new Intermediate_02_Bike());

    for (Intermediate_02_Drivable d : drivables) {
      d.drive();
    }
    for (Intermediate_02_Loadable l : loadables) {
      l.load();
    }
    for (Intermediate_02_Liftable l :  liftables) {
      l.lift();
    }
  }

}
