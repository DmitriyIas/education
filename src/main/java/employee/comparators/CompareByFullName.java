package employee.comparators;

import employee.Employee;

import java.util.Comparator;

public class CompareByFullName implements Comparator<Employee> {
    @Override
    public int compare(final Employee person1, final Employee person2) {
        String fullName1 = person1.getFirstName() + person1.getLastName();
        String fullName2 = person2.getFirstName() + person2.getLastName();
        return fullName1.compareTo(fullName2);
    }

}
