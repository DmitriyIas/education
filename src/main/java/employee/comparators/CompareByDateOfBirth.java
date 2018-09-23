package employee.comparators;

import employee.Employee;

import java.util.Comparator;

public class CompareByDateOfBirth implements Comparator<Employee> {
    @Override
    public int compare(final Employee date1, final Employee date2){
        return date1.getDateOfBirth().compareTo(date2.getDateOfBirth());
    }

}
