import java.util.Scanner;
import java.util.LinkedList;
import static java.lang.System.exit;
public class Main {
    public static void main(String[] args) {
        EmployeeSystem es = new EmployeeSystem();
        FileHandler fh = new FileHandler();
        LinkedList employees = new LinkedList();
        try {
            try (Scanner scanner = new Scanner((System.in))) {
                while (true) {
                    System.out.println(
                            "1. Add New Employee.\n" +
                            "2. Update Employee Data.\n" +
                            "3. Delete Employee.\n" +
                            "4. Search Employee by ID.\n" +
                            "5. Search Employee by Name.\n" +
                            "6. View All Employees.\n" +
                            "7. Clear Employees.\n" +
                            "8. Exit.\n");

                    System.out.println("Choose num: ");
                    String choice;
                    choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            String input = es.addEmployee(employees);
                            fh.appendFile(input);
                            break;
                        case "2":
                            es.updateEmployee(employees);
                            fh.overwriteFile(employees);
                            break;
                        case "3":
                            es.deleteEmployee(employees);
                            fh.overwriteFile(employees);
                            break;
                        case "4":
                            es.searchEmpByID(employees);
                            break;
                        case "5":
                            es.searchEmpByName(employees);
                            break;
                        case "6":
                            es.getAllEmployees(employees);
                            break;
                        case "7":
                            es.clear(employees);
                            fh.overwriteFile(employees);
                            break;
                        case "8":
                            System.out.println("Exiting...");
                            exit(0);
                        default:
                            System.out.println("Invalid Choice.");
                            break;
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
