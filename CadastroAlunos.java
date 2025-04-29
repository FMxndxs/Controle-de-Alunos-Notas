/**
 * Registro de Cadastro
 * 
 * @author (Felipe Mendes Campos) 
 * @version (30/04/2024)
 */
public class CadastroAlunos {
    // variaveis de instância
    private Aluno cad[];
    private EntradaGui dados = new EntradaGui();
    //private EntradaConsole dados = new EntradaConsole();

    /**
     * Construtor para objetos da classe CadastroAlunos
     */
    public CadastroAlunos(int qtde){
        cad = new Aluno[qtde];
    }
    //Insere aluno no array
    public void inserir()
    { 

        //ler dados

        Controller c = new Controller();
        Aluno a = c.criaAluno();
        String ra = a.getRA();

        int i = 0;
        int aux = 0;
        do{
            if(!verificaRA(ra,i)){
            if(cad[i] == null)
            {cad[i] = a; aux = 1;System.out.println("\nAluno cadastrado com sucesso!!");}
            }
        else
        {System.out.println("\nRA ja cadastrado"); aux = 1;}
            i++;
        
        }while(aux != 1 || i >=  cad.length);
    }     
    //Remove aluno do array
    public boolean retirar(){

        String ra = dados.lerRA();
        for(int i = 0; i < cad.length; i++){
            if(cad[i] != null && cad[i].getRA().equals(ra)){
                cad[i] = null;
                return true;
            }
        }
        return false;
    }
    //Cria um array
    public void listar(){
        int aux = 0;
        for(int i = 0; i < cad.length; i++)
            if(cad[i] != null)
            {cad[i].imprimeAluno(); aux = 1;}

        if(aux == 0) System.out.println("\nNao ha alunos cadastrados");
    }
    //Verifica se o Ra ja foi cadastrado
    private boolean verificaRA(String ra, int i){
        boolean resp = false;

        if(cad[i] != null && cad[i].getRA().equals(ra))
            resp = true;

        return resp;

    }
}

