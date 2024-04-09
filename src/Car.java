public class Car {

    enum Color {
        WHITE,
        BLUE,
        RED,
        GREEN
      }
      //member variables 
      private Color color;
      private final int year;
      private final String make;
      private final String model;

      public Car (int year, String make, String model) {
        color = Color.WHITE; //all cars will be white by default
        this.year = year;
        this.make = make;
        this.model = model;
      }

      /*----------------------------------------------------------------------------------- */
      //getters for year make, and model (should be easy to write these)

      public int getYear(){
        //TODO: fix method to return correct value
        return -1000;
      }
      public String getMake(){
        //TODO: fix method to return correct value
        return null;
      }
      public String getModel(){
        //TODO: fix method to return correct value
        return null;
      }


      /*----------------------------------------------------------------------------------- */

      /* methods to paint car different colors - good example of how objects allow us to specify exactly 
      what users can change and what parts of an object cannot be changed 

      ie. you can't paint the car any color, maybe we only have red blue or green paint available, you set the year
      make and model when you create the car, but it wouldn't make sense to allow you to change those things later
      */

      public void paintRed(){
        //TODO: change the color of the car to the correct enum
      }
      public void paintBlue(){
        //TODO: change the color of the car to the correct enum
      }
      public void paintGreen(){
        //TODO: change the color of the car to the correct enum
      }

      //note the return type of this method - we've already passed in objects as parameters and returned objects 
      //(Strings, Arrays, ... ), we can do the same thing with more complex objects and enums
      public Color getColor(){
        //TODO: return current color of car 
        return null;
      }

      public String toString(){
        return("Make: " + make + " | Model: " +model + " | Year: "+ year + " | Color: " + color);
        //  return a string representation of the car 
        // Make: "", Model: "", Year: "", Color: ""(call getColor()) - this format 
      }

      public boolean equals(Car other){
        /*TODO: compare each value of the object we are calling this from and the "other" objects to see if they
        contain all the same values 
        
        Why cant we do car1.equals(car2) without writing our own equals method? 
        What would the general equals method return and why? 
        */

        return false;
      }

}
