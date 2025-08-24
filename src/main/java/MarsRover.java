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
            if      (command == 'M') execute_M();
            else if (command == 'L') execute_L();
            else if (command == 'R') execute_R();
            else if (command == 'B') execute_B();
        }
    }

    private void execute_R() {
        this.direction = this.direction.Clockwise();
    }

    private void execute_L() {
        this.direction = this.direction.Anticlockwise();
    }

    private void execute_B() {
        if (this.direction == DIRECTION.S) this.y++;
        else if (this.direction == DIRECTION.N) this.y--;
        else if (this.direction == DIRECTION.E) this.x--;
        else this.x++;
    }

    private void execute_M() {
        if (this.direction == DIRECTION.S) this.y--;
        else if (this.direction == DIRECTION.N) this.y++;
        else if (this.direction == DIRECTION.E) this.x++;
        else this.x--;
    }

    public String report() {
        return String.format("(%d,%d) %s", x, y, direction, direction.name());
    }
}
