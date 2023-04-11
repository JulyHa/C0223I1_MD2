package Day07_04.model;

public class PartTime extends Employee{
    private int workTime;

    public PartTime() {
    }

    public PartTime(int workTime) {
        this.workTime = workTime;
    }

    public PartTime(int id, String name, int age, int workTime) {
        super(id, name, age);
        this.workTime = workTime;
    }
    public PartTime(Employee employee ,int workTime) {
        super(employee.getId(), employee.getName(), employee.getAge());
        this.workTime = workTime;
    }
    @Override
    public String toString() {
        return super.toString() + "PartTime{" +
                "workTime=" + workTime +
                '}';
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
