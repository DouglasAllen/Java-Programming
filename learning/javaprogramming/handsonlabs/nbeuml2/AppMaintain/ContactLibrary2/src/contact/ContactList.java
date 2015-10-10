package contact;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public ContactList() {
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> val) {
        this.contactList = val;
    }
    
    public boolean addContact(Contact contact) {
        return this.contactList.add(contact);
    }
    
    public boolean removeContact(Contact contact) {
        return this.contactList.remove(contact);
    }
    
    public Contact removeContact(int index) {
        return this.contactList.remove(index);
    }
    
    public Contact setContact(int index, Contact contact) {
        return this.contactList.set(index, contact);
    }
}
