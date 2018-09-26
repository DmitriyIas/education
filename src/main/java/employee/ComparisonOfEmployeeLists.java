package employee;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import static employee.ExecuteEmployee.sortEmployees;
import static employee.MatchFilter.getMatchList;
import static employee.MatchFilter.getNonMatchList;
import static employee.comparators.CompareFactory.DataSamples.FULL_NAME;
import static employee.comparators.CompareFactory.employeeComparator;
import static runner.Runner.LOGGER;

public class ComparisonOfEmployeeLists {

    ComparisonOfEmployeeLists(){}

    private static final String FILE_1_PATH = "src/main/resources/employees.csv";
    private static final String FILE_2_PATH = "src/main/resources/new_employees.csv";

    public static void getMatchEmployeesList() throws IOException {
        try {
            List<Employee> list = EmployeeUtils. readFromFile(FILE_1_PATH);
            List<Employee> newList = EmployeeUtils.readFromFile(FILE_2_PATH);
            sortEmployees(getMatchList(list, newList), employeeComparator(FULL_NAME));
        } catch (FileNotFoundException e) {
            LOGGER.info("No csv File detected");
        }
    }

    public static void getNonMatchEmployeesList() throws IOException {
        try {
            List<Employee> list = EmployeeUtils. readFromFile(FILE_1_PATH);
            List<Employee> newList = EmployeeUtils.readFromFile(FILE_2_PATH);
            sortEmployees(getNonMatchList(list, newList), employeeComparator(FULL_NAME));
        } catch (FileNotFoundException e) {
            LOGGER.info("No csv File detected");
        }
    }

}
