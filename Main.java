public class Main {
    public static void main(String[] args) {
        System.out.println("=== Début du jeu ===");

        // Initialisation du personnage
        Mario mario = new Mario();

        // Cas 1 : Mario démarre en Petit Mario
        System.out.println("\n--- Cas 1 : Petit Mario ---");
        mario.jump();
        mario.run();
        mario.takeDamage();

        // Cas 2 : Mario devient Grand Mario
        System.out.println("\n--- Cas 2 : Mario devient Grand Mario ---");
        mario.setState(new BigMario());
        mario.jump();
        mario.run();

        // Mario subit des dégâts et redevient Petit Mario
        System.out.println("\nMario subit des dégâts...");
        mario.takeDamage();

        // Cas 3 : Mario devient Invincible
        System.out.println("\n--- Cas 3 : Mario devient Invincible ---");
        mario.setState(new InvincibleMario());
        mario.jump();
        mario.run();
        mario.takeDamage();

        // Cas 4 : Ajout d'un Power-up (Fleur de Feu) à Mario Invincible
        System.out.println("\n--- Cas 4 : Mario Invincible avec Fleur de Feu ---");
        mario = new FireMario(mario);
        mario.jump();
        mario.run();
        ((FireMario) mario).shootFireball();

        // Cas 5 : Mario perd l'invincibilité et redevient Grand Mario avec Fleur de Feu
        System.out.println("\n--- Cas 5 : Mario redevient Grand Mario avec Fleur de Feu ---");
        mario.setState(new BigMario());
        mario.jump();
        mario.run();
        ((FireMario) mario).shootFireball();

        // Cas 6 : Ajout d'une Étoile à Mario Grand avec Fleur de Feu
        System.out.println("\n--- Cas 6 : Mario Grand + Fleur de Feu + Étoile ---");
        mario = new StarMario(mario);
        mario.jump();
        mario.run();

        // Cas 7 : Mario perd tout et redevient Petit Mario
        System.out.println("\n--- Cas 7 : Mario perd tout ---");
        mario = new Mario(); // Réinitialisation
        mario.jump();
        mario.run();

        System.out.println("\n=== Fin du jeu ===");
    }
}
