import java.awt.GridLayout;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FriendsEditableImpl implements EditableInterface, Serializable {
    
    private String name;
    private String years;
    private String addr;
    
    // Factory method
    public ItemEditorInterface getEditor() {
        return new FriendsEditorItemEditorImpl();
    }
    
    // Inner class implementation of ItemEditorInterface - it provides
    // different GUI behavior
    private class FriendsEditorItemEditorImpl implements ItemEditorInterface, Serializable {
        private transient JPanel panel;
        private transient JTextField friendNameField;
        private transient JTextField yearsKnownEachOther;
        private transient JTextField address;
        
        public JComponent getGUI() {
            if (panel == null) {
                panel = new JPanel();
                friendNameField = new JTextField(name);
                yearsKnownEachOther = new JTextField(years);
                address = new JTextField(addr);
                panel.setLayout(new GridLayout(3,2));
                panel.add(new JLabel("Name of a friend: "));
                panel.add(friendNameField);
                panel.add(new JLabel("Years known each other: "));
                panel.add(yearsKnownEachOther);
                panel.add(new JLabel("Address: "));
                panel.add(address);
            } else {
                friendNameField.setText(name);
                yearsKnownEachOther.setText(years);
                address.setText(addr);
            }
            return panel;
        }
        
        public void commitChanges() {
            if (panel != null) {
                name = friendNameField.getText();
                years = yearsKnownEachOther.getText();
                addr = address.getText();
            }
        }
        
        public String toString(){
            return "\nFriend:\n" +
                    "    Name of a friend: " + name + "\n" +
                    "    Years known each other: " + years + "\n" +
                    "    Address: " + addr;
        }
    }
}