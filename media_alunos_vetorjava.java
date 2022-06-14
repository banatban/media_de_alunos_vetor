public class media_alunos_vet{
    public static void main(String[] args){
        //Declara a variável i
        int i;
        //Declara a Array Q, e  coloca os numeros de salas q nesse caso sao 6
        double Q[] = new double[6]; 
        //Declara os valores de cada vetor
        Q[0] = 35;
        Q[1] = 4;
        Q[2] = 22;
        Q[3] = 20;
        Q[4] = 36; 
        Q[5] = 30;
        //calculara a média
        double media = ((Q[0] + Q[1] + Q[2] + Q[3] + Q[4] + Q[5]) / 6);
        //mostra ao usuário a média de alunos da sala
        System.out.println("A media de alunos é: " + media);
        
        //Uso da estrutura de repetição For
        for (i=0; i<6; i++){
            //Condicional If para determinar informações pertinentes
            if (Q[i] > media)
            // mostra a media das salas que estao acima da media geral das salas
            System.out.println("A sala " + (i+1) + " tem " + Q[i] + " alunos e tem mais alunos do que a media");
        }

    }
}
