package TemplatePattern;

/**
 * Created by Ben Yu on 4/10/15.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();

        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
