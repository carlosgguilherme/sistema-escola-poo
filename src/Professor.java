import java.sql.SQLException;
import java.util.Scanner;

public class Professor {
    private static void menuProfessor(Scanner sc) throws SQLException {
        while(true){
            System.out.println("\nArea do Professor:");
            System.out.println("1. Add Notas");
            System.out.println("2. Add Faltas");
            System.out.println("3. Registrar Horario de aula");
            System.out.println("4. Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1: addNotas(sc);
                case 2: addFaltas(sc);
                case 3: registraHorario(sc);
                case 4: {
                    System.out.println("\nEncerrando Sistema:");
                    return;
                }
                default: System.out.println("Opção Invalida");
            }
        }
    }
    public static void registraProfessor(Scanner sc) throws SQLException {

    }
    public static void acessoProfessor(Scanner sc) throws SQLException {

    }
    public static void addNotas(Scanner sc) throws SQLException {

    }
    public static void addFaltas(Scanner sc) throws SQLException {

    }
    public static void registraHorario(Scanner sc) throws SQLException {

    }
}
