 

 class Mario {
    private MarioState state;

    public Mario() {
        this.state = new SmallMario(); // État initial
    }

    public void setState(MarioState state) {
        this.state = state;
    }

    public void jump() {
        state.jump();
    }

    public void run() {
        state.run();
    }

    public void takeDamage() {
        state.takeDamage(this);
    }
}

 