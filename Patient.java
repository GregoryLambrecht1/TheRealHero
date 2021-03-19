<<<<<<< HEAD
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
=======
package Opdrachten.TheRealHero;

import java.time.LocalDate;

public class Patient implements IAppointmentSchedule {
    final String phone;
    final String eid;
    final StringBuilder appointmentsInfo = new StringBuilder();
    IAppointment[] appointments;
    ITreatment[] treatments;

    public Patient(String phone, String eid) {
        this.phone = phone;
        this.eid = eid;
    }


    public void Patient(String phone, String eid){
        System.out.println("Je gsmnummer is: " + phone + " en je eid is: " + eid);
    }

    public void requestCheckUp(CheckUpAppointment appointment){
        System.out.println("Je hebt een afspraak op: " + appointment);
    }

    public void requestCovidResults(LocalDate date){
        System.out.println(date);
    }

    public void requestCovidTest(LocalDate date, CovidAppointment appointment){
        System.out.println("De datum is: " + date + appointment);
    }

    String getAppointmentsInfo(){
        return getAppointmentsInfo();
    }

    @Override
    public void addAppointment(IAppointment appointment) {

    }

    @Override
    public void removeAppointment(IAppointment appointment) {

    }

    @Override
    public void cancelAppointment(IAppointment appointment) {

    }

    @Override
    public void IAppointment[] getAllAppointments(){
        for(int i = 0; i<IAppointment.length; i++){
            System.out.println(IAppointment[i]);
        }
>>>>>>> 60b3ffb39cc2109f87c87f76275d40a22c3ebd31
    }

}
