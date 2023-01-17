public class Employee {
    private final String name;
    private int department;
    private int salary;
    static int counter = 1;
    private final int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Ф.И.О " + getName() + " Отдел " + getDepartment() + " Заработная плата " + getSalary() + " ID " + getId();
    }


}
