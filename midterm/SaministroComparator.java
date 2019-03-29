package midterm;

import midterm.model.Saministro;

import java.util.Comparator;

public class SaministroComparator implements Comparator<Saministro> {
    @Override
    public int compare(Saministro o1, Saministro o2) {
        return o1.getEmploys().size() - o2.getEmploys().size();
    }
}
