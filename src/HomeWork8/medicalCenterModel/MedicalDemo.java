package HomeWork8.medicalCenterModel;



import java.time.LocalDateTime;
import java.util.Scanner;




public class MedicalDemo {
    static DoctorStorage doctorStorage = new DoctorStorage();
    static PatientStorage patientStorage = new PatientStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    run = false;
                    break;
                case "1":
                    addDoctor();
                    break;
                case "2":
                    searchDoctorByProfession();
                    break;
                case "3":
                    deleteDoctor();
                    break;
                case "4":
                    changeDoctor();
                    break;
                case "5":
                    addPatient();
                    break;
                case "6":
                    printPatientsByDoctor();
                    break;
                case "7":
                    patientStorage.printAll();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
}
    private static void printCommands() {
        System.out.println("0 - exit");
        System.out.println("1 - add doctor");
        System.out.println("2 - search doctor by profession");
        System.out.println("3 - delete doctor by id");
        System.out.println("4 - change doctor by id");
        System.out.println("5 - add patient");
        System.out.println("6 - print all patients by doctor");
        System.out.println("7 - print all patients");
    }

    private static void addDoctor() {
        System.out.print("Enter doctor id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter profession: ");
        String profession = scanner.nextLine();

        Doctor doctor = new Doctor(id, name, surname, phone, email, profession);
        doctorStorage.add(doctor);
        System.out.println("Doctor added!");
    }

    private static void searchDoctorByProfession() {
        System.out.print("Enter profession: ");
        String profession = scanner.nextLine();
        doctorStorage.printByProfession(profession);
    }

    private static void deleteDoctor() {
        System.out.print("Enter doctor id to delete: ");
        String id = scanner.nextLine();
        doctorStorage.deleteById(id);
        System.out.println("Deleted!");
    }

    private static void changeDoctor() {
        System.out.print("Enter doctor id to change: ");
        String id = scanner.nextLine();

        Doctor doctor = doctorStorage.getById(id);
        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        System.out.print("Enter new name: ");
        doctor.setName(scanner.nextLine());

        System.out.print("Enter new surname: ");
        doctor.setSurname(scanner.nextLine());

        System.out.print("Enter new phone: ");
        doctor.setPhone(scanner.nextLine());

        System.out.print("Enter new email: ");
        doctor.setEmail(scanner.nextLine());

        System.out.print("Enter new profession: ");
        doctor.setProfession(scanner.nextLine());

        System.out.println("Doctor updated!");
    }

    private static void addPatient() {
        System.out.print("Enter doctor id: ");
        String doctorId = scanner.nextLine();

        Doctor doctor = doctorStorage.getById(doctorId);
        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        System.out.print("Enter patient id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter register date (yyyy-MM-dd HH:mm): ");
        String dateStr = scanner.nextLine();

        LocalDateTime date = DateUtil.parse(dateStr);

        Patient patient = new Patient(id, name, surname, phone, doctor, date);
        patientStorage.add(patient);
        System.out.println("Patient added!");
    }

    private static void printPatientsByDoctor() {
        System.out.print("Enter doctor id: ");
        String doctorId = scanner.nextLine();

        Doctor doctor = doctorStorage.getById(doctorId);
        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        patientStorage.printByDoctor(doctor);
    }
}
