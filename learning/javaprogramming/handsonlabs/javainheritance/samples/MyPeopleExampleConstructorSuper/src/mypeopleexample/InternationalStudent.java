
package mypeopleexample;

public class InternationalStudent extends Student {
    
    public InternationalStudent() {
        System.out.println("InternationalStudent: contructor is called");
    }
    
    public InternationalStudent(String name, String school, double grade, String country) {
        super(name, school, grade);
        this.country = country;
        System.out.println("InternationalStudent: contructor 2 is called");
    }
    
    private String country;
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
}
