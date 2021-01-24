package esercizi.esercizio17;
import java.util.ArrayList;

public class Passeggero {
    
    private String nome;
    private String cognome;
    private String indirizzo;
    private String numeroTelefonico;
    
    private ArrayList<Bagaglio> elencoBagagli;

    public Passeggero(String nome, String cognome, String indirizzo, String numeroTelefonico, ArrayList<Bagaglio> elencoBagagli) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numeroTelefonico = numeroTelefonico;
        this.elencoBagagli = elencoBagagli;
    }
    
    public Passeggero() {
        this.nome = "";
        this.cognome = "";
        this.indirizzo = "";
        this.numeroTelefonico = "";
        this.elencoBagagli = new ArrayList<>();
    }
    
    public Passeggero(Passeggero p) {
        this.nome = p.getNome();
        this.cognome = p.getCognome();
        this.indirizzo = p.getIndirizzo();
        this.numeroTelefonico = p.getNumeroTelefonico();
        this.elencoBagagli = p.getElencoBagagli();
    }
    
    public boolean addBagaglio(Bagaglio b){
        return elencoBagagli.add(b);
    }
    
    public boolean removeBagaglio(String codice){
        for(int i = 0; i < elencoBagagli.size(); i++){
            if(elencoBagagli.equals(codice)){
                elencoBagagli.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public ArrayList<Bagaglio> getElencoBagagli() {
        return elencoBagagli;
    }

    public void setElencoBagagli(ArrayList<Bagaglio> elencoBagagli) {
        this.elencoBagagli = elencoBagagli;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Passeggero){
            if(((Passeggero)o).getNome().equals(this.nome) 
            && ((Passeggero)o).getCognome().equals(this.cognome) 
            && ((Passeggero)o).getNumeroTelefonico().equals(this.numeroTelefonico)){
                
                return true;
            }
        }
        return false;
    }
    
    public double getSupplementiTot(){
        double tot = 0;
        
        for(Bagaglio b: elencoBagagli){
            tot += b.getTariffaExtra();
        }
        
        return tot;
    }
    
}
