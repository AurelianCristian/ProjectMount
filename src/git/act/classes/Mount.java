package git.act.classes;

public class Mount {
	public String name;
	public int level;
	public int speed;

	public Mount(String name, int level, int speed) {
		super();
		this.name = name;
		this.level = level;
		this.speed = speed;
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Mount [Name: " + name + ", Level: " + level + ", Speed: " + speed + "]";
	}
}
