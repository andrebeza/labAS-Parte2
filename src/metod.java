import java.util.ArrayList;

public class metod {
    private static ArrayList<read> listaNome = new ArrayList<>();

    public static ArrayList<read> getListaNome() {
        return listaNome;
    }

    static public void adicionar(read y){
        listaNome.add(y);
    }

    static public String list(){
        String exit = "";
        int x = 1;
        for (read y : listaNome){
            exit = "\n----- Aluno:"+ (x++) +"-----\n";
            exit += y.imprimir();
        }
        return exit;
    }

    static public boolean remove(String nome){
        for (read y : listaNome){
            if (y.getAluno().equalsIgnoreCase(nome)){
                listaNome.remove(y);
                return true;
            }
        }
        return false;
    }
}
