public enum RankType {
    Captain(1),
    LeadFlightAttendant(2),
    FligthAttendant(3);

    private final int rank;
    RankType(int rank){
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
