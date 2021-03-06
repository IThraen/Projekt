package cells;

public class Stone extends Cell {

	private String spriteName = "stone";
	private int nbSprites = 1;
	private String alternateSpriteName = "reachable";
	private int nbAlternateSprites = 1;

	public Stone(int x, int y) {
		super(20, x, y);
		randomizeSprite(nbSprites);
		randomizeAlternateSprite(nbAlternateSprites);
	}

	public String getSpriteName() {
		return spriteName;
	}

	public void setSpriteName(String spriteName) {
		this.spriteName = spriteName;
		setSprite(spriteName);
	}

	public String getAlternateSpriteName() {
		return alternateSpriteName;
	}

	public void setAlternateSpriteName(String spriteName) {
		this.spriteName = spriteName;
		setSprite(spriteName);
	}
}