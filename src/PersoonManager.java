//import java.io.*;
//import java.util.List;
//
//class Personen {
//    private List<Persoon> personen;
//    public void add(Persoon p) {
//        personen.add(p);
//    }
//    public List<Persoon> getPersonen() {
//        return personen;
//    }
//}
//
//class Persoon implements Serializable {
//    @Serial private static final long serialVersionUID = 1L;
//    private final String voornaam, familienaam;
//    public Persoon(String voornaam, String familienaam) {
//        this.voornaam = voornaam;
//        this.familienaam = familienaam;
//    }
//}
//
//public class PersoonManager {
//    private final Personen personenDB;
//
//    public PersoonManager(Personen personenDB) {
//        this.personenDB = personenDB;
//    }
//
//    public void save(Personen personen) {
//        for (Persoon p : personen.getPersonen()) {
//            personenDB.add(p);
//            OutputStream outputStream = new OutputStream() {
//                @Override
//                public void write(int b) throws IOException {
//
//                }
//            }
//        }
//    }
//
//        public Personen load() {
//
//        }
//}
//
//    public static void main(String[] args) {
//        var personen = new Personen();
//        personen.add(new Persoon("Joe", "Dalton"));
//        personen.add(new Persoon("Sarah", "Bernhardt"));
//        var manager = new PersoonManager(personenDB);
//        manager.save(personen); // slaat op in een bestand op de harde schijf
//        Personen personen2 = manager.load(); // leest de data van het bestand terug
//        System.out.println(personen2);
//
//    }
//
//}
//
//
///*
//Je maakt de nodige classes zodat volgende code
//var personen = new Personen();
//personen.add(new Persoon("Joe", "Dalton"));
//personen.add(new Persoon("Sarah", "Bernhardt"));
//var manager = new PersoonManager();
//manager.save(personen); // slaat op in een bestand op de harde schijf
//Personen personen2 = manager.load(); // leest de data van het bestand terug
//System.out.println(personen2);
//volgende output geeft:
//Joe Dalton
//Sarah Bernhardt
// */