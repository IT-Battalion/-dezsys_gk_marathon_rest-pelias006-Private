package sectionpark.timingstation;

import org.springframework.stereotype.Service;
import sectionpark.model.TimingstationData;

@Service
public class TimingstationService {
    private static TimingstationSimulation simulation = new TimingstationSimulation();


    public String getGreetings(String inModule) {
        return "Greetings from " + inModule;
    }

    public TimingstationData getTimingstationData(String inTimingstationID) {
        return simulation.getData(inTimingstationID);

    }

    public TimingstationData getTimingstationXML(String inTimingstationID) {
        return simulation.getData(inTimingstationID);
    }
}