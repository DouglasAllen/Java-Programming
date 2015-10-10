package testpackage;

public class NotUsingStaticImport{

    public static void main( String[] args ) {

        System.out.println( "Here are the attributes of a employee who will be hired: " );
        System.out.println( "Minimum Salary is: " + EmpAttributes.MINSALARY );
        System.out.println( "Maximum Salary is: " + EmpAttributes.MAXSALARY );
        System.out.println( "Max Vacation Days: " + EmpAttributes.MAXVACATION );
        System.out.println( "Max Raise Percentage: " + EmpAttributes.MAXANNUALRAISEPERCENTAGE );

    }

}