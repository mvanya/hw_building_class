public class Business extends Build {


    private int office;
    protected boolean cafe;
    private int parking;

    public Business(int floor, int entries, boolean basement, String name, boolean cafe, int office, int parking) {
        super(floor, entries, basement, name);

        this.office = office;
        this.cafe = cafe;
        this.parking = parking;
    }

    @Override
    public void end() {
        super.end();
        System.out.println("\nBUSINESS CENTRE INFO");
        System.out.println("Name: " + name + "\nOffice: " + office + "\nCafe: " + cafe() + "\nParking: " + parking);
    }

    public String cafe() {
        return cafe ? "Business centre has cafe" : "Business centre hasn't cafe";
    }
}
