package design.pattern.state;

public abstract class Etat {

    public abstract void effectureAjouterProduitAuCommande();
    public abstract void effectureSupprimerProduitAuCommande();
    public abstract void effectureVerifierCommande();
    public abstract Etat passerVersEtatSuivant();
    public abstract void effectureLivrerCommande();

}
