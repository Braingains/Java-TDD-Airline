package People.Crew;

import People.Person;

public class CabinCrewMember extends Person {


    private RankType rank;

    public CabinCrewMember(String name, RankType rankType) {
        super (name);
        this.rank = rankType;

    }

    public RankType getRank() {
        return this.rank;
    }

    public String announce(String announcement) {
        return announcement;
    }
}
