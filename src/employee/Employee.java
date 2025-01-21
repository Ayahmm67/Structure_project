/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       linkedlist list = new linkedlist();
      
       System.out.println("**************************************************");
       System.out.println("* wellcome to Employee record management system  *");
       System.out.println("**************************************************");

        char choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert new employee");
            System.out.println("2. Delete employee");
            System.out.println("3. Update employee record");
            System.out.println("4. Show employee details");
            System.out.println("5. search employee ");
            System.out.println("6. Update salary");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("Enter employee details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("First Day of Work: ");
                    String firstDayOfWork = scanner.next();
                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Address: ");
                    String address = scanner.next();
                    System.out.print("Work Hours: ");
                    int workHours = scanner.nextInt();
                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();

                    list.Insert(new EmployeeInfo(name,id, firstDayOfWork, phoneNumber, address, workHours, salary));
                    break;
                case '2':
                    System.out.print("Enter employee ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    list.Delete(idToDelete);
                    break;
                case '3':
                    System.out.print("Enter employee ID to update: ");
                    int idToUpdate = scanner.nextInt();
                    System.out.print("Enter new name: ");
                    String newName = scanner.next();
                    System.out.print("Enter new first day of work: ");
                    String newFirstDayOfWork = scanner.next();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.next();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.next();
                    System.out.print("Enter new work hours: ");
                    int newWorkHours = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
    
                    list.UpdateEmployeeRecord(idToUpdate, newName, newFirstDayOfWork, newPhoneNumber, newAddress, newWorkHours, newSalary);
                    break;
                case '4':
                    System.out.print("Enter employee ID to show details: ");
                    int idToShow = scanner.nextInt();
                    list.showEmployeeDetails(idToShow);
                    break;
                case '5':
                    System.out.print("Enter employee ID to search : ");
                    int idTosearch = scanner.nextInt();
                    list.searchEmployee(idTosearch);
                    break;
                case '6':
                    System.out.print("Enter employee ID to update salary: ");
                    int idToUpdateSalary = scanner.nextInt();
                    list.updateSalary(idToUpdateSalary);
                    break;
                case '7':
                    System.out.println("Exiting... Thank you for using our employee management system!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        } while (choice != '7');

        scanner.close();
    }

       
        
    
}
