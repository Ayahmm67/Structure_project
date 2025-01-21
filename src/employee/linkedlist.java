/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author user
 */
public class linkedlist {
    private Node head;
 public linkedlist() {
 head = null;
 }
   
/** Inserts a new employee record into the sorted linked list.
     * @param Employee */ 
   public void Insert(EmployeeInfo Employee){
if(head == null){
        // Insert into an empty list
        head = new Node(Employee);
        System.out.println("-1-Employee record inserted successfully.");
        return;
    }
    
    // Check if the given ID already exists
    Node current = head;
    while(current != null){
        if(current.data.ID == Employee.ID){
            System.out.println("Employee record with the same ID already exists. Cannot insert.");
            return;
        }
        current = current.next;
    }
    
    // Insert before the first employee
    if(Employee.ID < head.data.ID){
        Node newNode = new Node(Employee);
        newNode.next = head;
        head = newNode;
        System.out.println("-2-Employee record inserted successfully.");
        return;
    }
    
    // Insert in between existing employees
    current = head;
    while(current.next != null && Employee.ID > current.next.data.ID){
        current = current.next;
    }
    Node newNode = new Node(Employee);
    newNode.next = current.next;
    current.next = newNode;
    System.out.println("-3-Employee record inserted successfully.");
} 
   
  public void Delete(int Key){
       
       Node temp =head,pre=null;
       //Check if the node to be deleted is the head
       if(temp!=null && temp.data.ID == Key){
       head=temp.next;
       System.out.println("Employee record deleted successfully.");
       return;
       }
       
       //Search for the node with the given key
       while(temp!=null && temp.data.ID!=Key){
       pre=temp;
       temp=temp.next;
       
       }
        //If the node with the given key is not found
       if(temp==null){
        System.out.println("Employee record not found.");
       return;
       }
       // Case 4: Remove the node from the linked list
       pre.next=temp.next;
       System.out.println("Employee record deleted successfully.");
       
   }
  
    public void UpdateEmployeeRecord(int id, String newName, String newFirstDayOfWork, String newPhoneNumber, String newAddress, int newWorkHours, double newSalary){
        Node current = head;

    // Traverse the linked list to find the node with the given ID
    while (current != null) {
        if (current.data.ID == id) {
            // Update all information of the employee
            current.data.Name = newName;
            current.data.FirstDayOfWork = newFirstDayOfWork;
            current.data.phoneNumber = newPhoneNumber;
            current.data.Address = newAddress;
            current.data.WorkHours = newWorkHours;
            current.data.Salary = newSalary;
            System.out.println("Employee record updated successfully.");
            return;
        }
        current = current.next;
    }

    // If the node with the given ID is not found
    System.out.println("Employee record not found.");
        
   }
   
    


public void showEmployeeDetails(int employeeID) {
        Node current = head;
        while (current != null && current.data.ID != employeeID) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Employee record not found.");
        } else {
            System.out.println("Employee Details:");
            System.out.println("Name: " + current.data.Name);
            System.out.println("ID: " + current.data.ID);
            System.out.println("First Day of Work: " + current.data.FirstDayOfWork);
            System.out.println("Phone Number: " + current.data.phoneNumber);
            System.out.println("Address: " + current.data.Address);
            System.out.println("Work Hours: " + current.data.WorkHours);
            System.out.println("Salary: " + current.data.Salary);
        }
    }
 public void searchEmployee(int employeeID) {
    Node current = head;
    
    while (current != null && current.data.ID != employeeID) {
        current = current.next;
    }
    
    if (current == null) {
        System.out.println("Employee record not found.");
     return;  
    } else {
       System.out.println("Employee Details:");
            System.out.println("Name: " + current.data.Name);
            System.out.println("ID: " + current.data.ID);
            System.out.println("First Day of Work: " + current.data.FirstDayOfWork);
            System.out.println("Phone Number: " + current.data.phoneNumber);
            System.out.println("Address: " + current.data.Address);
            System.out.println("Work Hours: " + current.data.WorkHours);
            System.out.println("Salary: " + current.data.Salary);    }
        return;
 }
    /**
     *
     * @param employeeID
     *
     */
   public void updateSalary(int employeeID) {
        Node current = head;
        while (current != null && current.data.ID != employeeID) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Employee record not found.");
        } else {
            current.data.Salary += (current.data.WorkHours - 32) * 0.02 * current.data.Salary ;
         
            System.out.println("Salary updated successfully.");
                System.out.println("Salary ="+current.data.Salary);
        }
    
   }
}
   

  