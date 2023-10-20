package at.rup.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private int rectX,rectY,circleX,circleY;
    private boolean circleUp = false;
    private boolean circleDown = true;

    public MainGame(String title){
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectY = 75;
        this.rectX = 75;
        this.circleX = 375;
        this.circleY = 275;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        circleY++;

        if(this.circleY == 600){
            this.circleY = -50;
        }

        if(this.rectX >= 75 && this.rectY == 75){
            this.rectX++;
        }
        if(this.rectX == 725 && this.rectY >= 75){
            this.rectY++;
        }
        if(this.rectX <= 725 && this.rectY == 525){
            this.rectX--;
        }
        if(this.rectX == 75 && this.rectY <= 525){
            this.rectY--;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.rectX, this.rectY, 50, 50);
        graphics.drawOval(this.circleX, this.circleY, 50 , 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.rup.firstgame.MainGame("First Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

