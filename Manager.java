package TheRealHero;

public class Manager extends Employee {

    public void sendMessageToAllEmployees(String message , Employee [] employees){
        for (Employee employee : employees){
            super.sendMessageToAnEmployee(message , employee);
        }
    }
}
