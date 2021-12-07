public class read {
    private String aluno;

    public read() {}

    public read(String aluno) {
        this.aluno = aluno;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String imprimir(){
        return "Nome:" + aluno;
    }
}
