public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Constructor sin sobrecarga");
        id++;
    }
    Doctor(String name){
        System.out.println("Constructor con sobrecarga de nombre " + name);
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id Doctor: " + id);
    }
}
