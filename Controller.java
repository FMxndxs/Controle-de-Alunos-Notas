/**
 * A classe controller é responsavel por controlar o acesso de dados 
 * 
 * @author (Felipe Mendes Campos) 
 * @version (30/04/2024)
 */
public class Controller
{
    //private EntradaConsole dados = new EntradaConsole();
    private EntradaGui dados = new EntradaGui();
    CadastroAlunos c = new CadastroAlunos(60);
    
    //Pergunta a opcao do menu
    public void escolha()
    {
        char op;
        do{
            op = dados.opcao();
            switch(op){
                case 'I', 'i': {
                        c.inserir(); break;
                    }
                case 'R', 'r':{retirarAluno(); break;}
                case 'L', 'l':{c.listar(); break;}
                case 'S', 's':{System.out.println("\nPrograma fechado."); break;}
                default: {System.out.println("\nInsira uma opcao valida."); break;}
            }
        } while (op != 'S' && op != 's');
    }
    //cria o aluno com as suas informacoes
    public Aluno criaAluno(){
        String nome =  dados.lerNome();
        int idade = dados.lerIdade();
        String ra = dados.lerRA();
        int serie = dados.lerSemestre();
        int qtd = dados.lerQtd();
        Disciplina disc[] = dados.lerDisc(qtd);

        Aluno aluno = new Aluno(nome,idade,ra,serie,disc);
        return aluno;
    }
    
   
    //Retira o aluno com as suas informacoes
    public void retirarAluno(){

        if(c.retirar())
            System.out.println("Aluno retirado.");
        else
            System.out.println("Aluno nao encontrado.");

    }
    
    
}

