package co.grandcircus.lab24;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partyoption")
public class PartyOption {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id=0;
	private String name;
	private String description;
	private int votes;
	
	public PartyOption() {
		
	}

	public PartyOption(long id, String name, String description, int votes) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.votes = votes;
	}
	public long getId() {
		System.out.println("THIS");
		System.out.println(this.id);
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
}
