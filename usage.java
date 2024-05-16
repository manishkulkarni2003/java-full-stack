package employee;


    public static void main(String[] args) {
        // Create an Employee instance
        Employee emp = new Employee("Manish", "E1234", 50000);

        // Accessing attributes using getter methods
        System.out.println("Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());

        // Modifying attributes using setter methods
        emp.setName("Swapnil");
        emp.setSalary(60000);

        // Display modified attributes
        System.out.println("\nAfter modification:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}


 public static void main(String[] args) {
        // Create a Developer instance
        Developer developer = new Developer("Jane Doe", "D456", 60000, "Java");

        // Accessing attributes using getter methods
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeId());
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        // Modifying attributes using setter methods
        developer.setSalary(70000);
        developer.setProgrammingLanguage("Python");

        // Display modified attributes
        System.out.println("\nAfter modification:");
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}