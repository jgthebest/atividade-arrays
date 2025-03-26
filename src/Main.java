public class Main {
    public static void main(String[] args) {

        Aluno[] turma = new Aluno[3];

        turma[0] = new Aluno("João", 21);
        turma[1] = new Aluno("Maria", 20);
        turma[2] = new Aluno("Joana", 19);

        for (Aluno aluno : turma) {
            System.out.println(aluno);
        }
    }
}


//public class Main {
//    public static void main(String[] args){
////        double[] notas = {7.0, 8.5, 9.0, 6.0, 7.5};
////        double soma = 0;
////        for (double nota : notas) {
////            soma += nota;
////        }
////        System.out.printf("Média da turma: %.2f", (soma / notas.length));
//
//        int[][] matriz = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
////        metodo convencional:
////        for (int i = 0; i < matriz.length; i++){
////            for (int j = 0; j < matriz[i].length; j++){
////                System.out.println(matriz[i][j]);
////            }
////        }
////        metodo limpo:
//        for (int[] linha : matriz){
//            for (int elemento : linha){
//                System.out.println(elemento);
//            }
//        }
//    }
//}
