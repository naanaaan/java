package ch08.ex02.case05;

public class User {
	private String userName;
	private Level level;

	public User(String userName, Level level) {
		this.userName = userName;
		this.level = level;
	}

	public void upgradeLevel() { //service계층이지만 소소한거기때문에 그냥 만듬
		Level nextLevel = level.next();
		if (nextLevel != null) this.level = nextLevel;
	}

	@Override
	public String toString() {
		return String.format("%s %s", userName, level);
	}
}
