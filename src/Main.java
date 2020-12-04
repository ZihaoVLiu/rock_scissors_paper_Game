public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        User user = new User();
        Game game = new Game();

        game.play(user, computer);

    }

}
