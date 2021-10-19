package sectionpark.model;

import java.util.List;

/**
 * Text Here
 *
 * @author Patrick Elias
 * @version 2021-10-19
 */
public class CompetitionData {
    private String unitTiming;
    private List<Party> party;

    public CompetitionData() {
        this.unitTiming = "hh:mm:ss";
    }

    public String getUnitTiming() {
        return unitTiming;
    }

    public void setUnitTiming(String unitTiming) {
        this.unitTiming = unitTiming;
    }

    public List<Party> getParty() {
        return party;
    }

    public void setParty(List<Party> party) {
        this.party = party;
    }
}
