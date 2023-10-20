package at.swp.phone.parts;

public class Sim {
    private int id;
    private String number;
    public int getId() {
        return id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String ShowSim(){
        return "Phone with the id of: " + id + "\n and the Phone-Number: " + number;
    }
    public String doCall() {
        return "Auf Antwort warten...";
    }
}
