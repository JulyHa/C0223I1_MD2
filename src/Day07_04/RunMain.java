package Day07_04;

public class RunMain {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        FullTime f = new FullTime(1, "NguyenNgu", 21, 10 );
        PartTime p = new PartTime(2, "Van A", 20, 24);

        employees[0] = (Employee) f;
        employees[1] = (Employee) p;

        for(int i =0; i< 2; i++){
            if(employees[i] instanceof FullTime){ // instanceof tương tự type of
                FullTime f1 = (FullTime) employees[i];
                System.out.println(f1.getYearsOfExp() * 2000000);
            }
            else {
                PartTime f1 = (PartTime) employees[i];
                System.out.println(f1.getWorkTime() * 25000);
            }
        }

    }



}
