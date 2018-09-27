package runner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;

import java.util.Scanner;


import static employee.EmployeeMatcher.MatchValues.MATCH;
import static employee.EmployeeMatcher.MatchValues.NON_MATCH;
import static employee.EmployeeMatcher.matchEmployees;
import static employee.ExecuteEmployee.sortEmployeesByValue;
import static employee.comparators.CompareFactory.DataSamples.*;
import static minMaxAvgNumber.MinMaxAvgNumber.minMaxAvgCalculation;

import static palindromeVerification.PalindromeVerification.verification;
import static stringReverse.StringReverse.useReverse;

public class Runner {

    public static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);


    public void getRun() throws IOException {

        LOGGER.info("Enter the number of exercise you want to run: \n1 - palindrome \n2 - number \n3 - reverse \n4 - " +
                "sort Employees list by ID \n5 - sort Employees list by Full Name \n6 - sort Employees list by Date of Birth \n7 - show matched employees from 2 lists \n8 - show non-matched employees from 2 lists");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch (input) {
            case "1":
                verification();
                break;

            case "2":
                minMaxAvgCalculation();
                break;

            case "3":
                useReverse();
                break;

            case "4":
                sortEmployeesByValue(ID);
                break;

            case "5":
                sortEmployeesByValue(FULL_NAME);
                break;

            case "6":
                sortEmployeesByValue(DATE_OF_BIRTH);
                break;

            case "7":
                matchEmployees(MATCH);
                break;

            case "8":
                matchEmployees(NON_MATCH);
                break;

            default:
                break;

        }

    }
}
