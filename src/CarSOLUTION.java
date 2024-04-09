public class CarSOLUTION {

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

      public CarSOLUTION (int year, String make, String model) {
        color = Color.WHITE; //all cars will be white by default
        this.year = year;
        this.make = make;
        this.model = model;
      }

      /*----------------------------------------------------------------------------------- */
      //write getters for year, make and model
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
      //paint the car different colors - this is an example of why objects can be useful in limiting 
      //access and use to exactly how you want to program to work

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

      public boolean equals(CarSOLUTION other){
        return(year==other.getYear() && model.equals(other.getModel()) 
         && make .equals(other.getMake()) && color == other.getColor());
      }

}
