
import java.util.Date;

public class Hint {
    //Atributos del Dato curioso
    int id = 1;
    int enclosure = 0;
    String description = "";
    Date actualizationDate = new Date();

    // Getter y setter de los atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(int enclosure) {
        this.enclosure = enclosure;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getActualizationDate() {
        return actualizationDate;
    }

    public void setActualizationDate(Date actualizationDate) {
        this.actualizationDate = actualizationDate;
    }
}
