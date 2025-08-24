public class MarsRover {
    int x;
    int y;
    DIRECTION direction;

    MarsRover(int x, int y, DIRECTION direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    String getDirection() {
        return this.direction.name();
    }


    public void execute(String commands) {
        for (int idx = 0; idx < commands.length(); idx++) {
            char command = commands.charAt(idx);
            if (command == 'M') {
                if (this.direction == DIRECTION.S) this.y--;
                else if (this.direction == DIRECTION.N) this.y++;
                else if (this.direction == DIRECTION.E) this.x++;
                else this.x--;
            } else if (command == 'L') {
                this.direction = this.direction.Anticlockwise();
            } else if (command == 'R') {
                this.direction = this.direction.Clockwise();
            } else if (command == 'B') {
                if (this.direction == DIRECTION.S) this.y++;
                else if (this.direction == DIRECTION.N) this.y--;
                else if (this.direction == DIRECTION.E) this.x--;
                else this.x++;
            }
        }
    }

    public String report() {
        return String.format("(%d,%d) %s", x, y, direction, direction.name());
    }
}
