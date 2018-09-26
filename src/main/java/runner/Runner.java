package runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;
import static employee.ComparisonOfEmployeeLists.getMatchEmployeesList;
import static employee.ComparisonOfEmployeeLists.getNonMatchEmployeesList;
import static employee.ExecuteEmployee.sortEmployeesByValue;
import static employee.comparators.CompareFactory.DataSamples.*;
import static minMaxAvgNumber.MinMaxAvgNumber.minMaxAvgCalculation;
import static palindromeVerification.PalindromeVerification.verification;
import static stringReverse.StringReverse.useReverse;

public class Runner {

    public static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

    public void getRun() throws IOException {

        LOGGER.info("Enter the number of exercise you want to run: \n1 - palindrome \n2 - number \n3 - reverse \n4 - " +
                            "Employees list");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if ("1".equals(input)) {
            verification();
        } else if ("2".equals(input)) {
            minMaxAvgCalculation();
        } else if ("3".equals(input)) {
            useReverse();
        } else if ("4".equals(input)){
            LOGGER.info("Enter the number of operation you want to run with employees?: \n1 - sort by ID \n2 - " +
                                "sort by Full Name " +
                                "\n3 - sort by Date Of Birth \n4 - show matched employees from two lists \n5 - show " +
                                "non-matched employees from two lists" );
            String inp = sc.nextLine();
            if ("1".equals(inp)){
                sortEmployeesByValue(ID);
            } else if ("2".equals(inp)){
                sortEmployeesByValue(FULL_NAME);
            } else if ("3".equals(inp)){
                sortEmployeesByValue(DATE_OF_BIRTH);
            } else  if ("4".equals(inp)){
                getMatchEmployeesList();
            } else if ("5".equals(inp)){
                getNonMatchEmployeesList();
            }
        }

    }
}
