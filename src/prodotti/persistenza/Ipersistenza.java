package prodotti.persistenza;

import prodotti.dominio.Prodotto;

import java.util.List;

public interface Ipersistenza {
    void aggiungiProdotto(Prodotto p) throws PersistenzaException;
    Prodotto ricercaProdotto(long id) throws PersistenzaException;
    void aggiornaProdotto(long id) throws PersistenzaException;
    void cancellaProdotto(long id) throws PersistenzaException;
    List<Prodotto> elencoProdotti() throws PersistenzaException;
}
