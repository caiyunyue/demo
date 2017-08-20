package PaySystem;

public class Mydate {
	private String month;
	private String date;
	private String year;
	
	
	
	public String getMonth() {
		return month;
	}



	public void setMonth(String month) {
		this.month = month;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public Mydate(String month, String date, String year) {
		
		this.month = month;
		this.date = date;
		this.year = year;
	}



	public  String toDateString(){
		return year+"Äê"+month+"ÔÂ"+date+"ÈÕ";
				
	}

}
