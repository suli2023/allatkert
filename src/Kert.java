public class Kert {
    Maci maci;
    Macska mici;
    public void inditElet() {
        initObject();
        startMaci();
        startMici();
    }
    public void initObject() {
        this.maci = new Maci();
        this.mici = new Macska();
    }
    public void startMaci() {
        maci.hangotad("Brumm...");
        maci.mezgyujtes();
    }
    public void startMici() {
        mici.hangotad("miauuu...");
        mici.dorombol();
        
        mici.beallitNev("aaa");
        System.out.println(mici.lekerNev());
    }
}
