import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        Scanner enterStr = new Scanner(System.in);

        int menu;
        read objRead;

        String aluno;

        do {
            show();
            menu = enter.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.println("\n---Informe o nome do aluno(a).---\n");
                    aluno = enterStr.nextLine();
                    objRead = new read(aluno);
                    metod.adicionar(objRead);
                }
                case 2 -> {
                    System.out.println("\n---Lista de alunos, classifacada por nome cadastrado.---\n");
                    System.out.println(metod.list());
                }
                case 3 -> {
                    System.out.println("\n---Método para exclusão do nome.\n---");
                    System.out.println("Qual aluno(a) deseja remover?");
                    aluno = enterStr.nextLine();
                    if (!(metod.getListaNome().isEmpty())) {
                        if (metod.remove(aluno)) {
                            System.out.println("\nAluno(a) " + aluno + " removido(a) com sucesso!");
                        } else {
                            System.out.println("\nAluno(a)" + aluno + "não foi encontrado(a) no sistema.");
                        }


                    }
                }
            }
        }while(menu != 4);

    }


    static void show(){
        System.out.println("===>Método para remoção/ Parcial AS Labóratorio de programação.<====");
        System.out.println("===Pressione 1 para adicionar aluno(a).===");
        System.out.println("===Pressione 2 para ver a lista de alunos.===");
        System.out.println("===Pressione 3 para remover um aluno(a).===");
    }
}
