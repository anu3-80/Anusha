package Spring_test;

public class Game 
{
	String name;
	String player;
	int stadium_name;
	String stadium_strength;
	public Game(String name, String player, int stadium_name, String stadium_strength) {
		super();
		this.name = name;
		this.player = player;
		this.stadium_name = stadium_name;
		this.stadium_strength = stadium_strength;
	}
	@Override
	public String toString() {
		return "Game [name=" + name + ", player=" + player + ", stadium_name=" + stadium_name + ", stadium_strength="
				+ stadium_strength + "]";
	}
	
}
