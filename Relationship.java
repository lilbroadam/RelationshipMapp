
public class Relationship {
	private Person person1;
	private Person person2;
	
	private Person otherPerson;
	private String relationshipType;
	
	Relationship(Person otherPerson, String relationshipType){
		this.otherPerson = otherPerson;
		this.relationshipType = relationshipType;
	}
	// maybe should delete this constructor
	Relationship(Person person1, Person person2, String relationshipType){
		this.person1 = person1;
		this.person2 = person2;
		this.relationshipType = relationshipType;
	}
	
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	
	public String getRelationshipType() { return relationshipType;}
	
	public String getPersonName() { return otherPerson.getName();}
	
	public void printRelationship() {
		//.out.println(person1.getName() + ", " + person2.getName() + ", " + relationshipType);
		
	}
}
