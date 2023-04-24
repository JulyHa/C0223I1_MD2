package day07_04.model;

public class FullTime extends Employee{
    private int yearsOfExp;

    public FullTime() {
    }

    public FullTime(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public FullTime(int id, String name, int age, int yearsOfExp) {
        super(id, name, age);
        this.yearsOfExp = yearsOfExp;
    }
    public FullTime(Employee employee, int yearsOfExp) {
        super(employee.getId(), employee.getName(), employee.getAge());
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString() {
        return super.toString() +"FullTime{" +
                "yearsOfExp=" + yearsOfExp +
                '}';
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
}
