public class Residential extends Build {


    private int flat;
    private int lift;
    protected boolean boiler;



    public Residential(int floor, int entries, boolean basement, String name, int flat, int lift, boolean boiler) {
        super(floor, entries, basement, name);
        this.flat = flat;
        this.lift = lift;
        this.boiler = boiler;
    }

    @Override
    public void end() {
        super.end();
        System.out.println("\nRESIDENTIAL HOUSE INFO");
        System.out.println("Name: " + name + "\nFlats: " + flat + "\nLifts: " + lift + "\nBoilers: " + boiler());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public int getLift() {
        return lift;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }

    public String boiler() {
        return boiler ? "Residential house has boiler" : "Residential house hasn't boiler";
    }
}
