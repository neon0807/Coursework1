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
        int averageSalary = averageSalary(workers);
        String displayFio = displayFio(workers);
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

    public static int averageSalary(Employee[] workers){
        int averageSalary = sum(workers) / workers.length;
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

}