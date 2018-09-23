package employee.comparators;

import employee.Employee;

import java.util.Comparator;

public class CompareById implements Comparator<Employee> {
    @Override
    public int compare(final Employee id1, final Employee id2){
        return id1.getId().compareTo(id2.getId());
    }


}
