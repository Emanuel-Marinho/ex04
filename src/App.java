public class App {
    public static void main(String[] args) throws Exception {
        Ponto2D ponto1 = new Ponto2D(1, 2);
        Ponto2D ponto2 = new Ponto2D(4, 6);

        System.out.println("Ponto 1 " + ponto1.mostrar());
        System.out.println("Ponto 2 " + ponto2.mostrar());
        System.out.println("Os pontos são iguais? " + ponto1.compararPonto(ponto2));
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre os pontos: " + distancia);
    }
}
