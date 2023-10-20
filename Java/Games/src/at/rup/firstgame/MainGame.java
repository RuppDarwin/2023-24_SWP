package at.rup.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private int rectX,rectY,circleX,circleY;
    private boolean circleUp = false;
    private boolean circleDown = true;
    private boolean rectRight = true;
    private boolean rectLeft = false;
    private boolean rectUp = false;
    private boolean rectDown = false;

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
        if(circleUp) {
            this.circleY--;
        }else if(circleDown){
            this.circleY++;
        }

        if(rectRight) {
            this.rectX++;
        }else if(rectLeft){
            this.rectX--;
        }else if(rectUp){
            this.rectY--;
        }else if(rectDown){
            this.rectY++;
        }

        if(rectX == 725){
            this.rectRight = false;
            this.rectDown = true;
        }
        if(rectY == 525){
            this.rectDown = false;
            this.rectLeft = true;
        }
        if(rectX == 75){
            this.rectLeft = false;
            this.rectUp = true;
        }
        if(rectY == 75){
            this.rectUp = false;
            this.rectRight = true;
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

