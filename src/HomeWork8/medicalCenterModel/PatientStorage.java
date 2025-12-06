package HomeWork8.medicalCenterModel;

public class PatientStorage {
    private Patient[] patients = new Patient[2000];
    private int size = 0;

    public void add(Patient patient) {
        patients[size++] = patient;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    public void printByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().getId().equals(doctor.getId())) {
                System.out.println(patients[i]);
            }
        }
    }
}
