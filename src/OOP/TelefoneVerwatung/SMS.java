package OOP.TelefoneVerwatung;

public class SMS {
    private int empfängerId;
    private String text;

    public SMS(int empfängerId, String text){
        this.empfängerId = empfängerId;
        this.text = text;
    }

    public int getEmpfängerId(){
        return empfängerId;
    }

    public String getText(){
        return text;
    }

    @Override
    public String toString(){
      return "EmpfängerId: "+ empfängerId + ", Text: " + text;
    }
}
