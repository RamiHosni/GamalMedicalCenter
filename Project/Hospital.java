import java.util.ArrayList;

import javax.lang.model.element.Element;

public class Hospital {

    String name;
    // public Hospital()
    // {}

    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public ArrayList getDoctors() {
        return doctors;
    }

    public ArrayList getPatients() {
        return patients;
    }

}
