package at.rup.addobjects;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor {
    private double x,y;

    public CircleActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta){
        this.y++;

        if(this.y == 600){
            this.x = -50;
        };

    }

    public void render(Graphics graphics){
        graphics.drawOval((float)this.x, (float)this.y, 50, 50);
    }
}
