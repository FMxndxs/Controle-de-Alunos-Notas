/**
 * Classe construtora de aluno
 * 
 * @author (Felipe Mendes Campos) 
 * @version (30/04/2024)
 */
public class Aluno extends Pessoa {
    // Atributos
    String ra;  //String para armazenar o RA do aluno
    int semestre;
    Disciplina disc[];

    /**
     * Aluno Construtor para iniciar dados do aluno
     *
     * @param nome String, nome do aluno
     * @param idade int, idade do aluno
     * @param ra String, ra do aluno
     * @param serie int, semestre do aluno
     * @param disc array de Disciplinas
     */
    Aluno(String nome, int idade, String ra, int semestre, Disciplina disc[]){
        super (nome, idade);
        setRa(ra);
        setSemestre(semestre);
        setDisc(disc);
    }
    //Armazena RA
    private void setRa(String ra){
        this.ra = ra;
    }
    //Armazena Serie
    private void setSemestre(int semestre){
        this.semestre = semestre;
    }
    //Armazena Disciplina
    private void setDisc(Disciplina disc[]){
        this.disc = disc;
    }
    //retorna o RA armazenado
    public String getRA(){
        return this.ra;
    }
    //retorna a serie armazenada
    public int getSemestre(){
        return this.semestre;
    }
    //retorna a disciplina armazenada
    public Disciplina [] getDisc(){
        return this.disc;
    }
    //Imprime a disciplina e a nota
    public void imprimeDiscs(){
        for(int i = 0; i < disc.length; i++)
            System.out.println("Disciplina: " + disc[i].getNomeDisc() + " Nota: " + disc[i].getNota() );
    }
    //Imprime dados do aluno
    public void imprimeAluno(){
        System.out.println("---------------ALUNO--------------------");
        System.out.println(toString() + "\nRA: " + getRA() + "\nSemestre: " + getSemestre());
        imprimeDiscs();
        System.out.println("------------------------------------------");
    }
}

