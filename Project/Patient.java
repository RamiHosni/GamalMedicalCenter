public class Patient extends Person implements info {

    String disease;
    static int patientCounter;

    public Patient() {
    }

    public Patient(String n, int a, String d) {

        super(n, a);
        disease = d;
    }

    public void setDisease(String d) {
        disease = d;
    }

    public String getDisease(String d) {
        return disease;
    }

    public void printinfo() {
        System.out.printf("Name" + name, "Age" + age, "disease" + disease);
    }

    public static int getDC() {
        return patientCounter++;
    }

}
