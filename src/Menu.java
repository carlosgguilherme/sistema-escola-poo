import java.sql.*;
import java.util.Scanner;

public class Menu {
    public static void menu(Scanner sc) throws SQLException{
        while(true){
            System.out.println("\nPara acesso:");
            System.out.println("1. Acesso Professor");
            System.out.println("2. Acesso Aluno");
            System.out.println("\nPara Registrar:");
            System.out.println("3. Registrar Professor");
            System.out.println("4. Registrar Aluno");
            System.out.println("\n-------------------");
            System.out.println("5. Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1: Professor.acessoProfessor(sc);
                case 2: Aluno.acessoAluno(sc);
                case 3: Professor.registraProfessor(sc);
                case 4: Aluno.registrarAluno(sc);
                case 5: {
                    System.out.println("\nEncerrando Sistema:");
                    return;
                }
                default: System.out.println("Opção Invalida");
            }
        }
    }
}

