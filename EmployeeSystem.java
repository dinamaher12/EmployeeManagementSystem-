import java.util.LinkedList;
import java.util.Scanner;
public class EmployeeSystem {
    final private Scanner scanner = new Scanner(System.in);
    public String addEmployee(LinkedList<Employee> employees) {
        Employee emp;
        String name, dep, email, str;
        int id;
        double salary;
        // Fix this soon with the file
        if (employees.size() > 0) {
            id = (employees.getLast().getID())+1;
        } else {
            id = 1;
        }
        System.out.println("Enter Employee Name: ");
        name = scanner.next();
        System.out.println("Enter Employee Department: ");
        dep = scanner.next();
        System.out.println("Enter Employee Email: ");
        email = scanner.next();
        System.out.println("Enter Employee Salary: ");
        salary = scanner.nextDouble();
        emp = new Employee(id, name, salary, dep, email);
        employees.add(emp);
        System.out.println("New Employee added.\n");
        str = emp.toString();
        return str;
    }

    public void updateEmployee(LinkedList<Employee> employees) {
        int id;
        String newDep,newEmail,choice;
        double newSalary;
        System.out.println("Enter Employee ID: ");
        id = scanner.nextInt();
        for (Employee employee : employees) {
            if (employee.getID() == id) {
                System.out.print("What to update: 1-Salary 2-Department 3-Email: ");
                choice = scanner.next();
                switch (choice) {
                    case "1" -> {
                        System.out.println("Enter New Salary for Employee: ");
                        newSalary = scanner.nextDouble();
                        employee.setSalary(newSalary);
                        System.out.println("Employee Salary Updated.");
                        System.out.println("Employee New Salary: " + employee.getSalary() + "\n");
                    }
                    case "2" -> {
                        System.out.println("Enter New Department for Employee: ");
                        newDep = scanner.next();
                        employee.setDepartment(newDep);
                        System.out.println("Employee Department Updated.");
                        System.out.println("Employee New Department: " + employee.getDepartment() + "\n");
                    }
                    case "3" -> {
                        System.out.println("Enter New E-mail for Employee: ");
                        newEmail = scanner.next();
                        employee.setEmail(newEmail);
                        System.out.println("Employee E-mail Updated.");
                        System.out.println("Employee New E-mail: " + employee.getEmail() + "\n");
                    }
                    default -> System.out.println("Invalid Input.\n\n");
                }
            } else {
                System.out.println("Employee Id Not Exist.\n\n");
            }
        }
    }

    public void deleteEmployee(LinkedList<Employee> employees) {
        int id;
        System.out.println("Enter Employee ID: ");
        id = scanner.nextInt();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getID() == id) {
                employees.remove(i);
                System.out.println("Employee Deleted.\n\n");
                return;
            } else {
                System.out.println("Employee Not Found.\n\n");
            }
        }
    }

    public void searchEmpByID(LinkedList<Employee> employees) {
        int id;
        System.out.println("Enter Employee ID: ");
        id = scanner.nextInt();
        if(employees.size() == 0){
            System.out.println("No Employee Exist.\n");
            return;
        }
        for (Employee employee : employees) {
            if (employee.getID() == id) {
                System.out.println("Employee Name: " + employee.getName() + "\nEmployee Department: " + employee.getDepartment()
                        + "\nEmployee Salary: " + employee.getSalary() + "\nEmployee E-mail: " + employee.getEmail() + "\n");
            } else {
                System.out.println("Employee Not Found.\n\n");
            }
        }
    }
    public void searchEmpByName(LinkedList<Employee>employees){
        String name;
        System.out.println("Enter Employee Name: ");
        name = scanner.next();
        if(employees.size() == 0){
            System.out.println("No Employee Exist.\n");
            return;
        }
        for (Employee employee : employees)
            if (employee.getName().equals(name)) {
                System.out.println("Employee ID: " + employee.getID() + "\nEmployee Department: " + employee.getDepartment()
                        + "\nEmployee Salary: " + employee.getSalary() + "\nEmployee E-mail: " + employee.getEmail() + "\n");
            } else {
                System.out.println("Employee Not Found.\n\n");
            }
    }
    public void getAllEmployees(LinkedList<Employee>employees){
        for(int i=0; i<employees.size(); i++){
            System.out.println("Employee " + (i+1) + "Details: ");
            System.out.println("Employee Name: " + employees.get(i).getName() + "\nEmployee ID: " + employees.get(i).getID() + "\nEmployee Department: " + employees.get(i).getDepartment()
                    + "\nEmployee Salary: " + employees.get(i).getSalary() + "\nEmployee E-mail: " + employees.get(i).getEmail() + "\n");

        }
    }

    public void clear(LinkedList<Employee>employees){
            employees.clear();
            System.out.println("File is Empty.\n");
    }
}

