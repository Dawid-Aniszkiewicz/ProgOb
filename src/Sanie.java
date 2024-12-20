import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    ArrayList<Renifer>Renifery;

    public Sanie(ArrayList<Renifer> renifery) {
        Renifery = renifery;
    }

    public void dodajRenifera(Renifer renifer){
        Renifery.add(renifer);
    }
    public void usunRenifera(Renifer renifer){
        Renifery.remove(renifer);
    }
    public String najwolniejszyRenifer(){
        int i=0;
        String imiep=" ";
        for(Renifer renifer:Renifery){
            if(renifer.predkosc > i){
                i=renifer.predkosc;
            }
        }
        for(Renifer renifer:Renifery){
            if(renifer.predkosc == i){
                imiep=renifer.imie;
            }
        }
        return imiep;
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "Renifery=" + Renifery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sanie sanie = (Sanie) o;
        return Objects.equals(Renifery, sanie.Renifery);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Renifery);
    }

    public ArrayList<Renifer> getRenifery() {
        return Renifery;
    }

    public void setRenifery(ArrayList<Renifer> renifery) {
        Renifery = renifery;
    }
}
