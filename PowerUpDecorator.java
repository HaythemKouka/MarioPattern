abstract class PowerUpDecorator extends Mario {
    protected Mario mario;

    public PowerUpDecorator(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void jump() {
        mario.jump();
    }

    @Override
    public void run() {
        mario.run();
    }
}
