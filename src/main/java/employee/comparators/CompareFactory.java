package employee.comparators;

import employee.Employee;

import java.util.Comparator;

import static employee.comparators.CompareFactory.dataSamples.*;

public class CompareFactory {

    public enum dataSamples {
        DATE_OF_BIRTH,
        FULL_NAME,
        ID
    }

    public static Comparator<Employee> employeeComparator(dataSamples dataSample){

        if (dataSample.equals(DATE_OF_BIRTH)){
            return new CompareByDateOfBirth();
        } else if (dataSample.equals(FULL_NAME)){
            return new CompareByFullName();
        } else if (dataSample.equals(ID)){
            return new CompareById();
        } else {
            return null;
        }
    }



}