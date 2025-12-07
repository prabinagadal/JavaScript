//Create a class `Car` with a parameterized constructor (model, year). Print the values....

  public class Car {
    String model;
    int year;

    Car(String m, int y){
        model = m;
        year = y;

        System.out.println("Model of the car is: " + model);
        System.out.println("Year of the car is: " + year);
    
    }
    public static void main(String[]args){
        Car myCar = new Car("Toyota", 2020);
    }
}

