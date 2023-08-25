public class Aluno {
    String nome, matricula, curso;

    Aluno() {

    }

    Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    void cadastrarAluno(String nome, String curso, String matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        System.out.println("Você foi cadastrado para o evento.");

    }

}
