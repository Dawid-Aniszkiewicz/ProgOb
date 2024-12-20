import java.util.Objects;

import static java.sql.Types.NULL;

public class Elf {
    public String imie;
    public int wiek;
    public String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        if(imie == null || imie.isEmpty()){
            throw new IllegalArgumentException("imie cannot be null or empty");
        }
        else this.imie = imie;
        if((wiek == NULL) || (wiek < 0)){
            throw new IllegalArgumentException("wiek cannot be null or empty");
        }
        else this.wiek = wiek;
        if(stanowisko == null || stanowisko.isEmpty()){
            throw new IllegalArgumentException("stanowisko cannot be null or empty");
        }
        else this.stanowisko = stanowisko;

    }
    public void przedstawSie() {
        System.out.println("Cześć nazywam się " +
                 imie +
                ", mam " + wiek +" lat"+
                ",a moje stanowisko pracy to " + stanowisko );
    }

    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return wiek == elf.wiek && Objects.equals(imie, elf.imie) && Objects.equals(stanowisko, elf.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if((wiek == NULL) || (wiek < 0)){
            throw new IllegalArgumentException("wiek cannot be null or empty");
        }
        else this.wiek = wiek;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if(stanowisko == null || stanowisko.isEmpty()){
            throw new IllegalArgumentException("stanowisko cannot be null or empty");
        }
        else this.stanowisko = stanowisko;
    }
}
