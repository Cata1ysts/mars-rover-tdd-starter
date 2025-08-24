public class MarsRover {
    int x;
    int y;
    DIRECTION direction;
    MarsRover(int x,int y,DIRECTION direction){
        this.x=x;
        this.y=y;
        this.direction=direction;
    }
    int getX(){return this.x;}
    int getY(){return this.y;}
    int getDirection(){return this.direction.ordinal();}


}
