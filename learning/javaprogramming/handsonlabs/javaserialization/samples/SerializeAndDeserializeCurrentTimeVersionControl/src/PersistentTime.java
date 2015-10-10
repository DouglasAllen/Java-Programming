import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;

public class PersistentTime implements Serializable{
    
    static final long serialVersionUID = -3126998878902358585L;
    
    private Date time;
    private String aNewField;
    private String aNewNewField;
    
    public PersistentTime() {
        time = Calendar.getInstance().getTime();
    }
    
    public Date getTime() {
        return time;
    }
}