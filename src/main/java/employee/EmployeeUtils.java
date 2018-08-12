package employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {

    private final static String FILE_PATH = "src/main/resources/employees.csv";

    private static List<Employee> readFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        List<String> employeeData = new ArrayList<String>();
        List<Employee> employees = new ArrayList<Employee>();

        while ((line = reader.readLine()) != null) {
            employeeData.add(line);
        }

        for (int i = 0; i < employeeData.size(); i++){
            String[] arr = employeeData.get(i).split(",");
            employees.add(new Employee(arr[0],arr[1],arr[2],arr[3]));
        }

       return employees;

    }

}
