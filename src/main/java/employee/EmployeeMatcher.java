package employee;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;


import static employee.EmployeeMatcher.MatchValues.MATCH;
import static employee.EmployeeMatcher.MatchValues.NON_MATCH;
import static employee.ExecuteEmployee.fileNotFoundExceptionMessage;
import static employee.ExecuteEmployee.sortEmployees;
import static employee.MatchFilter.getMatchList;
import static employee.MatchFilter.getNonMatchList;

import static employee.comparators.CompareFactory.DataSamples.FULL_NAME;

import static employee.comparators.CompareFactory.employeeComparator;


public class EmployeeMatcher {

    private EmployeeMatcher(){}

    private static final String FILE_1_PATH = "src/main/resources/employees.csv";
    private static final String FILE_2_PATH = "src/main/resources/new_employees.csv";

    public enum MatchValues {
        MATCH,
        NON_MATCH
    }

    public static void matchEmployees(MatchValues matchValues) throws IOException {
        try {
            List<Employee> list = EmployeeUtils.readFromFile(FILE_1_PATH);
            List<Employee> newList = EmployeeUtils.readFromFile(FILE_2_PATH);
            Map<MatchValues, List<Employee>> map = new EnumMap<>(MatchValues.class);
            map.put(MATCH, getMatchList(list, newList));
            map.put(NON_MATCH, getNonMatchList(list, newList));
            sortEmployees(map.get(matchValues), employeeComparator(FULL_NAME));
        } catch (FileNotFoundException e) {
            fileNotFoundExceptionMessage();
        }
    }
}
