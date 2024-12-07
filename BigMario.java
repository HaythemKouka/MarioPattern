 
class BigMario implements MarioState {
    @Override
    public void jump() {
        System.out.println("Grand Mario saute haut.");
    }

    @Override
    public void run() {
        System.out.println("Grand Mario court.");
    }

    @Override
    public void takeDamage(Mario mario) {
        System.out.println("Grand Mario devient Petit Mario !");
        mario.setState(new SmallMario());
    }
}
