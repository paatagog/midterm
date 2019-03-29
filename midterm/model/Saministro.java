package midterm.model;

import java.util.ArrayList;
import java.util.List;

public class Saministro {
    private String name;
    private Person ministri;
    private List<Person> employs= new ArrayList<>();

    public Saministro() {

    }

    public Saministro(String name, Person ministri) {
        this.name = name;
        this.ministri = ministri;
    }

    public void addEmploy(Person p) {
        employs.add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("namae=").append(this.name).append(";");
        sb.append("minister=(").append(this.ministri).append(");");
        for (Person p: employs) {
            sb.append("employ=(").append(p).append(");");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMinistri() {
        return ministri;
    }

    public void setMinistri(Person ministri) {
        this.ministri = ministri;
    }

    public List<Person> getEmploys() {
        return employs;
    }

    public void setEmploys(List<Person> employs) {
        this.employs = employs;
    }
}
