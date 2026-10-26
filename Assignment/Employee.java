package Assignment;


    /// Parent Class
    class Employee {

        String id;
        String name;
        String department;
        double basicSalary;

        /// Constructor
        Employee(String id, String name, String department, double basicSalary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.basicSalary = basicSalary;
        }

        /// Display Employee Info
        public void displayInfo() {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
        }

        /// Salary Method
        public void calculateSalary() {
            System.out.println("Salary: $" + basicSalary);
        }
    }

    /// Full Time Employee
    class FullTimeEmployee extends Employee {

        double allowance;

        FullTimeEmployee(String id, String name, String department, double basicSalary, double allowance) {
            super(id, name, department, basicSalary);
            this.allowance = allowance;
        }

        @Override
        public void calculateSalary() {
            double salary = basicSalary + allowance;

            System.out.println("Category: Full-Time Employee");
            System.out.println("Monthly Salary: $" + salary);
        }
    }

    /// Part Time Employee
    class PartTimeEmployee extends Employee {

        int hoursWorked;
        double hourlyRate;

        PartTimeEmployee(String id, String name, String department, int hoursWorked, double hourlyRate) {
            super(id, name, department, 0);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public void calculateSalary() {
            double salary = hoursWorked * hourlyRate;

            System.out.println("Category: Part-Time Employee");
            System.out.println("Monthly Salary: $" + salary);
        }
    }

    /// Managr Class
    class Manager extends Employee {

        double bonus;

        Manager(String id, String name, String department, double basicSalary, double bonus) {
            super(id, name, department, basicSalary);
            this.bonus = bonus;
        }

        @Override
        public void calculateSalary() {
            double salary = basicSalary + bonus;

            System.out.println("Category: Manager");
            System.out.println("Monthly Salary: $" + salary);
        }
    }

    /// Main Class
    class EmployeeSalaryManagement {

        public static void main() {

            // Objects
            FullTimeEmployee emp1 = new FullTimeEmployee("EMP001", "Jama Hussein", "IT", 600, 50);

            PartTimeEmployee emp2 = new PartTimeEmployee("EMP002", "Ali Abukar", "HR", 20, 12);

            Manager emp3 = new Manager("EMP003", "Abdullahi Ibrahim", "Management", 1000, 200);

            System.out.println(" EMPLOYEE SALARY REPORT ");

            emp1.displayInfo();
            emp1.calculateSalary();

            System.out.println();

            emp2.displayInfo();
            emp2.calculateSalary();

            System.out.println();

            emp3.displayInfo();
            emp3.calculateSalary();
        }
    }

