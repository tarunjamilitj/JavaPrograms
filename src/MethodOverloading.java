class Mathoperations {
    // Method to calculate the sqaure of an integer
    int calculate(int number){
        return number * number;
    }
    // Overload method to calculate the product of two integer
    int calculate(int number1 , int number2){
        return number1 * number2;
    }

    // Overload method to calculate the product of two double values
    double calculate(double number1, double number2){
        return number1 * number2;
    }

    // Overload method to calculate the cube of an integer
    int calculate(int number, boolean cube){
        if (cube){
            return number * number * number;
        }
        return number;
    }

}

public class MethodOverloading {
public static void main(String[] args){
    Mathoperations mathOps = new Mathoperations();
    //Calling the Calculate() method with different parameter types
    System.out.println("Running Method Overloading example:");
    System.out.println("Square of 5: " + mathOps.calculate(5));
    System.out.println("Product of 5 and 10: " + mathOps.calculate(5, 10));
    System.out.println("Product of 5.5 and 10.5: " + mathOps.calculate(5.5, 10.5));
    System.out.println("Cube of 5: " + mathOps.calculate(5));
}
}
