
package mypersoninterfaceproject;

public class Student implements StudentInterface {
    
    int cashSaving;
    int retirementFund;
    String firstName;
    String lastName;
    String school;
    
    // Constructor with arguments
    Student(int cashSaving,
            int retirementFund,
            String firstName,
            String lastName,
            String school){
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
    }
    
    // Compute person's total wealth
    public int computeTotalWealth(){
        System.out.println((cashSaving + retirementFund));;
        return (cashSaving + retirementFund);
    }
    
    // Get person's name
    public String getName(){
        return firstName + " " + lastName;
    }
    
    // Find out the school the student attends
    public String findSchool(){
        return school;
    }
}
