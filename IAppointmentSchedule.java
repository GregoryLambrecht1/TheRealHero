package Opdrachten.TheRealHero;

public interface IAppointmentSchedule  {
    void addAppointment (IAppointment appointment);
    void removeAppointment (IAppointment appointment);
    void cancelAppointment (IAppointment appointment);
    void IAppointment[] getAllAppointments();
}
