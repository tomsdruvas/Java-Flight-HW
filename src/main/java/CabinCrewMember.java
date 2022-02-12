public class CabinCrewMember {
    private String name;
    private RankType rank;

    public CabinCrewMember(String name, RankType rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return rank;
    }

    public String relayMessage(){
        return "We are all good";
    }


}
