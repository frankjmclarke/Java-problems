/*
Design a parking lot using object-oriented principles

Goals:
- Your solution should be in Java - if you would like to use another language, please let the interviewer know.
- Boilerplate is provided. Feel free to change the code as you see fit

Assumptions:
- The parking lot can hold motorcycles, cars and vans
- The parking lot has motorcycle spots, car spots and large spots
- A motorcycle can park in any spot
- A car can park in a single compact spot, or a regular spot
- A van can park, but it will take up 3 regular spots
- These are just a few assumptions. Feel free to ask your interviewer about more assumptions as needed

Here are a few methods that you should be able to run:
- Tell us how many spots are remaining
- Tell us how many total spots are in the parking lot
- Tell us when the parking lot is full
- Tell us when the parking lot is empty
- Tell us when certain spots are full e.g. when all motorcycle spots are taken
- Tell us how many spots vans are taking up

Hey candidate! Welcome to your interview. I'll start off by giving you a Solution class. To run the code at any time, please hit the run button located in the top left corner.
*/

import java.io.*;
import java.util.*;

class Solution {
  
  static enum Sizes {
    CYCLE,CAR,LARGE;
  }
  
  public static void main(String[] args) {   
    
  }
  
  public static class Lot{
    int cycles, cars, vans;
    ArrayList<CycleSpot> cycleList;
    ArrayList<CarSpot> carList;
    ArrayList<LargeSpot> largeList;
    
    Lot (int _cycles, int _cars, int _large){
      cycles =_cycles;
      cars =_cars;
      large = _large;
      cycleList = new Arraylist<>();
      carList = new Arraylist<>();
      largeList = new Arraylist<>();      
    }
    
  }
  
  public static class Spot{
    public Sizes size;
    public int getSize(){
      return size;
    };
  }
  
  public static class CycleSpot implements Spot {
    public int getSize(){
      return Size.CYCLE;
    };
    
  }
  public static class CarSpot implements Spot {
    public int getSize(){
      return Size.CAR;
    };
  }
  public static class LargeSpot implements Spot {
    public int getSize(){
      return Size.LARGE;
    };
  }

  
  public static class Vehicle {
  }
  
  public static class Cycle implements Vehicle {
  }
  public static class Car implements Vehicle {
  }
  public static class Van implements Vehicle {
  }

}