package br.edu.ifsp.biblioteca;

import br.edu.ifsp.biblioteca.domain.Livro;


public class BibliotecaApplication {
    public static void main(String[] args) {

        Livro livro = new Livro(

            "9788508145607",
            "Dom Casmurro",
            2026
        );

        Livro livro2 = new Livro(

                "9788573264579",
                "Dom Quixote",
                2026
        );

        Livro livro3 = new Livro(

                "9788573266467",
                "Crime e Castigo",
                2026
        );

        System.out.println(livro);
    }
}
