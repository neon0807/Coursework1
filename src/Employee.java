public class Employee {

    private String fio;
    private int department;
    private int salary;
    private int id;
    public static int counter = 1;



    public Employee(String fio, int department, int salary){
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getFio(){
        return fio;
    }

    public int getDepartment(){
        return department;
    }

    public int setDepartment(){
        return department;
    }

    public int getSalary(){
        return salary;
    }

    public int setSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "Ф.И.О сотрудника- " + fio + "; Отдел - " + department + "; Зарплата - " + salary + "; ID сотрудника - " + id;
    }

}
