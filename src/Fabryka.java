import java.util.ArrayList;
import java.util.Objects;

import static java.sql.Types.NULL;

public class Fabryka {
    public ArrayList<Elf> elfy;
    public double dlGeo;
    public double szGeo;

    public Fabryka(int dlGeo, ArrayList<Elf> elfy, int szGeo) {
        if ((dlGeo > -180 || dlGeo < 180) && dlGeo != NULL) {
            this.dlGeo = dlGeo;
        } else throw new IllegalArgumentException("dlgeo nie moze przyjac takiej wartosci");
        this.elfy = elfy;
        if ((szGeo > -90 || szGeo < 90) && szGeo != NULL) {
            this.szGeo = szGeo;
        } else throw new IllegalArgumentException("szgeo nie moze przyjac takiej wartosci");
    }

    public void dodajPracownika(Elf e) {
        elfy.add(e);
    }

    public void usunPracownika(Elf e) {
        elfy.remove(e);
    }

    public String najstarszyPracownik() {
        int i = 0;
        String imiep = " ";
        for (Elf e : elfy) {
            if (e.wiek > i) {
                i = e.wiek;
            }
        }
        for (Elf e : elfy) {
            if (e.wiek == i) {
                imiep = e.imie;
            }
        }
        return imiep;
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "elfy=" + elfy +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabryka fabryka = (Fabryka) o;
        return dlGeo == fabryka.dlGeo && szGeo == fabryka.szGeo && Objects.equals(elfy, fabryka.elfy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elfy, dlGeo, szGeo);
    }

    public ArrayList<Elf> getElfy() {
        return elfy;
    }

    public void setElfy(ArrayList<Elf> elfy) {
        this.elfy = elfy;
    }

    public double getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(int dlGeo) {
        if ((dlGeo > -180 || dlGeo < 180) && dlGeo != NULL) {
            this.dlGeo = dlGeo;
        } else throw new IllegalArgumentException("dlgeo nie moze przyjac takiej wartosci");
    }

    public double getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(int szGeo) {
        if ((szGeo > -90 || szGeo < 90) && szGeo != NULL) {
            this.szGeo = szGeo;
        } else throw new IllegalArgumentException("szgeo nie moze przyjac takiej wartosci");
    }
}
