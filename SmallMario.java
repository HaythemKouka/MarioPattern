class SmallMario implements MarioState {
    @Override
    public void jump() {
        System.out.println("Petit Mario saute.");
    }

    @Override
    public void run() {
        System.out.println("Petit Mario court.");
    }

    @Override
    public void takeDamage(Mario mario) {
        System.out.println("Petit Mario perd une vie !");
        mario.setState(new SmallMario()); // Reste en petit Mario
    }
}

