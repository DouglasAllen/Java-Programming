
package mypeopleexample;

public class InternationalStudent extends Student {
    
    public InternationalStudent() {
        System.out.println("InternationalStudent: contructor is called");
    }    
    
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
