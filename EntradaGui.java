import javax.swing.JOptionPane;

/**
 * Entrada gráfica de dados
 * 
 * @author (Felipe Mendes Campos) 
 * @version (30/04/2024)
 */
public class EntradaGui implements IEntrada {
    /**
     * lerNome - entrada de nome (grafica)
     *
     * @return String, nome fornecido
     */
    public String lerNome() {

        String nome = null;
        boolean resp = false;
        do{
            try{ 
                nome = JOptionPane.showInputDialog("Forneca nome: ");

                if (nome == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if(nome.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um nome inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nome;
    }

    /**
     * lerIdade - entrada de idade (grafica)
     *
     * @return int, idade fornecida
     */
    public int lerIdade(){ 
        String aux = null;
        int idade = 0;
        boolean resp = false;
        do{
            try{ 
                aux = JOptionPane.showInputDialog("Forneca idade: ");
                idade = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve uma idade inserida.\n");
                }else{
                    System.out.println("\nERRO: Insira uma idade valida.\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return idade;
    }

    /**
     * lerNota - entrada de nota (grafica)
     *
     * @return float, nota fornecida
     */
    public float lerNota(){ 
        String aux = null;
        int nota = 0;
        boolean resp = false;
        do{
            try{ 
                aux = JOptionPane.showInputDialog("Forneca nota: ");
                nota = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve uma nota inserida.\n");
                }else{
                    System.out.println("\nERRO: Insira uma nota valida.\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nota;
    }

    /**
     * lerRA - entrada do ra (grafica)
     *
     * @return String, ra fornecido
     */
    public String lerRA(){
        String RA = null;
        boolean resp = false;
        do{
            try{ 
                RA = JOptionPane.showInputDialog("Forneca RA: ");

                if (RA == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");;
                } else if(RA.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um RA inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return RA;
    }

    /**
     * lerSerie - entrada da serie (grafica)
     *
     * @return int, serie fornecida
     */
    public int lerSemestre(){
        String aux = null;
        int semestre = 0;
        boolean resp = false;
        do{
            try{ 
                aux = JOptionPane.showInputDialog("Forneca o semestre: ");
                semestre = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um semestre inserido.\n");}
                else{
                    System.out.println("\nERRO: Insira um semestre valido.\n");
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos.\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido.\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return semestre;
    }
    //Pede a disciplina e a nota do aluno e cria o vetor disciplina
    public Disciplina [] lerDisc(int qtde){
        Disciplina disc[] = new Disciplina[qtde];

        for (int i = 0; i < qtde; i++){
            String nomeD = nomeDaDisc();
            float notaD = lerNota();
            disc[i] = new Disciplina(nomeD, notaD);
        }
        return disc;
    }
    //Mostra a opcao de escolha que deseja executar
    public char opcao(){

        char  op = JOptionPane.showInputDialog("(I) Inserir Aluno;(R) Remover Aluno;(L) Listar Alunos;(S) Sair").charAt(0);
        return op;
    }
    //Pede a quantidade de disciplanas
    public int lerQtd(){
        String aux = null;
        int qtd = 0;
        boolean resp = false;
        do{
            try{ 
                aux = JOptionPane.showInputDialog("Quantas disciplinas o aluno possui? ");
                qtd = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve uma quantida de disciplinas inserida.\n");
                }else{
                    System.out.println("\nERRO: Insira uma quantida de disciplinas valida.\n");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return qtd;
    }

    /**
     * lernomeDaDisc - entrada do nome da disciplina (grafica)
     *
     * @return String, nome da disciplina fornecida
     */
    public String nomeDaDisc(){
        String nomeD = null;
        boolean resp = false;
        do{
            try{ 
                nomeD = JOptionPane.showInputDialog("Forneca nome da Disciplina: ");

                if (nomeD == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if(nomeD.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um nome de disciplina inserido.\n");
                }else{
                    resp = true;
                }

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nERRO: Nao e possivel inserir mais alunos\n");
            }
            catch(NullPointerException e){
                System.out.println("\nERRO: Nada foi inserido\n");}
            catch(Exception e){
                System.out.println("\nERRO: Sistema Indisponível.\n");
            }
        }  while (!resp);

        return nomeD;
    }
}
