public class Dragon10 {

    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon10(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        this.x--;
        if (this.x < 0) {
            this.x = 0;
            detectCollision();
        }
    }

    public void moveRight() {
        this.x++;
        if (this.x > this.width) {
            this.x = this.width;
            detectCollision();
        }
    }

    public void moveUp() {
        this.y--;
        if (this.y < 0) {
            this.y = 0;
            detectCollision();
        }
    }

    public void moveDown() {
        this.y++;
        if (this.y > this.height) {
            this.y = this.height;
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Position: (" + this.x + ", " + this.y + ")");
    }

    public void detectCollision() {
        System.out.println("Game Over!");
    }

    public static void main(String[] args) {
        Dragon10 dragon = new Dragon10(5, 5, 10, 10);

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveRight();
        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.moveDown();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();
    }
}
