import java.util.ArrayList;

public class Enclosure {
    //Atributos de Recinto
    int idEnclosure = 0;
    String animal = "";
    ArrayList hint = new ArrayList();
    boolean state = true;

    // Getter y setter de los atributos
    public int getIdEnclosure() {
        return idEnclosure;
    }

    public void setIdEnclosure(int idEnclosure) {
        this.idEnclosure = idEnclosure;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public ArrayList getHint() {
        return hint;
    }

    public void setHint(ArrayList hint) {
        this.hint = hint;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
