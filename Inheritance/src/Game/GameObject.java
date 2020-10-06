package Game;

public abstract class GameObject {
	
	public abstract void draw();
	
	public static void main(String[] args) {
		Player player = new Player();
		player.someMethod();
		// player.draw();
		
		Manu menu = new Manu();
		// menu.draw();
		
		GameObject [] gameObjects = new GameObject [2];
		gameObjects [0] = player;
		gameObjects [1] = menu;
		
		for(GameObject obj : gameObjects) {
			obj.draw();
		}
		// abstract classes exist to be extended
		// GameObject myObject = new GameObjext();
	}
}
