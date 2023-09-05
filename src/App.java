public class App {
    public static void main(String[] args) throws Exception {
        Maci maci = new Maci();
        Macska mici = new Macska();
        maci.hangotad("Brumm...");
        maci.mezgyujtes();
        //maci.nev = "Brumi";

        mici.hangotad("miauuu...");
        mici.dorombol();
        //mici.nev = "";
        mici.beallitNev("");
        //System.out.println(mici.nev);

    }
}
