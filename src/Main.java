import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class ExemploLista {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<Pessoas> pessoas = new ArrayList<>();

            while (true) {
                System.out.println("Digite o nome e o gênero separados por vírgula (ou digite 'fim' para sair):");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("fim")) {
                    break;
                }

                String[] valores = input.split(",");
                String nome = valores[0].trim();
                Genero genero = valores[1].trim().equalsIgnoreCase("masculino") ?
                        Genero.MASCULINO : Genero.FEMININO;
                pessoas.add(new Pessoas(nome, genero));
            }

            List<Object> homens = new ArrayList<>();
            List<Object> mulheres = new ArrayList<>();

            for (Object pessoa : pessoas) {
                if (pessoa.getGenero() == Genero.MASCULINO) {
                    homens.add(pessoa);
                } else {
                    mulheres.add(pessoa);
                }
            }

            System.out.println("Lista de homens:");
            for (Object homem : homens) {
                System.out.println(homem.getNome());
            }

            System.out.println("Lista de mulheres:");
            for (Object mulher : mulheres) {
                System.out.println(mulher.getNome());
            }
        }
    }