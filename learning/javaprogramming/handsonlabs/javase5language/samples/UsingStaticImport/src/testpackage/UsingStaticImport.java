package testpackage;

import static testpackage.EmpAttributes.*;

public class UsingStaticImport {
    
    public static void main( String[] args ) {
        
        System.out.println( "Here are the attributes of a employee who will be hired: " );
        System.out.println( "Minimum Salary is: " + MINSALARY );
        System.out.println( "Maximum Salary is: " + MAXSALARY );
        System.out.println( "Max Vacation Days: " + MAXVACATION );
        System.out.println( "Max Raise Percentage: " + MAXANNUALRAISEPERCENTAGE );
        
    }
    
}