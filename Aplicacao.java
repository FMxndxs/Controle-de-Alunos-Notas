import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Classe aplicacao possui um main que inicia o programa
 * 
 * @author (Felipe Mendes Campos) 
 * @version (30/04/2024)
 */
public class Aplicacao {
    //exibe o menu
    public static void main(String args[]) {
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Escolha o método de entrada: 1 para Console, 2 para GUI");
        // int escolha = scanner.nextInt();
        
        // if(escolha == 1){
            // Controller c = new Controller();

            // c.escolha();
        // }
        // else if(escolha == 2){
            // EntradaGui entradaGui = new EntradaGui();
            
            // entradaGui.escolha();
        // }
        // else{
            // System.out.println("Escolha uma opcao valida");
        // }

        Controller c = new Controller();

            c.escolha();

       
        
        
    }
}
