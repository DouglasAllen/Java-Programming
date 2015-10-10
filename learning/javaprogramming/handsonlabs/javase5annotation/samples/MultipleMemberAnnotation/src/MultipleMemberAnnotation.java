public class MultipleMemberAnnotation {
    private String name;
    private int id;
    
    public MultipleMemberAnnotation() {
        name = "Java Passion!";
    }
    
    @Accessor(variableName = "name")
    public String getName() {
        return name;
    }
    
    @Accessor(variableName = "name", variableType = "int")
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     *  Test of equals method overriding v. overloading
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