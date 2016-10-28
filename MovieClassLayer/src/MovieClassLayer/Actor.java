package MovieClassLayer;

public class Actor {


	public String ActorID;
	public String ActorName;
	public Actor(String actorID, String actorName)
	{
		this.ActorID= actorID;
		this.ActorName= actorName;
	}

	public Actor(){

		this.ActorID= null;
		this.ActorName= null;
	}

	public String getActorID() {
		return ActorID;
	}

	public void setActorID(String actorID) {
		ActorID = actorID;
	}

	public String getActorName() {
		return ActorName;
	}

	public void setActorName(String actorName) {
		ActorName = actorName;
	}
	
	
}


