package HomeWork8.medicalCenterModel;


public class DoctorStorage {
    private Doctor[] doctors = new Doctor[1000];
    private int size = 0;

    public void add(Doctor doctor) {
        doctors[size++] = doctor;
    }

    public Doctor getById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                return doctors[i];
            }
        }
        return null;
    }

    public void deleteById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                doctors[i] = doctors[size - 1];
                size--;
                return;
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    public void printByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equalsIgnoreCase(profession)) {
                System.out.println(doctors[i]);
            }
        }
    }
}
