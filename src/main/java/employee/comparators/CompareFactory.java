package employee.comparators;


import employee.Employee;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;

import static employee.comparators.CompareFactory.DataSamples.DATE_OF_BIRTH;
import static employee.comparators.CompareFactory.DataSamples.FULL_NAME;
import static employee.comparators.CompareFactory.DataSamples.ID;

public class CompareFactory {

    private static final Map<DataSamples, Comparator<Employee>> map = new EnumMap<>(DataSamples.class);

    static {
        map.put(DATE_OF_BIRTH, new CompareByDateOfBirth());
        map.put(FULL_NAME, new CompareByFullName());
        map.put(ID, new CompareById());
    }

    public enum DataSamples {
        DATE_OF_BIRTH,
        FULL_NAME,
        ID
    }

    public static Comparator<Employee> employeeComparator(DataSamples dataSample) {
        return map.get(dataSample);
    }

}
