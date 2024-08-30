// Classe principal para testar as formas geométricas
public class FormasGeometricas {
    public static void main(String[] args) {
        Poligono quadrilatero = new Poligono("Quadrilátero", 4, new int[]{10, 15, 12, 14});
        Poligono pentagono = new Poligono("Pentágono", 5, new int[]{7, 8, 9, 10, 11});
        Poligono heptagono = new Poligono("Heptágono", 7, new int[]{6, 7, 8, 9, 10, 11, 12});
        Poligono octagono = new Poligono("Octágono", 8, new int[]{5, 6, 7, 8, 9, 10, 11, 12});
        Poligono eneagono = new Poligono("Eneágono", 9, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});

        quadrilatero.desenhar();
        quadrilatero.exibirInformacoes();
        System.out.println("Perímetro: " + quadrilatero.calcularPerimetro());
        System.out.println("Lados Iguais: " + quadrilatero.verificarLadosIguais());

        pentagono.desenhar();
        pentagono.exibirInformacoes();

        heptagono.desenhar();
        heptagono.exibirInformacoes();

        octagono.desenhar();
        octagono.exibirInformacoes();

        eneagono.desenhar();
        eneagono.exibirInformacoes();
    }
}

// Classe Polígono
class Poligono {
    String nome;
    int lados;
    int[] comprimentoLados;

    Poligono(String nome, int lados, int[] comprimentoLados) {
        this.nome = nome;
        this.lados = lados;
        this.comprimentoLados = comprimentoLados;
    }

    public void desenhar() {
        System.out.println("Desenhando um " + nome + ".");
    }

    public int calcularPerimetro() {
        int perimetro = 0;
        for (int lado : comprimentoLados) {
            perimetro += lado;
        }
        return perimetro;
    }

    public boolean verificarLadosIguais() {
        int primeiroLado = comprimentoLados[0];
        for (int lado : comprimentoLados) {
            if (lado != primeiroLado) {
                return false;
            }
        }
        return true;
    }

    public void exibirInformacoes() {
        System.out.println(nome + " com " + lados + " lados.");
    }
}
