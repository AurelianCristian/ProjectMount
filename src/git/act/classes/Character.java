package git.act.classes;

public class Character {
	public String name;
	public int level;
	
	public Character(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", level=" + level + "]";
	}
}
