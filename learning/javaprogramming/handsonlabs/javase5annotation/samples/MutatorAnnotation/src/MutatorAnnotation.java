
public class MutatorAnnotation {
    
    private String name;
    private int id;
    
    /**
     *  Constructor
     **/
    public MutatorAnnotation() {
        name = "Java Passion!";
    }
    
    public String getName() {
        return name;
    }
    
    @Mutator("name")
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     *  Test of equals method overriding vs. overloading
     *  For exercise 1 change this method
     **/
    @Override
    public boolean equals(Object otherName) {
        String newName = (String) otherName;
        int comparison = name.compareTo(newName);
        
        return (comparison == 0);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
