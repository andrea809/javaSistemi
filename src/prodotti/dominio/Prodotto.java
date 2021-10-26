package prodotti.dominio;

import java.io.Serializable;

public class Prodotto implements Serializable {
    private long id;
    private String descrizione;
    private String unitaMisura;
    private int quantita;
    private int prezzo;
    public Prodotto() {

    }
    public Prodotto(String descrizione, String unitaMisura, int quantita, int prezzo) {

    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String getUnitaMisura() {
        return unitaMisura;
    }

    public void setUnitaMisura(String unitaMisura) {
        this.unitaMisura = unitaMisura;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Prodotto: "+getId();
    }
}
