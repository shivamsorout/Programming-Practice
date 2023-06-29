import java.util.*;

public class StreamApi3
{
    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(104, "Rahul", "Marketing", 20000));
        list.add(new Employee(101, "Krisna", "Sales", 34000));
        list.add(new Employee(103, "Prince", "Training", 55000));
        list.add(new Employee(105, "Vikash", "Sales", 30000));
        list.add(new Employee(102, "Niranjan", "Marketing", 15000));
        list.add(new Employee(106, "Priya", "Training", 65000));

        //print employees according to ascending order of salary
       // list.stream().sorted((emp1,emp2)->emp1.getSalary()-emp2.getSalary()).forEach(emp->System.out.println(emp));

        list.stream().sorted(Comparator.comparingInt(Employee::getSalary)).forEach(emp->System.out.println(emp));
    }
}
