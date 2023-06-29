import java.util.*;

public class StreamApi
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

        //those employees whose department is training
        list.stream().filter(emp->emp.getDepartment().equals("Training")).forEach(emp->System.out.println(emp));
    }
}

