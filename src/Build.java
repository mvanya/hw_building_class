public abstract class Build {

    public int floor;
    private int entries;
    protected boolean basement;
    public String name;

    public Build(int floor, int entries, boolean basement, String name) {
        this.floor = floor;
        this.entries = entries;
        this.basement = basement;
        this.name = name;
    }


    public void end() {
        System.out.println("BUILD INFO");
        System.out.println("Floors: " + floor + "\nEntries: " + entries + "\nBasements: " + basement());
    }

    public String basement() {
        return basement ? "Build has basement" : "Build hasn't basement";

    }
}
