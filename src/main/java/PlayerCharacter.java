public class PlayerCharacter {

    private int positionX = 0;
    private int positionY = 0;

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public void moveW() {
        positionY++;
    }

    public void moveS() {
        positionY--;
    }

    public void moveA() {
        positionX--;
    }

    public void moveD() {
        positionX++;
    }
}
