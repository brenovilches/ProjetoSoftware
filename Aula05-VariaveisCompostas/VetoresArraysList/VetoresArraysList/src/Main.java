public class Main {
    public static void main(String[] args) {
        //Criar um Vetor

        double[] notasAlunos = new double[3];

        notasAlunos[0] = 5.0;
        notasAlunos[1] = 6.0;
        notasAlunos[2] = 7.0;

        notasAlunos[2] = 8.0;

        System.out.println(notasAlunos[0]);
        System.out.println(notasAlunos[1]);
        System.out.println(notasAlunos[2]);

        //Percorrer o vetor
        for (double nota : notasAlunos) {
            System.out.println(nota);
        }




    }
}