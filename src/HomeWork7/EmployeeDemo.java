package HomeWork7;

import java.util.Scanner;

    public class EmployeeDemo {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            EmployeeStorage storage = new EmployeeStorage();

            boolean run = true;

            while (run) {
                System.out.println("Please input:");
                System.out.println("0 - for exit");
                System.out.println("1 - add employee");
                System.out.println("2 - print all employees");
                System.out.println("3 - search employee by ID");
                System.out.println("4 - search employee by company name");

                int command = scanner.nextInt();
                scanner.nextLine(); // consume enter

                switch (command) {
                    case 0:
                        run = false;
                        break;

                    case 1:
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();

                        System.out.println("Enter surname:");
                        String surname = scanner.nextLine();

                        System.out.println("Enter employeeID (example A0001):");
                        String id = scanner.nextLine();

                        System.out.println("Enter salary:");
                        double salary = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("Enter company:");
                        String company = scanner.nextLine();

                        System.out.println("Enter position:");
                        String position = scanner.nextLine();

                        Employee employee = new Employee(name, surname, id, salary, company, position);
                        storage.add(employee);
                        System.out.println("Employee added!");
                        break;

                    case 2:
                        storage.print();
                        break;

                    case 3:
                        System.out.println("Enter employee ID:");
                        String idSearch = scanner.nextLine();
                        Employee found = storage.searchByID(idSearch);
                        if (found == null) {
                            System.out.println("Employee not found!");
                        } else {
                            System.out.println(found);
                        }
                        break;

                    case 4:
                        System.out.println("Enter company name:");
                        String compSearch = scanner.nextLine();
                        storage.searchByCompany(compSearch);
                        break;

                    default:
                        System.out.println("Invalid command!");
                }
            }
        }
    }

