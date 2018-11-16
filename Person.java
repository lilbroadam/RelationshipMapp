import java.util.ArrayList;

public class Person {
	private String name;
	private boolean mainPerson;
	private ArrayList<Relationship> relationships;
	public static ArrayList<Person> peopleList = new ArrayList<Person>();
	
	Person(String name, boolean mainPerson) {
		this.name = name;
		this.mainPerson = true;
		peopleList.add(this);
		relationships = new ArrayList<Relationship>();
	}
	Person(String name) {
		this(name, false);
//		this.name = name;
//		mainPerson = false;
//		peopleList.add(this);
//		relationships = new ArrayList<Relationship>();
	}
	Person(String name, Person otherPerson, String relationshipType) {
//		this.name = name;
//		this.mainPerson = false;
//		peopleList.add(this);
//		relationships = new ArrayList<Relationship>();
		this(name, false);
		addRelationship(otherPerson, relationshipType);
	}
	
	public boolean isMainPerson() { return mainPerson;}
	
	// assume relationship is mutual for now
	// need to check if relationship already exists
	public void addRelationship(Person otherPerson, String relationshipType){
		relationships.add(new Relationship(otherPerson, relationshipType));
		otherPerson.relationships.add(new Relationship(this, relationshipType));
		//otherPerson.addRelationship(this, relationshipType);
	}
	
	public void setRelationship(Person otherPerson, String relationshipType) {
		
	}
	public ArrayList<Relationship> getRelationships() { return relationships;}
	
	// find a person in the relationship array method
	
	public void printRelationships() { 
		for(Relationship relation : relationships) {
			System.out.println(name + ", " + relation.getPersonName() + ", " + relation.getRelationshipType());
		}
	}
	
	public String getName() { return name;}
}
