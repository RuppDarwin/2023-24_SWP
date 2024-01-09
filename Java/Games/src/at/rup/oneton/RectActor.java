package at.rup.addobjects;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor {
    private double x,y;

    public RectActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta){

        if(this.x >= 75 && this.y == 75){
            this.x++;
        }
        if(this.x == 725 && this.y >= 75){
            this.y++;
        }
        if(this.x <= 725 && this.y == 525){
            this.x--;
        }
        if(this.x == 75 && this.y <= 525){
            this.y--;
        }

    }

    public void render(Graphics graphics){
        graphics.drawRect((float)this.x, (float)this.y, 50, 50);
    }

}
