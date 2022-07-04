import java.util.ArrayList;

public class Koszyk<E> extends ArrayList<E> {


    public void add(int ilosc, String produkt){
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    private String produkt;
    private int ilosc;
}
