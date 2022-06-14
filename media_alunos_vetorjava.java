import java.util.Scanner;
public class media_alunos_vet2 {
    public static void main (String[] args) {
        //Uso do Scanner para entrada de dados
        Scanner scan = new Scanner(System.in);
        //Declara a Array Q e atribui a ela o tamanho 6
        double Q[] = new double[6];
        //Declara a variável i
        int i;

        //Uso da estrutura de repetição For
        for (i=0; i<6; i++) {
            //Pede para o usuário inserir a quantia de alunos por sala
            System.out.printf("Informe %2da. quantia de alunos: ", (i+1));
            //Entrada de dados de cada Array
            Q[i] = scan.nextInt();
        }
        //Operação que realiza o cáculo da média
        double media = ((Q[0] + Q[1] + Q[2] + Q[3] + Q[4] + Q[5]) / 6);
        //Informa ao usuário qual a média aritmética dos alunos
        System.out.println("A media de alunos por sala e: " + media);
        
        //Uso da estrutura de repetição For
        for (i=0; i<6; i++) {
            //Condicional que determina e informa se a sala tem a quantia de alunos acima da média
            if (Q[i] < media)
            System.out.printf("A sala "+ (i + 1) +" tem " + Q[i] + " alunos, e tem a quantia de alunos abaixo da media\n");
            else
            System.out.printf("A sala "+ (i + 1) +" tem " + Q[i] + " alunos, e tem a quantia de alunos acima da media\n");
          }

    }
}
