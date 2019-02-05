import java.util.Date;

public class Event {
    private int id;
    private String msg;
    private Date data;

    public Event(Date _data){
        this.data = _data;
    }

    public String toString() {
        return  new String(id + " " + msg + " " +data.toString());
    }
}
