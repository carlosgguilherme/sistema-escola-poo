import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Menu.menu(sc);
        } catch (SQLException e){
            System.err.println(" Erro no banco de dados" + e.getMessage());
        }
    }
}