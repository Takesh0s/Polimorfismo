package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<>();

        listaLivros.add(new Livro("Manifesto Comunista", "Paulo Coelho", 39.02));
        listaLivros.add(new Livro("Chainsaw Man", "Tatsuki Fujimoto", 72.93));
        listaLivros.add(new Ebook("1984", "George Orwell", 19.90, 1.2));
        listaLivros.add(new Ebook("Dom Casmurro", "Machado de Assis", 25.00, 0.8));

        for (Livro livro : listaLivros) {
            livro.exibirDetalhes();
            System.out.println("-------------+------------");
        }
    }
}
