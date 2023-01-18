package staff;

public abstract class Employee {
    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

//    public void setName(String name){
//        if (name != null) {
//            this.name = name;
//        }
//    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryRaise) {
//        if (salaryRaise > 0){
            this.salary += salaryRaise;
//        }
    }

    public double payBonus(double salary){
        return this.salary / 100;
    }
}
