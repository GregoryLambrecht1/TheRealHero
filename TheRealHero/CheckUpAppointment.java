import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class CheckUpAppointment {

    private Patient patient;
    private Assisant assistant;
    private double durationInMinutes;
    private ITreatment[] suggestedTreatments;

    public void reschedule(Doctor doctor){
        this.setDocto(doctor);
        int randomDayIndexWithingAWeekTime = new Random().nextInt(7);
        this.start= LocalDateTime.now().plusDays(randomDayIndexWithingAWeekTime);
        this.end = start.plusHours(1);








        public void printOverview(){
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









}

    @Override
    public String toString() {
        return "CheckUpAppointment{" +
                "patient=" + patient +
                ", assistant=" + assistant +
                ", durationInMinutes=" + durationInMinutes +
                ", suggestedTreatments=" + Arrays.toString(suggestedTreatments) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckUpAppointment that = (CheckUpAppointment) o;
        return Double.compare(that.durationInMinutes, durationInMinutes) == 0 && Objects.equals(patient, that.patient) && Objects.equals(assistant, that.assistant) && Arrays.equals(suggestedTreatments, that.suggestedTreatments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(patient, assistant, durationInMinutes);
        result = 31 * result + Arrays.hashCode(suggestedTreatments);
        return result;
    }
