import java.time.Duration;
import java.time.LocalTime;

public interface ITreatment {
    void start(LocalTime started, Duration duration);
    void continu(LocalTime continued, Duration duration );
    void complete(LocalTime completed);
    Duration getTotalDurationForTreatment();











}
