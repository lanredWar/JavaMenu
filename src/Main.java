import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myNewDoctor = new Doctor("Jonathan", "Desarrollador");
        System.out.println(myNewDoctor.name);
        System.out.println(myNewDoctor.speciality);

        Patient patient = new Patient("Aleajandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
    }
}