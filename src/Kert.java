public class Kert {
    public void inditElet() {
        Maci maci = new Maci();
        Macska mici = new Macska();
        maci.hangotad("Brumm...");
        maci.mezgyujtes();
        //maci.nev = "Brumi";

        mici.hangotad("miauuu...");
        mici.dorombol();
        //mici.nev = "";
        mici.beallitNev("aaa");
        System.out.println(mici.lekerNev());
    }
}
