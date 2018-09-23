package employee;

import org.apache.commons.collections4.CollectionUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static employee.ComparisonOfEmployeeLists.matchCriteria.MATCH;
import static employee.ComparisonOfEmployeeLists.matchCriteria.NON_MATCH;
import static employee.ExecuteEmployee.sortEmployees;
import static employee.comparators.CompareFactory.dataSamples.FULL_NAME;
import static employee.comparators.CompareFactory.employeeComparator;
import static runner.Runner.LOGGER;

public class ComparisonOfEmployeeLists {
    private static final String FILE_1_PATH = "src/main/resources/employees.csv";
    private static final String FILE_2_PATH = "src/main/resources/new_employees.csv";

    public enum matchCriteria {
        MATCH,
        NON_MATCH
    }

    public static void matchEmployeesFromLists(matchCriteria matchCriteria) throws IOException {
        try {
            List<Employee> list = EmployeeUtils. readFromFile(FILE_1_PATH);
            List<Employee> newList = EmployeeUtils.readFromFile(FILE_2_PATH);
            List<Employee> resultList = null;
            if (matchCriteria.equals(NON_MATCH)){
                resultList = (List<Employee>) CollectionUtils.disjunction(list, newList);
            } else if (matchCriteria.equals(MATCH)){
                resultList = (List<Employee>) CollectionUtils.intersection(list, newList);
            }
            sortEmployees(resultList, employeeComparator(FULL_NAME));
        } catch (FileNotFoundException e) {
            LOGGER.info("No csv File detected");
        }

    }

}
