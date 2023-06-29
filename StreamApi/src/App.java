import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(104, "Rahul", "Marketing", 20000));
        list.add(new Employee(101, "Krisna", "Sales", 34000));
        list.add(new Employee(103, "Prince", "Training", 55000));
        list.add(new Employee(105, "Vikash", "Sales", 30000));
        list.add(new Employee(102, "Niranjan", "Marketing", 15000));
        list.add(new Employee(106, "Priya", "Training", 65000));

        for (Employee emp : list)
        {
            if(emp.getSalary()>=34000)
            {
                System.out.println(emp);
            }
        }
        //we Will do this using stream api in further application
    }
}