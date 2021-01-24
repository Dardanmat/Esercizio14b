package esercizi.esercizio17;

import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        
//        Volo v = new Volo("Alitalia");
//        v.add(new Bagaglio("Rossi Luca", (float) 22.4));
//        v.add(new Bagaglio("Rossi Mario",(float) 28.4));
//        v.add(new Bagaglio("Rossi Mario",(float) 20.4));
//        v.add(new Bagaglio("Blu Mario",20));
//       
//        Volo v2 = new Volo("RyanAir");
//        v2.add(new Bagaglio("Rossi Pippo", (float) 22.4));
//        v2.add(new Bagaglio("Carli Mario",(float) 20.4));
//        v2.add(new Bagaglio("Batistuta Mario",27));

        ArrayList<Bagaglio> lista = new ArrayList<>();
        
        Bagaglio b1 = new Bagaglio(20, "Dardan Berisha");
        Bagaglio b2 = new Bagaglio(27, "Roheljo Cobo");
        Bagaglio b3 = new Bagaglio(16, "Sasha Cerbai");
        Bagaglio b4 = new Bagaglio(5, "Nirushan Gopalakrishnan");
        Bagaglio b5 = new Bagaglio(9, "Nirushan Gopalakrishnan");
        Bagaglio b6 = new Bagaglio(30, "Dardan Berisha");
        Bagaglio b7 = new Bagaglio(25, "Nirushan Gopalakrishnan");
        Bagaglio b8 = new Bagaglio(2, "Dardan Berisha");
        Bagaglio b9 = new Bagaglio(26, "Daniele Belfante");
        
        lista.add(b1);
        lista.add(b2);
        lista.add(b3);
        lista.add(b4);
        lista.add(b5);
        lista.add(b6);
        lista.add(b7);
        lista.add(b8);
        lista.add(b9);

        Volo volo = new Volo(lista, "BB01ABE123");
        
        System.out.println("Peso: " + b1.getPeso()+ " - è eccedente? " + b1.isEccedente());
        System.out.println("Peso: " + b2.getPeso()+ " - è eccedente? " + b2.isEccedente());
        System.out.println("Tariffa extra da pagare: "+b1.getTariffaExtra() + " per il peso di "+b1.getPeso());
        System.out.println("Tariffa extra da pagare: "+b2.getTariffaExtra() + " per il peso di "+b2.getPeso());
        
        System.out.print("\n");
         
        System.out.println("Importo totale dei supplementi: "+volo.importoTotaleSupplementi());
        
        ArrayList<Bagaglio> bag = volo.getListaBagagliEccedenti();
        
        System.out.print("\n");
        
        System.out.println("Bagagli col peso che eccede i " + Bagaglio.getLimitePeso() + "Kg");
        for(Bagaglio x: bag){
            System.out.println("Nome: "+x.getNomePropietario() + " - Peso: " + x.getPeso() + " - Tariffa da pagare: "+ x.getTariffaExtra() + "€");
        }
        
        System.out.print("\n");
        
        bag = volo.listaBagagliNeiLimitiPeso(1, 10);
        
        System.out.println("Bagagli col peso tra 1Kg e 10Kg:");
        for(Bagaglio x: bag){
            System.out.println("Nome: "+x.getNomePropietario() + " - Peso: " + x.getPeso() + " - Tariffa da pagare: "+ x.getTariffaExtra() + "€");
        }
        
        System.out.println("\nNumero bagagli eccedenti: "+volo.numeroBagagliEccedenti(true) + " - Numero bagagli non eccedenti: " + volo.numeroBagagliEccedenti(false) + "\n");
        
        volo.stampaBagagliPasseggero("Nirushan Gopalakrishnan");
        
    }
}
