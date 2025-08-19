package students;

import java.util.Scanner;

// Student class with default constructor
class Student {
    public Student() {
        System.out.println("Student object is created");
    }
}

// Commission class
class Commission {
    String name, address, phone;
    double sales_amount;
    
    // Accept details from user
    public void acceptDetails() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = s.nextLine();

        System.out.print("Enter Address: ");
        address = s.nextLine();

        System.out.print("Enter Phone: ");
        phone = s.nextLine();

        System.out.print("Enter Sales Amount: ");
        sales_amount = s.nextDouble();
    }

    // Calculate commission
    public void calculateCommission() {
        double commission = 0;

        if (sales_amount >= 100000) {
            commission = sales_amount * 0.10;
        } else if (sales_amount >= 50000) {
            commission = sales_amount * 0.05;
        } else if (sales_amount >= 30000) {
            commission = sales_amount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Commission for " + name + " is: " + commission);
    }
}

// Main class
public class StudentCal {
    public static void main(String[] args) {
        // Create Student object (default constructor will run)
        Student s1 = new Student();

        // Create Commission object and use methods
        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
    }
}
