import java.io.File;
import java.util.LinkedList;

import org.jfree.data.xy.XYSeries;


public class WellData {
	
	// used to store individual survey entries
	private class Survey implements Comparable<Survey> {
		public float depth;
		public float inclination;
		public float azimuth;
		
		public Survey(float depth, float inclination, float azimuth){
			this.depth = depth;
			this.inclination = inclination;
			this.azimuth = azimuth;
		}

		public int compareTo(Survey o) {
			if (this.depth < o.depth)
				return -1;
			else if (this.depth > o.depth)
				return 1;
			else return 0;
		}
	}
	
	// well metaData
	private String wellName, wellNumber, county, country,
		contractor, operator;
	
	// a list of all survey for this WellData object
	private LinkedList<Survey> data;
	
	public String getWellName() {
		return wellName;
	}

	public void setWellName(String wellName) {
		this.wellName = wellName;
	}

	public String getWellNumber() {
		return wellNumber;
	}

	public void setWellNumber(String wellNumber) {
		this.wellNumber = wellNumber;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public LinkedList<Survey> getData() {
		return data;
	}

	public void setData(LinkedList<Survey> data) {
		this.data = data;
	}

	public void addSurvey(Survey survey) {
		data.add(survey);
		data.sort(null);
	}
	
	public void addSurvey(float depth, float inclination, float azimuth){
		Survey survey = new Survey(depth, inclination, azimuth);
		this.addSurvey(survey);
	}
	
	public XYSeries getXYSeries(){
		return null;
		
	}
}
