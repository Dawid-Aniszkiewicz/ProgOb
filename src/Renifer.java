import java.util.Objects;

public class Renifer {
    public String imie;
    public int predkosc;



    public Renifer(String imie, int predkosc) {
        if(imie == null || imie.isEmpty()){
            throw new IllegalArgumentException("imie cannot be null or empty");
        }
        else this.imie = imie;
        if(predkosc < 0){
            throw new IllegalArgumentException("predkosc cannot be negative");
        }
        else this.predkosc = predkosc;

    }
    public void nakarmRenifera() {
        this.predkosc = this.predkosc+5;
    }

    @Override
    public String toString() {
        return "Renifer{" +
                "imie='" + imie + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Renifer renifer = (Renifer) o;
        return predkosc == renifer.predkosc && Objects.equals(imie, renifer.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, predkosc);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isEmpty()){
            throw new IllegalArgumentException("imie cannot be null or empty");
        }
        else this.imie = imie;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        if(predkosc < 0){
            throw new IllegalArgumentException("predkosc cannot be negative");
        }
        else this.predkosc = predkosc;
    }
}
