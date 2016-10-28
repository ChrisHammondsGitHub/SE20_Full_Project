package MovieClassLayer;

public class Director {

	public String DirectorID;
	public String DirectorName;
	public Director(String directorID, String directorName)
	{
		this.DirectorID= directorID;
		this.DirectorName= directorName;
	}

	public Director(){

		this.DirectorID= null;
		this.DirectorName= null;
	}
	
	
	public String getDirectorID() {
		return DirectorID;
	}

	public void setDirectorID(String directorID) {
		DirectorID = directorID;
	}

	public String getDirectorName() {
		return DirectorName;
	}

	public void setDirectorName(String directorName) {
		DirectorName = directorName;
	}
}