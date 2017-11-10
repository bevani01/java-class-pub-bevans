package exercise5;

/**
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. The string representation of an object of this class depends on the value of the isFullTime member. If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 * @author bevani01
 */
public class Employee {
private String firstName;
private String lastName;
private double salary;
private Boolean fullTime;

public Employee(String firstName, String lastName, double salary, Boolean fullTime){
this.firstName = firstName;
this.lastName = lastName;
this.salary = salary;
this.fullTime = fullTime;
}
public String getFirstName() {
    return firstName;
}
public String getLastName() {
    return lastName;
}
public double getSalary() {
    return salary;
}
public boolean isFullTime() {
        return fullTime;
} 
public String toString(){
    if (fullTime == true){
    return String.format("%s %s %s %s", firstName, lastName, salary, fullTime); }
    else;{
    return String.format("%s %s %s %s", firstName, lastName, salary, fullTime);
}
}

    
}