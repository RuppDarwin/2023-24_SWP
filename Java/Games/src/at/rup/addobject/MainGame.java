package at.rup.addobject;

import org.newdawn.slick.*;

public class MainGame extends BasicGame {
    private CircleActor c1;
    private RectActor r1;

    public MainGame(String title){
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.c1 = new CircleActor(375, 275);
        this.r1 = new RectActor(75,75);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.c1.update(gameContainer, i);
        this.r1.update(gameContainer, i);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.c1.render(graphics);
        this.r1.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Add Objects"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

