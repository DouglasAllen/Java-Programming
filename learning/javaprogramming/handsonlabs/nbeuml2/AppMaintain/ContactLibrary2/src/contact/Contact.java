package contact;

import java.util.ArrayList;

public class Contact {
    
    private boolean hasPersonalIdentity = false;

    private PersonalIdentity personalIdentity;

    private ArrayList<EMailAddress> eMailAddressList = new ArrayList<EMailAddress>();

    public Contact() {
    }

    public boolean getHasPersonalIdentity() {
        return hasPersonalIdentity;
    }

    public void setHasPersonalIdentity(boolean val) {
        this.hasPersonalIdentity = val;
    }

    public PersonalIdentity getPersonalIdentity() {
        return personalIdentity;
    }

    public void setPersonalIdentity(PersonalIdentity val) {
        this.personalIdentity = val;
        this.setHasPersonalIdentity(true);
    }


    public ArrayList<EMailAddress> getEMailAddressList()  {
        return eMailAddressList;
    }

    
    public boolean addEMailAddress(EMailAddress eMailAddress) {
        return this.eMailAddressList.add(eMailAddress);
    }
    
    public boolean removeEMailAddress(EMailAddress eMailAddress) {
        return this.eMailAddressList.remove(eMailAddress);
    }
    
    public EMailAddress removeEMailAddress(int index) {
        return this.eMailAddressList.remove(index);
    }
    
    public EMailAddress setEMailAddress(int index, EMailAddress eMailAddress) {
        return this.eMailAddressList.set(index, eMailAddress);
    }
    
    public String toString() {
        String rv = "Contact";
        if (this.hasPersonalIdentity) {
            rv = "Contact firstName \"" + this.personalIdentity.getFirstName() + "\" lastName \"" + this.personalIdentity.getLastName() + "\" eMailAddress \""+ this.eMailAddressList.get(0).getAddress() + "\"";
        }
        return rv;
    }
}
