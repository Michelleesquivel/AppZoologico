import java.util.ArrayList;
import java.util.Date;

public class Tour {
    //Atributos de Tour
    int idTour = 0;
    String description = "";
    ArrayList enclosure = new ArrayList();
    Date dateTour = new Date();
    Boolean completeTour = true;

    // Getter y setter de los atributos
    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(ArrayList enclosure) {
        this.enclosure = enclosure;
    }

    public Date getDateTour() {
        return dateTour;
    }

    public void setDateTour(Date dateTour) {
        this.dateTour = dateTour;
    }

    public Boolean getCompleteTour() {
        return completeTour;
    }

    public void setCompleteTour(Boolean completeTour) {
        this.completeTour = completeTour;
    }
}
