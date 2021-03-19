package TheRealHero;

import java.time.LocalDate;

public class Doctor extends APerson{
    final private String title;

    public Doctor(String title , String firstName , String lastName , LocalDate dateOfBirth , String gender) {
        this.title = title;
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setGender(Gender.valueOf(gender));
    }

    public String getTitle() {
        return title;
    }
}
