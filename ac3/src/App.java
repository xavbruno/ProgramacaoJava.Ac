public class App {
    public static void main(String[] args) throws Exception {
        Evento ev1, ev2;
        Aluno aluno1;
        Palestrante palestrante1;

        ev1 = new Evento();
        ev1.nome = "Palestra de Direito";
        ev1.data = "22/09/2023";
        ev1.local = "Auditório Ibmec Barra";
        ev1.maxParticipantes = 90;

        ev2 = new Evento();
        ev2 = new Evento();
        ev2.nome = "Campeonato de FIFA";
        ev2.data = "04/10/2023";
        ev2.local = "Sala Premium 210";
        ev2.maxParticipantes = 20;

        aluno1 = new Aluno();
        aluno1.nome = "Bruno";
        aluno1.matricula = "202203351711";
        aluno1.curso = "CDD";

        palestrante1 = new Palestrante();
        palestrante1.nome = "Professor Carlos Eduardo";
        palestrante1.formacao = "Doutorado em Direito";
        palestrante1.idade = 47;

        System.out.println("EVENTO");
        System.out.println();
        System.out.println(ev1.nome + " - " + ev1.data);
        System.out.println("Convidado: " + palestrante1.nome);
        System.out.println("Local: " + ev1.local);
        System.out.println("Máximo de Participantes: " + ev1.maxParticipantes);

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("EVENTO");
        System.out.println();
        System.out.println(ev2.nome + " - " + ev2.data);
        System.out.println("Local: " + ev2.local);
        System.out.println("Máximo de Participantes: " + ev2.maxParticipantes);

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("Cadastro de aluno");
        System.out.println();
        System.out.println(aluno1.nome);
        System.out.println(aluno1.curso);
        System.out.println(aluno1.matricula);
        System.out.println(ev2.nome);
        aluno1.cadastrarAluno(aluno1.nome, aluno1.curso, aluno1.matricula);

    }
}
