package ie.gmit.examPOC;

/*
Author: Padraig Ó Cosgora
Student Number: G00311302
Date: 06/03/2020
Module: Software Engineering & Test Exam 2

This class will test the Employee class and ensure the functionality and error checking is operating as expected.

*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class EmployeeTest {

    private Employee myEmployee;

    @BeforeAll
    @DisplayName("Starting tests")
    public static void print() {
        System.out.println("Starting tests");
    }

    @BeforeEach
    @DisplayName("New Test timestamp")
    void init(TestInfo testInfo, TestReporter testReporter) {
        System.out.println("timestamp = " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Testing Employee Constructor - Valid Entry")
    void testEmployeeConstructor(TestInfo testInfo) {
        myEmployee = new Employee("mr", "Padraig", "12345678", "085836512", "full-time", 17);
        assertEquals(myEmployee.getTitle(), "mr");
        assertEquals(myEmployee.getName(), "Padraig");
        assertEquals(myEmployee.getPps(), "12345678");
        assertEquals(myEmployee.getPhoneNumber(), "085836512");
        assertEquals(myEmployee.getEmploymentType(), "full-time");
        assertEquals(myEmployee.getAge(), 17);
    }

    @Test
    @DisplayName("Testing Employee Constructor - Invalid Title")
    void testEmployeeConstructorInvalidTitle(TestInfo testInfo) {
        Exception invalidTitle = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee = new Employee("miss", "Padraig", "12345678", "085836512",
                    "contract", 17);
        });
        System.out.println(invalidTitle);
    }

    @Test
    @DisplayName("Testing Employee Constructor - Invalid Name")
    void testEmployeeConstructorInvalidName(TestInfo testInfo) {
        Exception invalidNameShort = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee = new Employee("mr", "ze", "12345678", "085836512",
                    "full-time", 17);
        });
        System.out.println(invalidNameShort);
        Exception invalidNameLong = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee = new Employee("mr", "Thisisasuperlongnameandthatsit", "12345678", "085836512",
                    "full-time", 17);
        });
        System.out.println(invalidNameLong);
    }

    @Test
    @DisplayName("Testing Employee Constructor - Invalid PPS")
    void testEmployeeConstructorInvalidPPS(TestInfo testInfo) {
        Exception invalidPPS = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee = new Employee("ms", "Padraig", "1234", "085836512",
                    "part-time", 17);
        });
        System.out.println(invalidPPS);
    }

    @Test
    @DisplayName("Testing Employee Constructor - Invalid Number")
    void testEmployeeConstructorInvalidNumber(TestInfo testInfo) {
        Exception invalidNumber = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee = new Employee("mrs", "Padraig", "12345678", "12345",
                    "contract", 17);
        });
        System.out.println(invalidNumber);
    }

    @Test
    @DisplayName("Testing Employee Constructor - Invalid Employment")
    void testEmployeeConstructorInvalidEmployment(TestInfo testInfo) {
        Exception invalidEmployment = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee = new Employee("mr", "Padraig", "12345678", "085836512",
                    "partial", 17);
        });
        System.out.println(invalidEmployment);
    }

    @Test
    @DisplayName("Testing Employee Constructor - Invalid Age")
    void testEmployeeConstructorInvalidAge(TestInfo testInfo) {
        Exception invalidAge = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee = new Employee("mr", "Padraig", "12345678", "085836512",
                    "part-time", 15);
        });
        System.out.println(invalidAge);
    }



}
