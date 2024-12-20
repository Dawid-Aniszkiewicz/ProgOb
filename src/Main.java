import java.util.ArrayList;

import static java.sql.Types.NULL;

public class Main {
    public static void main(String[] args) {
        Elf e = new Elf("Kamil",25,"Pracownik");
        Elf f = new Elf("Rudy",15,"Pracownik");
        e.przedstawSie();
        ArrayList<Elf> elfy=new ArrayList<>();
        Fabryka fab1 = new Fabryka(12, elfy,24);
        fab1.dodajPracownika(e);
        fab1.dodajPracownika(f);
        fab1.najstarszyPracownik();
        System.out.println(fab1.toString());
        fab1.usunPracownika(e);
        Renifer r= new Renifer("kamil",12);
        System.out.println(r.toString());
        r.nakarmRenifera();
        System.out.println(r.toString());
    }
}
