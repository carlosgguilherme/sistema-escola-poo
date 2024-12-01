import java.sql.SQLException;
import java.util.Scanner;

public class Aluno{
    private static void menuAluno(Scanner sc) throws SQLException {
        while(true){
            System.out.println("\nArea do Professor:");
            System.out.println("1. Ver Notas");
            System.out.println("2. Ver Faltas");
            System.out.println("3. Ver Horario de aula");
            System.out.println("4. Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1: seeNotas(sc);
                case 2: seeFaltas(sc);
                case 3: seeHorarios(sc);
                case 4: {
                    System.out.println("\nEncerrando Sistema:");
                    return;
                }
                default: System.out.println("Opção Invalida");
            }
        }
    }
    public static void registrarAluno(Scanner sc) throws SQLException {

    }
    public static void acessoAluno(Scanner sc) throws SQLException {

    }
    private static void seeNotas(Scanner sc) throws SQLException {

    }
    private static void seeFaltas(Scanner sc) throws SQLException {

    }
    private static void seeHorarios(Scanner sc) throws SQLException {

    }
}
