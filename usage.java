package employee;


    public static void main(String[] args) {
       
        Employee emp = new Employee("Manish", "E1234", 50000);

       
        System.out.println("Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());

        
        emp.setName("Swapnil");
        emp.setSalary(60000);

    
        System.out.println("\nAfter modification:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}


 public static void main(String[] args) {
        
        Developer developer = new Developer("Jane Doe", "D456", 60000, "Java");

       
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeId());
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

   
        developer.setSalary(70000);
        developer.setProgrammingLanguage("Python");

      
        System.out.println("\nAfter modification:");
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
