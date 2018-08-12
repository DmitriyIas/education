package employee;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Employee {

     Employee (String id, String firstName, String lastName, String date) {
        this.id = convertId(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = convertStringToDate(date);
    }

    private Integer id;
    private String firstName;
    private String lastName;
    private DateTime dateOfBirth;
    private static final String DATE_PATTERN = "dd/MM/yyyy";

    private DateTime convertStringToDate(String date){
        DateTimeFormatter format = DateTimeFormat.forPattern(DATE_PATTERN);
        return format.parseDateTime(date);
    }

    private Integer convertId(String id){
        return Integer.parseInt(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;
        return (id.equals(employee.id) &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                dateOfBirth.equals(employee.dateOfBirth));

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        return result;
    }
}
