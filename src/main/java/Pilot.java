public class Pilot extends CabinCrewMember {

    private String licenseNumber;
    public Pilot(String name, RankType rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
