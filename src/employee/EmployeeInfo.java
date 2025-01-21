/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author user
 */

public class EmployeeInfo {
    
    String Name ;
    int ID ;
    String FirstDayOfWork;
    String phoneNumber;
    String Address ;
    int WorkHours;
    Double Salary ;
    
    /**
     *
     * @param name
     * @param ID
     * @param FirstDayOfWork
     * @param phoneNumber
     * @param Address
     * @param WorkHours
     * @param Salary
     */
    public EmployeeInfo(String name,int ID ,String FirstDayOfWork ,String phoneNumber,String Address,int WorkHours , Double Salary ){
       
       this.Name=name;
       this.ID=ID;
       this.FirstDayOfWork =FirstDayOfWork;
       this.phoneNumber= phoneNumber;
       this.Address =Address;
       this.WorkHours = WorkHours;
       this.Salary =Salary;
       
} 
           
    
}
