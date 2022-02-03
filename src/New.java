import java.util.*;
public class New {
    private String Name;
    private double Salary;
    private int empId;

    public New(String name, double salary, int empId) {
        Name = name;
        Salary = salary;
        this.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }

    public int getEmpId() {
        return empId;
    }
    public static int searchName(New obj,String inputName){
        int count =0;
        for(int i=0;i<3;i++){
            if(obj.getName().equalsIgnoreCase(inputName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double salary=sc.nextDouble();sc.nextLine();
        int empid=sc.nextInt();sc.nextLine();

        New obj=new New(name,salary,empid);

        String inputName=sc.nextLine();
        int res=searchName(obj,inputName);
        if(res>=1){
            System.out.println("name is present in company data");
        }
        else{
            System.out.println("not present !!");
        }

//        System.out.println("salary of sidharth is "+obj.getSalary());


    }
}
