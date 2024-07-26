import java.io.*;
import java.util.LinkedList;
import java.io.IOException;
public class  FileHandler {
    public void appendFile(String emp) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt", true))) {
            writer.write(emp + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void overwriteFile(LinkedList<Employee> employees) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.temp", false))) {
            String data;
            for (Employee employee : employees) {
                data = employee.toString();
                writer.write(data + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            File f = new File("employees.txt");
            File temp = new File("employees.temp");
            f.delete();
            temp.renameTo(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

