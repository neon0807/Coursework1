import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Employee[] workers = new Employee[10];
        workers[0] = new Employee("Aaa Aaa Aaa", 1, 30000);
        workers[1] = new Employee("Bbb Bbb Bbb", 2, 35000);
        workers[2] = new Employee("Ccc Ccc Ccc", 3, 32000);
        workers[3] = new Employee("Ddd Ddd Ddd", 4, 33000);
        workers[4] = new Employee("Eee Eee Eee", 5, 31000);
        workers[5] = new Employee("Fff Fff Fff", 1, 31500);
        workers[6] = new Employee("Ggg Ggg Ggg", 2, 30050);
        workers[7] = new Employee("Hhh Hhh Hhh", 3, 38000);
        workers[8] = new Employee("Iii Iii Iii", 4, 36000);
        workers[9] = new Employee("Jjj Jjj Jjj", 5, 35500);


        Employee allData = allData(workers);
        int sum = sum(workers);
        String employeeMinSalary = employeeMinSalary(workers);
        String employeeMaxSalary = employeeMaxSalary(workers);
        int averageSalary = averageSalary(workers,sum);
        String displayFio = displayFio(workers);
        int indexationSalary = indexationSalary(workers);
        String employeeMinSalaryByDepartment = employeeMinSalaryByDepartment(workers, sum);
        String employeeMaxSalaryByDepartment = employeeMaxSalaryByDepartment(workers);
        int sumByDepartment = sumByDepartment(workers);
        int averageSalaryByDepartment = averageSalaryByDepartment(workers);
        int indexationSalaryByDepartment = indexationSalaryByDepartment(workers);
        String displayFioByDepartment = displayFioByDepartment(workers);
        int withLowerSalary = withLowerSalary(workers);
        int withMoreSalary = withMoreSalary(workers);
    }

    public static Employee allData(Employee[] workers){
        Employee allData = workers[0];
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
        return allData;
    }

    public static int sum(Employee[] workers){
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + sum);
        return sum;
    }

    public static String employeeMinSalary(Employee[] workers){
        String employeeMinSalary = workers[0].getFio();
        int minSalary = workers[0].getSalary();
        for (int i = 0; i < workers.length; i++) {
            if (minSalary > workers[i].getSalary()){
                minSalary = workers[i].getSalary();
                employeeMinSalary = workers[i].getFio();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + employeeMinSalary + ", в размере - " + minSalary);
        return employeeMinSalary;
    }

    public static String employeeMaxSalary(Employee[] workers){
        String employeeMaxSalary = workers[0].getFio();
        int maxSalary = workers[0].getSalary();
        for (int i = 0; i < workers.length; i++) {
            if (maxSalary < workers[i].getSalary()){
                maxSalary = workers[i].getSalary();
                employeeMaxSalary = workers[i].getFio();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + employeeMaxSalary + ", в размере - " + maxSalary);
        return employeeMaxSalary;
    }

    public static int averageSalary(Employee[] workers, int sum){
        int averageSalary = sum / workers.length;
        System.out.println("Среднее значение зарплат всех сотрудников составит - " + averageSalary);
        return averageSalary;
    }

    public static String displayFio(Employee[] workers){
        System.out.println("Cписок Ф.И.О. всех сотрудников:");
        String displayFio = workers[0].getFio();
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getFio());
        }
        return displayFio;
    }

    public static int indexationSalary(Employee[] workers){
        System.out.println("Введите величену индексации зарплаты в %");
        Scanner scanner = new Scanner(System.in);
        int indexation = scanner.nextInt();
        int indexationSalary = 0;
        for (int i = 0; i < workers.length; i++) {
            indexationSalary =workers[i].getSalary() + workers[i].getSalary() * indexation / 100;
            System.out.println("Проиндексированая зарплата у " + workers[i].getFio() + ", составит: " + indexationSalary);
        }
        return indexationSalary;
    }

    public static String employeeMinSalaryByDepartment(Employee[] workers, int sum){
        System.out.println("Введите номер отдела для отбора по минимальной зарплате");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        String employeeMinSalaryByDepartment = workers[0].getFio();
        int minSalaryByDepartment = sum;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getDepartment() == department){
                if (workers[i].getSalary() < minSalaryByDepartment){
                    employeeMinSalaryByDepartment = workers[i].getFio();
                    minSalaryByDepartment = workers[i].getSalary();
                }
            }
        }
        System.out.println("Сотрудник в отделе №" + department + ", с минимальной зарплатой - " + minSalaryByDepartment + ", это: " + employeeMinSalaryByDepartment);
        return employeeMinSalaryByDepartment;
    }

    public static String employeeMaxSalaryByDepartment(Employee[] workers){
        System.out.println("Введите номер отдела для отбора по максимальной зарплате");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        String employeeMaxSalaryByDepartment = workers[0].getFio();
        int maxSalaryByDepartment= 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getDepartment() == department){
                if (workers[i].getSalary() > maxSalaryByDepartment){
                    employeeMaxSalaryByDepartment = workers[i].getFio();
                    maxSalaryByDepartment = workers[i].getSalary();
                }
            }
        }
        System.out.println("Сотрудник в отделе №" + department + ", с максимальной зарплатой - " + maxSalaryByDepartment + ", это: " + employeeMaxSalaryByDepartment);
        return employeeMaxSalaryByDepartment;
    }

    public static int sumByDepartment(Employee[] workers){
        System.out.println("Введите номер отдела для затрат на зарплаты в месяц");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        int sumByDepartment = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getDepartment() == department){
                sumByDepartment += workers[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в отделе №" + department + " в месяц составит - " + sumByDepartment);
        return sumByDepartment;
    }

    public static int averageSalaryByDepartment(Employee[] workers) {
        System.out.println("Введите номер отдела для средней зарплаты в месяц");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        int sumByDepartment = 0;
        int numberOfEmployees = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getDepartment() == department) {
                sumByDepartment += workers[i].getSalary();
                numberOfEmployees ++;
            }
        }
        System.out.println("Среднее значение зарплат у сотрудников №" + department + " в месяц составит - " + sumByDepartment / numberOfEmployees);
        return sumByDepartment / numberOfEmployees;
    }

    public static int indexationSalaryByDepartment(Employee[] workers){
        System.out.println("Введите номер отдела для индексации зарплаты");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        System.out.println("Введите величену индексации зарплаты отдела в %");
        int indexation = scanner.nextInt();
        int indexationSalaryByDepartment = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getDepartment() == department){
                indexationSalaryByDepartment =workers[i].getSalary() + workers[i].getSalary() * indexation / 100;
                System.out.println("Проиндексированая зарплата у " + workers[i].getFio() + ", в отделе №" + department +", составит: " + indexationSalaryByDepartment);
            }
        }
        return indexationSalaryByDepartment;
    }

    public static String displayFioByDepartment(Employee[] workers){
        System.out.println("Введите номер отдела для вывода всех сотрудников");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        System.out.println("Cписок Ф.И.О. всех сотрудников отдела №" + department);
        String displayFioByDepartment = workers[0].getFio();
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getDepartment() == department){
                System.out.println("Ф.И.О. сотрудника - " + workers[i].getFio() + "; Зарплата - " + workers[i].getSalary() + "; ID сотрудника - " + workers[i].getId());
            }
        }
        return displayFioByDepartment;
    }

    public static int withLowerSalary(Employee[] workers){
        System.out.println("Введите сумму для сравнения зарплаты:");
        Scanner scanner = new Scanner(System.in);
        int sumMin = scanner.nextInt();
        System.out.println("Список сотрудников с зарплатой меньше " + sumMin + ":");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() < sumMin){
                System.out.println("ID сотрудника - " + workers[i].getId() + "; Ф.И.О. сотрудника - " + workers[i].getFio() + "; Зарплата - " + workers[i].getSalary());
            }
        }
        return sumMin;
    }

    public static int withMoreSalary(Employee[] workers){
        System.out.println("Введите сумму для сравнения зарплаты:");
        Scanner scanner = new Scanner(System.in);
        int sumMax = scanner.nextInt();
        System.out.println("Список сотрудников с зарплатой больше или равно " + sumMax + ":");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() >= sumMax){
                System.out.println("ID сотрудника - " + workers[i].getId() + "; Ф.И.О. сотрудника - " + workers[i].getFio() + "; Зарплата - " + workers[i].getSalary());
            }
        }
        return sumMax;
    }
}