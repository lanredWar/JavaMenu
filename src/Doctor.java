public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Constructor sin sobrecarga");
    }
    Doctor(String name, String speciality){

        System.out.println("Constructor con sobrecarga de nombre " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id Doctor: " + id);
    }
}
