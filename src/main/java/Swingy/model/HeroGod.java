package Swingy.model;

public class HeroGod {

    protected int x;
    protected int y;
    protected Character currentCharacter;
    protected String type;
    
    public HeroGod() {}
    
    public void makeHero(String name, String type, int x, int y) {
        switch (type.toLowerCase()) {
            case "centaur":
                currentCharacter = new Character(name, 70, 30, 50);
                return;
            case "cerberus":
                currentCharacter = new Character(name, 35, 60, 55);
                return;
            case "cyclops":
                currentCharacter = new Character(name, 60, 25, 65);
                return;
            case "dragon":
                currentCharacter = new Character(name, 55, 50, 45);
                return;
            case "griffin":
                currentCharacter = new Character(name, 50, 50, 50);
                return;
            case "minotaur":
            default:
                currentCharacter = new Character(name, 40, 55, 55);
                return;
        }
    }

    public Character getCurrentCharacter() {
        return currentCharacter;
    }

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int d) {
        switch (d) {
            case 0:
                this.y += 1;
            case 1:
                this.x += 1;
            case 2:
                this.y -= 1;
            case 3:
                this.x -=1;
        }
    }
    
}