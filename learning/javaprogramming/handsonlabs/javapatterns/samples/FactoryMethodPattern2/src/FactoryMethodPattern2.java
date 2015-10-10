
public class FactoryMethodPattern2 {
    
    public static void main(String [] arguments){
        
        System.out.println("Example for the FactoryMethod pattern - Creating a GUI editor for the Friend\n");
        
        System.out.println("Creating a FriendsEditableImpl object.\n");
        FriendsEditableImpl someone = new FriendsEditableImpl();
        
        EditorGui editorGui = new EditorGui(someone.getEditor());
        editorGui.createGui();
        
    }
}








