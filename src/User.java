import java.util.ArrayList;
import java.util.Date;

public class User {
    //Atributos del usuario

    int idUser = 0;
    String nameUser = "";
    String lastNameUser = "";
    Date nacimientoUser = new Date();
    String passwordUser = "";
    ArrayList codeUser = new ArrayList();

    // Getter y setter de los atributos
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public Date getNacimientoUser() {
        return nacimientoUser;
    }

    public void setNacimientoUser(Date nacimientoUser) {
        this.nacimientoUser = nacimientoUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public ArrayList getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(ArrayList codeUser) {
        this.codeUser = codeUser;
    }
}
