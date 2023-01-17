public class Main {
    public static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Чинько Никита Романович ", 1, 25000);
        employees[1] = new Employee("Герасимова Дарья Сергеевна ", 2, 57000);
        employees[2] = new Employee("Конинов Анатолий Павлович ", 3, 45000);
        employees[3] = new Employee("Чинько Роман Леонидович ", 4, 12000);
        employees[4] = new Employee("Чинько Ольга Генадьевна ", 5, 28000);
        employees[5] = new Employee("Рощина Елизавета Викторовна ", 1, 50000);
        employees[6] = new Employee("Самойлов Артём Витальевич ", 2, 40000);
        employees[7] = new Employee("Сухаревская Мария Андреевна ", 3, 39000);
        employees[8] = new Employee("Иванов Иван Иванович ", 4, 35000);
        employees[9] = new Employee("Кищук Георгий Владиславович ", 5, 45000);

        getAllData();
        finalMinSalary();
        finalMaxSalary();

        System.out.println("Сумма затрат на зарплаты в месяц " + salaryPerMonth());
        System.out.println("Среднее значение зарплат " + countAverage());
        getStaff();
    }

    public static void getAllData() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int salaryPerMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static void finalMinSalary() {
        int minValue = Integer.MAX_VALUE;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minValue) {
                minValue = employees[i].getSalary();
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник" + employee.getName() + "минимальная зарплата" + employee.getSalary());
    }

    public static void finalMaxSalary() {
        int maxValue = Integer.MIN_VALUE;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < maxValue) {
                maxValue = employees[i].getSalary();
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник" + employee.getName() + "максимальная зарплата" + employee.getSalary());
    }

    public static double countAverage() {
        double count = salaryPerMonth() / employees.length;
        return count;
    }

    public static void getStaff() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}







