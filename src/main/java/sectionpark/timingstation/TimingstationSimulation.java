package sectionpark.timingstation;

import sectionpark.model.CompetitionData;
import sectionpark.model.Party;
import sectionpark.model.TimingstationData;
import sectionpark.model.WeatherData;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TimingstationSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}

	private long getRandomLong(long inMinimum, long inMaximum) {
		double number = (Math.random() * ((inMaximum-inMinimum) + 1)) + inMinimum;
		return Math.round(number);
	}

	public TimingstationData getData( String inTimingstationID ) {
		
		TimingstationData data = new TimingstationData();
		data.setTimingstationID( inTimingstationID );
		data.setDistance( 1 );
		data.setAltitude( 200 );
		WeatherData wData = new WeatherData();
		wData.setPrecipitation(this.getRandomInt(0, 10));
		wData.setAtmosphericPressure(this.getRandomDouble(750, 1250));
		wData.setTemperature(this.getRandomInt(-30, 45));
		wData.setWindspeed(this.getRandomDouble(5, 1000));
		data.setWeatherData(wData);
		CompetitionData cData = new CompetitionData();
		Party[] party = new Party[this.getRandomInt(1, 10)];
		for (int i = 0; i < party.length; i++) {
			int partyID = this.getRandomInt(1, 10000);
			long millis = this.getRandomLong(1634645697165L, new Date().getTime());
			String partyTiming = new SimpleDateFormat(cData.getUnitTiming()).format(new Date(millis));
			party[i] = new Party(partyID, partyTiming);
		}
		cData.setParty(party);
		data.setCompetitionData(cData);

		return data;
	}
}
