package employee;

import employee.comparators.CompareFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static employee.EmployeeUtils.readFromFile;
import static employee.comparators.CompareFactory.dataSamples.*;
import static runner.Runner.LOGGER;

public class ExecuteEmployee  extends CompareFactory {
    private static final String FILE_1_PATH = "src/main/resources/employees.csv";

    public static void sortEmployeesByValue(dataSamples dataSample) throws IOException {
        try {
            List<Employee> employeesList = readFromFile(FILE_1_PATH);

            if (dataSample.equals(ID)){
                LOGGER.info("Sort by ID:");
                sortEmployees(employeesList, employeeComparator(ID));
            } else if (dataSample.equals(FULL_NAME)){
                LOGGER.info("Sort by FullName");
                sortEmployees(employeesList, employeeComparator(FULL_NAME));
            } else if (dataSample.equals(DATE_OF_BIRTH)){
                LOGGER.info("Sort by DateOfBirth");
                sortEmployees(employeesList, employeeComparator(DATE_OF_BIRTH));
            }
        } catch (FileNotFoundException e) {
            LOGGER.info("No csv File detected");
        }

    }

    static void sortEmployees (List<Employee> workers, Comparator<Employee> workerComparator){
        Collections.sort(workers, workerComparator);
        for (Employee worker : workers){
           LOGGER.info(worker.toString());
        }
    }

}
