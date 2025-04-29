import java.util.Scanner;
/**
 * entrada via console
 * 
 * @author (Felipe Mendes Campos) 
 * @version (30/04/2024)
 *
para mudar entrada via console ou grafica, mudar nas classes: CadastroAlunos e Controller
 */
    public class EntradaConsole implements IEntrada {
    Scanner scan = new Scanner( System.in );

    /**
     * lerIdade - entrada de idade (texto)
     *
     * @return int, idade fornecida
     */    
    public String lerNome(){

        String nome = null;
        boolean resp = false;
        do{
            try{ 
                System.out.print("Forneca nome: ");
                nome = scan.nextLine(); 

                if (nome == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if(nome.trim().isEmpty()){
                    System.out.println("\nERRO: Nao houve um nome inserido.\n");
                }else if(nome.matches(".*\\d.*")){
                System.out.println("\nERRO: O nome não deve conter números.\n");
            }  else{
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
     * lerIdade - entrada de idade (texto)
     *
     * @return int, idade fornecida
     */
    public int lerIdade(){ 
        String aux = null;
        int idade = 0;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca idade: ");
                aux = scan.nextLine();
                idade = Integer.parseInt(aux);
                if(idade < 16 || idade > 70){
                System.out.println("\nERRO: Insira uma idade valida entre 1 e 120.\n");
            } else {
                resp = true;
            }
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
     * lerNota - entrada de nota (texto)
     *
     * @return float, nota fornecida
     */
    public float lerNota(){ 
        String aux = null;
        int nota = 0;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca nota: ");
                aux = scan.nextLine();
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
     * lerRA - entrada do RA (texto)
     *
     * @return String, RA fornecido
     */
    public String lerRA(){
        String RA = null;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca RA: ");
                RA = scan.nextLine();

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
     * lerSemestre - entrada de semestre (texto)
     *
     * @return int, serie fornecida
     */
    public int lerSemestre(){
        String aux = null;
        int semestre = 0;
        boolean resp = false;
        do{
            try{
                System.out.print("Forneca o semestre: ");
                aux = scan.nextLine();
                semestre = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um semestre inserido\n");}
                else{System.out.println("\nERRO: Insira uma semestre valido.\n");
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
        System.out.println("SEJA BEM-VINDO AO PORTAL DE CONTROLE\n");
        delay();
        System.out.println("\n------------MENU----------");
        System.out.println("(I) Inserir Aluno");
        System.out.println("(R) Remover Aluno");
        System.out.println("(L) Listar Alunos");
        System.out.println("(S) Sair");
        System.out.println("--------------------------");
        char op = scan.next().charAt(0);
        return op;
    }
    //limpa o buffer do teclado
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    //Pede a quantidade de disciplanas
    public int lerQtd(){
        String aux = null;
        int qtd = 0;
        boolean resp = false;
        do{
            try{
                System.out.print("Quantas disciplinas o aluno possui? ");
                aux = scan.nextLine();
                qtd = Integer.parseInt(aux);
                resp = true;
            }
            catch(NumberFormatException e){
                if (aux == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if (aux.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve uma quantidade de disciplinas inserida.\n");
                }else{
                    System.out.println("\nERRO: Insira uma quantidade de disciplinas valida\n");
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
                System.out.print("Forneca nome da Disciplina: ");
                nomeD = scan.nextLine();

                if (nomeD == null){
                    System.out.println("\nERRO: Operacao cancelada!\n");
                } else if(nomeD.trim().isEmpty()) {
                    System.out.println("\nERRO: Nao houve um nome de disciplina inserido\n");
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
    
    
    public static void delay(){
        
        try {
            Thread.sleep(1000); // delay de um segundo
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        
    }

