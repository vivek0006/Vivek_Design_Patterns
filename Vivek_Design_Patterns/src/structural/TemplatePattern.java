package structural;
abstract class Game {

    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play(){

        initialize();
        start();
        end();
    }
}

class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }
    @Override
    void start() {
        System.out.println("Game Started. Welcome to in the chess game!");
    }
    @Override
    void end() {
        System.out.println("Game Finished!");
    }
}

class Soccer extends Game {

    @Override
    void initialize() {
        System.out.println("Soccer Game Initialized! Start playing.");
    }

    @Override
    void start() {
        System.out.println("Game Started. Welcome to in the Soccer game!");
    }

    @Override
    void end() {
        System.out.println("Game Finished!");
    }
}

class TemplatePatternDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class c = Class.forName("structural.Chess");
        Game game = (Game) c.newInstance();
        game.play();
    }
}