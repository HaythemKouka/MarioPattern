class InvincibleMario implements MarioState {
    @Override
    public void jump() {
        System.out.println("Mario invincible saute avec éclat !");
    }

    @Override
    public void run() {
        System.out.println("Mario invincible court très vite !");
    }

    @Override
    public void takeDamage(Mario mario) {
        System.out.println("Mario invincible ne subit aucun dégât !");
    }
}
