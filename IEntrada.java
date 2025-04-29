/**
 * Interface da entrada de dados
 * 
 * @author (Felipe Mendes Campos) 
 * @version (30/04/2024)
 *
 para mudar entrada via console ou grafica, mudar nas classes: CadastroAlunos e Controller
 */

public interface IEntrada {
    // interface ou assinaturas de metodos
    public char opcao();
    public  String lerNome(); 
    public  int lerIdade(); 
    public  float lerNota();
    public String lerRA();
    public int lerSemestre();
    public Disciplina [] lerDisc(int qtde);
    public int lerQtd();
    public String nomeDaDisc();
}
