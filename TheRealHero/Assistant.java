package TheRealHero;

import java.time.LocalDate;

public class Assistant extends APerson {

    public Assistant(String firstName , String lastName , LocalDate dateOfBirth , String gender){
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setGender(Gender.valueOf(gender));
    }
}
