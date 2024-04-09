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

      //getters 
      public int getYear(){
        return year;
      }
      public String getMake(){
        return make;
      }
      public String getModel(){
        return model;
      }


      /*----------------------------------------------------------------------------------- */
      //TODO

      // public String getColor(){
      //   if (color == Color.WHITE)
      //   switch(color){
      //     case WHITE: return "The car is white.";
      //     case BLUE: 

      //   }
      //   //get a string representation of the color using a switch statement
      // }

      public void paintRed(){
        color=Color.RED;
      }
      public void paintBlue(){
        color = Color.BLUE;
      }
      public void paintGreen(){
        color = Color.GREEN;
      }
      public Color getColor(){return color;}

      public String toString(){
        return("Make: " + make + " | Model: " +model + " | Year: "+ year + " | Color: " + color);
        //  return a string representation of the car 
        // Make: "", Model: "", Year: "", Color: ""(call getColor()) - this format 
      }

      public boolean equals(Car other){
        return(year==other.getYear() && model.equals(other.getModel()) 
      && make .equals(other.getMake()) && color == other.getColor());
      }


      //do we need the getColor string rep? what happens if we directly call the enum value?

}
