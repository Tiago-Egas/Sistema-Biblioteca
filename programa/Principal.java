/**
 * 
 */
package programa;

import java.util.Scanner;
import classesAuxiliares.*;
import classesPrincipais.*;

/**
 * @author Kuruvar
 *
 */
public class Principal {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Lista<Usuario> usuarios = new Lista<Usuario>();
        Lista<Livro> livros = new Lista<Livro>();
        Lista<Emprestimo> emprestimos = new Lista<Emprestimo>();

        usuarios.addElo(new Usuario(1, "Fulano", "Criciúma", "SC", 97578310,
                55984831560L));
        usuarios.addElo(new Usuario(2, "Beltrano", "Criciúma", "SC", 97578310,
                55984831560L));
        usuarios.addElo(new Usuario(3, "Serrano", "Criciúma", "SC", 97578310,
                55984831560L));

        livros.addElo(new Livro(1, "Dagon", 1917, 1, "Weird Tales"));
        livros.addElo(
                new Livro(2, "O Chamado de Cthulhu", 1928, 1, "Weird Tales"));
        livros.addElo(new Livro(3, "Nyarlathotep", 1920, 1, "Weird Tales"));
        livros.addElo(new Livro(4, "O depoimento de Randolph Carter", 1920, 1,
                "Weird Tales"));
        livros.addElo(
                new Livro(5, "A maldição de Sarnath", 1920, 1, "Weird Tales"));
        livros.addElo(new Livro(6, "Azathot", 1938, 1, "Weird Tales"));

        emprestimos.addElo(new Emprestimo(1, 1, "Fulano", 55984831560L,
                "13/11/2021", "13/11/2021"));
        emprestimos.addElo(new Emprestimo(2, 1, "Fulano", 55984831560L,
                "13/11/2021", "13/11/2021"));
        emprestimos.addElo(new Emprestimo(3, 1, "Fulano", 55984831560L,
                "13/11/2021", "13/11/2021"));
        emprestimos.addElo(new Emprestimo(4, 2, "Beltrano", 55984831560L,
                "13/11/2021", "13/11/2021"));
        emprestimos.addElo(new Emprestimo(5, 2, "Beltrano", 55984831560L,
                "13/11/2021", "13/11/2021"));
        emprestimos.addElo(new Emprestimo(6, 3, "Serrano", 55984831560L,
                "13/11/2021", "13/11/2021"));
        emprestimos.addElo(new Emprestimo(7, 3, "Serrano", 55984831560L,
                "13/11/2021", "13/11/2021"));
        emprestimos.addElo(new Emprestimo(8, 1, "Fulano", 55984831560L,
                "13/11/2021", "13/11/2021"));
        emprestimos.addElo(new Emprestimo(9, 2, "Beltrano", 55984831560L,
                "13/11/2021", "13/11/2021"));

        boolean menuPrinc = true;
        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("###-  Menu Principal -###");
            System.out.println("###-  1. Consultas   -###");
            System.out.println("###-  2. Cadastros   -###");
            System.out.println("###-  3. Sair        -###");
            System.out.println("Opção selecionada:    ");
            int MenuPrinOpt = scan.nextInt();

            switch (MenuPrinOpt) {
                case 1:

                    boolean consMenu = true;

                    while (consMenu != false) {
                        System.out.println("###-  Menu Consultas -###");
                        optMenus();
                        int consMenuOpt = scan.nextInt(); // Seleção de Menu
                                                          // Consultas
                        System.out.println("");

                        switch (consMenuOpt) {
                            case 1:

                                for (int i = 0; i < livros.getTamanho(); i++) {
                                    System.out.println(livros.get(i).getValor());
                                }

                                break;

                            case 2:

                                for (int i = 0; i < usuarios.getTamanho(); i++) {
                                    System.out.println(usuarios.get(i).getValor());
                                }

                                break;

                            case 3:

                                for (int i = 0; i < emprestimos.getTamanho(); i++) {
                                    System.out.println(emprestimos.get(i).getValor());
                                }

                                break;

                            case 4:
                                consMenu = false; // Saída de Menu Consultas
                                break;

                            default:
                                System.out.println("\n\nOpção inválida!\n\n");
                                break;
                        }
                    }

                    break;

                case 2:
                    boolean cadMenu = true;

                    while (cadMenu != false) {
                        System.out.println("###-  Menu Cadastros -###");
                        optMenus();
                        int cadMenuOpt = scan.nextInt();
                        System.out.println("");

                        switch (cadMenuOpt) { // Seleção de Menu Cadastros
                            case 1:

                                livros.addElo(new Livro(scan.nextInt(), scan.next(),
                                        scan.nextInt(), scan.nextInt(), scan.next()));
                                System.out.println("Registro realizado com sucesso!");

                                break;

                            case 2:

                                usuarios.addElo(new Usuario(scan.nextInt(), scan.next(),
                                        scan.next(), scan.next(), scan.nextInt(),
                                        scan.nextLong()));
                                System.out.println("Registro realizado com sucesso!");

                                break;

                            case 3:

                                emprestimos.addElo(new Emprestimo(scan.nextInt(),
                                        scan.nextInt(), scan.next(), scan.nextLong(),
                                        scan.next(), scan.next()));
                                System.out.println("Registro realizado com sucesso!");

                                break;

                            case 4:
                                cadMenu = false; // Saída de Menu Cadastros
                                break;

                            default:
                                System.out.println("\n\nOpção inválida!\n\n");
                                break;
                        }
                    }

                    break;

                case 3:
                    System.out.println(
                            "\n\nSaída do sistema selecionada...\n\nAté a próxima.");
                    menuPrinc = false;
                    break;

                default:
                    System.out.println("\n\nOpção inválida!\n\n");
                    break;
            }
            scan.close();
        } while (menuPrinc);
    }

    public static void optMenus() {
        System.out.println("###-  1. Livros      -###");
        System.out.println("###-  2. Usuários    -###");
        System.out.println("###-  3. Empréstimos -###");
        System.out.println("###-  4. Voltar      -###");
        System.out.println("Opção selecionada:    ");
    }
}
