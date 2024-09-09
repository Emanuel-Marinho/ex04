public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean compararPonto(Ponto2D outro) {
        return this.x == outro.x && this.y == outro.y;
    }

    public double calcularDistancia(Ponto2D outro) {
        double deltaX = this.x - outro.x;
        double deltaY = this.y - outro.y;

        return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
    }

    public String mostrar() {
        return "(" + this.x + "," + this.y + ")";
    }

}
