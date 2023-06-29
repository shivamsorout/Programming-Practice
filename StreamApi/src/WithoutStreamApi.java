import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class WithoutStreamApi
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

        class AA implements Predicate<Employee>
        {
            public boolean test(Employee emp)
            {
//				boolean res = emp.getDepartment().equals("Sales");
                return emp.getDepartment().equals("Sales");
            }
        }
        class BB implements Consumer<Employee>
        {
            public void accept(Employee emp)
            {
                System.out.println(emp);
            }
        }
        list.stream().filter(new AA()).forEach(new BB());
    }

}
