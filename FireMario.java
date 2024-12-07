class FireMario extends PowerUpDecorator {
    public FireMario(Mario mario) {
        super(mario);
    }

    public void shootFireball() {
        System.out.println("Mario lance une boule de feu !");
    }
}
