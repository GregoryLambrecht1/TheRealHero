package TheRealHero;

import java.time.LocalTime;
import java.util.Objects;

public class CovidAppointment {

    private Patient patient;
    private Doctor doctor;
    private Assistant assistant;
    private LocalTime start;
    private LocalTime end;

    public void printOverview() {
        String patientFullName = this.getPatient().getFirstName() + " " + this.getPatient().getLastName();
        String doctorTitle = this.getDoctor().getTitle();
        String doctorFullName = this.getDoctor().getFirstName() + " " + this.getDoctor().getLastName();
        String scheduledDate = start.toLocalDate().toString();
        String scheduledTime = start.toLocalTime().toString();
        String treatmentInfo = "[Information about the treatment]";
        String covidStatus = "[Negative | Positive]";
        String sheetToPrint = "Patient: " + patientFullName + "\n" + "\n" + "Doctor: " + doctorTitle + " " + doctorFullName + "\n" + "\n" + "Scheduled Date: " + scheduledDate + "\n" + "\n" + "Scheduled Time: " + scheduledTime + "\n" + "\n" + "Treatment: " + treatmentInfo + "\n" + "\n" + "Covid Status: " + covidStatus;
        System.out.println(sheetToPrint);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CovidAppointment)) return false;
        CovidAppointment that = (CovidAppointment) o;
        return Objects.equals(patient, that.patient) && Objects.equals(doctor, that.doctor) && Objects.equals(assistant, that.assistant) && Objects.equals(start, that.start) && Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient, doctor, assistant, start, end);
    }

    @Override
    public String toString() {
        return "CovidAppointment{" +
                "patient=" + patient +
                ", doctor=" + doctor +
                ", assistant=" + assistant +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
