import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaInterativa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaMasculino = new ArrayList<>();
        List<String> listaFeminino = new ArrayList<>();

        System.out.println("Digite os elementos da lista separados por vírgula e gênero (M/F):");
        String input = scanner.nextLine();

        String[] elementos = input.split(",");
        for (String elemento : elementos) {
            String[] partes = elemento.trim().split(" ");
            String nome = partes[0];
            String genero = partes[1];

            if (genero.equalsIgnoreCase("M")) {
                listaMasculino.add(nome);
            } else if (genero.equalsIgnoreCase("F")) {
                listaFeminino.add(nome);
            }
        }

        System.out.println("Elementos da lista (Masculino):");
        for (String elemento : listaMasculino) {
            System.out.println(elemento);
        }

        System.out.println("Elementos da lista (Feminino):");
        for (String elemento : listaFeminino) {
            System.out.println(elemento);
        }

        scanner.close();
    }
}