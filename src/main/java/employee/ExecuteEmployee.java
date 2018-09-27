package employee;



import employee.comparators.CompareFactory;
import employee.comparators.CompareFactory.DataSamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


import static employee.EmployeeUtils.readFromFile;

import static runner.Runner.LOGGER;

public class ExecuteEmployee {

    public ExecuteEmployee(){}

    private static final String FILE_1_PATH = "src/main/resources/employees.csv";

    public static void sortEmployeesByValue(DataSamples dataSample) throws IOException {
        try {
            List<Employee> employeesList = readFromFile(FILE_1_PATH);
            sortEmployees(employeesList, CompareFactory.employeeComparator(dataSample));
        } catch (FileNotFoundException e) {
            fileNotFoundExceptionMessage();
        }
    }

    static void sortEmployees(List<Employee> workers, Comparator<Employee> workerComparator) {
        Collections.sort(workers, workerComparator);
        for (Employee worker : workers) {
            LOGGER.info(worker.toString());
        }
    }

    static void fileNotFoundExceptionMessage() {
        LOGGER.info("No csv File detected");
    }


}
