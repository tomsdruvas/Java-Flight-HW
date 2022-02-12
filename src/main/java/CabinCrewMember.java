public class CabinCrewMember {
    private String name;
    private RankType rank;
    private String licenseNumb;

    public CabinCrewMember(String name, RankType rank, String licenseNumb){
        this.name = name;
        this.rank = rank;
        this.licenseNumb = licenseNumb;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return rank;
    }

    public String getLicenseNumb() {
        return licenseNumb;
    }
}
