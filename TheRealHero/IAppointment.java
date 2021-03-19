package TheRealHero;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public interface IAppointment {

    Duration APPOINTMENT_MAX_DURATION = null;

    void set (Patient patient, Doctor doctor, Assistant assistant);

    Patient getPatient();

    void setPatient (Patient patient);

    Doctor getDoctor();

    void setDoctor (Doctor doctor);

    void setAssistant (Assistent assistant);

    Assistant getAssistant ();

    void setTime (LocalDate date, Duration duration);

    Date getDate ();

    void cancel();

    void reschedule (Doctor doctor);

    void reschedule();

    void printOverview();


}
