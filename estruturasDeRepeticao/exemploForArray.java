package BootcampJavaDIO.estruturasDeRepeticao;

public class exemploForArray {
    public static void main(String[] args) {
        String alunos [] = { "NATHAN", "VITORIA", "CARLA", "JOAQUIM"};
        
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }
        //ou
        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
