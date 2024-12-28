import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Jonathan", "jonathan@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(myDoctor.getAvailableAppointments());

        System.out.println(myDoctor);

        /*
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
        */

        Patient patient = new Patient("Aleajandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        patient.setPhoneNumber("12345678");
        System.out.println(patient);
        System.out.println(patient.getWeight());

        /*
        int i = 0;
        String name = "Anne";
        System.out.println(patient.getWeight());
        System.out.println(patient.getPhoneNumber());*/
    }
}