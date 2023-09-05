public class Allat {
    private String nev="névtelen";
    
    public void beallitNev(String nev) {
        if(nev.isEmpty()) {
            System.out.println("Hiba! Nem adtál meg nevet!");
            System.exit(1);
        }
        this.nev = nev;
    }
    public String lekerNev() {
        return this.nev;
    }

        

    public void hangotad(String hang) {
        System.out.println(hang);
    }
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
}
