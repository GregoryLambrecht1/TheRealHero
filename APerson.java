package TheRealHero;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class APerson{


    public enum Gender {
            MALE,
            FEMALE,
            TRANSGENDER
        }

        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private Gender gender;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return this.getFirstName() + " " + this.getLastName();
        }
    }

