package formes.src.fr.esgi.poo.formes;

public class Rectangle {

    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /*
     * Calculer la surface du rectangle
     * @return int
     */
    public int area() {
        return this.longueur * this.largeur;
    }
    
    /*
     * Calculer le périmètre du rectangle
     * @return int
     */
    public int perimeter() {
        return 2 * (this.longueur + this.largeur);
    }

}