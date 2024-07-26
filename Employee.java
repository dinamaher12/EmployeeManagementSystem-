public class Employee {
    private int ID;
    private String Name;
    private double Salary;
    private String Department;
    private String Email;
    public Employee(){}
    public Employee(int id,String name,double salary, String dep, String email){
        this.ID = id;
        this.Name = name;
        this.Salary = salary;
        this.Department = dep;
        this.Email = email;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
    public String getDepartment(){
        return Department;
    }
    public String getEmail(){
        return Email;
    }
    public double getSalary(){
        return Salary;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setDepartment(String Department){
        this.Department = Department;
    }
    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String toString(){
        return ID + ", " + Name + ", " + Department + ", " + Salary + ", " + Email;
    }
}
