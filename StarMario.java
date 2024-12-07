
class StarMario extends PowerUpDecorator {
    public StarMario(Mario mario) {
        super(mario);
    }

    @Override
    public void jump() {
        System.out.println("Mario étoilé saute avec invincibilité !");
    }

    @Override
    public void run() {
        System.out.println("Mario étoilé court avec invincibilité !");
    }
} 