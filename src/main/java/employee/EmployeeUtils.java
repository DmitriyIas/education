package employee;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 class EmployeeUtils {

    private EmployeeUtils(){}

    static final String DATE_PATTERN = "dd/MM/yyyy";

     static List<Employee> readFromFile(String filePath) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<Employee> employees = new ArrayList<>();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                employees.add(new Employee(convertId(arr[0]), arr[1], arr[2], convertStringToDate(arr[3])));
            }
        } finally {
            reader.close();
        }

        return employees;

    }

    private static DateTime convertStringToDate(String date) {
        DateTimeFormatter format = DateTimeFormat.forPattern(DATE_PATTERN);
        return format.parseDateTime(date);
    }

    private static Integer convertId(String id) {
        return Integer.parseInt(id);
    }


}
