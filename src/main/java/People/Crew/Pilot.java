package People.Crew;

public class Pilot extends CabinCrewMember{

    private String pilotLicenceNumber;

    public Pilot(String name, RankType rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }


    public String getLicenceNumber() {
        return this.pilotLicenceNumber;
    }

    public String flyPlane(String string) {
        return string;
    }
}
