package TheRealHero;

import java.time.LocalTime;

public  abstract class Employee extends APerson {
    String department;
    LocalTime [] workingHours;
    double YearsOfExperience;


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalTime[] getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(LocalTime[] workingHours) {
        this.workingHours = workingHours;
    }

    public double getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        YearsOfExperience = yearsOfExperience;
    }

    public void sendMessageToAnEmployee(String message , Employee employee){
        String title = "message: ";
        String from = "from " + super.getFirstName() + " " + super.getLastName();
        String to = "to " + employee;
        System.out.println(title + "\n" + from + "\n" + to + "\n" + message);
    }
}
