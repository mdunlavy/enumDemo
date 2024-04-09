public class Main {
    public static void main(String[] args) {
        Car car = new Car(2020, "Toyota", "Corolla");
        Car car2 = new Car(2020, "Toyota", "Corolla");
        
        //car.paintBlue();
        

        //System.out.println(car.toString());
        //System.out.println(car.toString());

        if (car.equals(car2)) System.out.println("equal");
        else System.out.println("not equal");
        
    }
}
