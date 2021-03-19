package TheRealHero;

import java.time.LocalDate;

public class Patient extends APerson {
final private String Phone;

    public Patient(String firstName , String lastName , LocalDate dateOfBirth , String gender , String phone) {
        this.Phone = phone;
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setGender(Gender.valueOf(gender));
    }

    public String getPhone() {
        return Phone;
    }

}
