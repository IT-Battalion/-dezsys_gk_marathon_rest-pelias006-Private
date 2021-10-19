package sectionpark.timingstation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;
import sectionpark.model.TimingstationData;

@Service
public class TimingstationService {
	
	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }

    public TimingstationData getTimingstationData( String inTimingstationID ) {
    	
    	TimingstationSimulation simulation = new TimingstationSimulation();
        return simulation.getData( inTimingstationID );
        
    }

    public TimingstationData getTimingstationXML(String inTimingstationID) {
        TimingstationSimulation simulation = new TimingstationSimulation();
        return simulation.getData(inTimingstationID);
    }
}