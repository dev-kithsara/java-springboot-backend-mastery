package com.example.demo;

class Employee {
    // STARTER LEVEL
    // TODO 1: Declare 3 private fields:
    // - private int id;
    // - private String name;
    // - private double salary;
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double initialSalary) {
        this.id = id;
        this.name = name;
        setSalary(initialSalary); // Use setter to enforce minimum wage validation
    }

    // Getters for ID and Name
    public int getId() { return this.id; }
    public String getName() { return this.name; }


    // MEDIUM LEVEL
    // TODO 2: Write Getter and Setter for 'salary':
    // 1. Getter: public double getSalary() -> returns this.salary
    // 2. Setter: public void setSalary(double newSalary)
    //    Validation Rule: 'newSalary' must be at least 500.0 (Minimum wage in Germany!)
    //    If newSalary >= 500.0 -> update this.salary = newSalary
    //    Else -> print "Error: Salary €" + newSalary + " is below minimum wage (€500.0)!"
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double newSalary){
        if (newSalary >= 500.0) {
            this.salary = newSalary;
        } else {
            System.out.println("Error: Salary €" + newSalary + " is below minimum wage (€500.0)!");
        }

    }


}

// ==========================================
// MAIN CLASS
// ==========================================
public class EncapsulationPractice {
    public static void main(String[] args) {

        // CHALLENGE LEVEL
        // TODO 3:
        // 1. Create an Employee object (emp): id = 101, name = "Kithsara", salary = 3000.0
        // 2. Try setting salary to 300.0 using setter (should print minimum wage error)
        // 3. Set salary to 3500.0 using setter (should succeed)
        // 4. Print details: "Employee [101] Kithsara - Salary: €3500.0" using getters
        
        Employee emp =new Employee(101, "Kithsara", 3000.0);
        emp.setSalary(300.0);
        emp.setSalary(3500.0);
        System.out.println("Employee [" + emp.getId() + "] " 
        + emp.getName() + " - Salary: €" + emp.getSalary());
        
    }
}

