public class ClasseDeTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno.BuilderAluno().setNomeCompleto("Lucas Silva").setEndereco("Rua 1, num 2").setTelefone("85 99888-9900").setEmail("email@email.com").setCpf("988250123").build();
        Aluno aluno2 = new Aluno.BuilderAluno().setNomeCompleto("Pedro Arthur").setEndereco("Rua 2, num 3").setTelefone("85 99544-9921").setEmail("email2@email.com").setCpf("5415214").build();
        Aluno aluno3 = new Aluno.BuilderAluno().setNomeCompleto("Marcos Soares").setEndereco("Rua 3, num 4").setTelefone("85 87411-5454").setEmail("email3@email.com").setCpf("32153661").build();
        Aluno[] alunosCurso1 = {aluno1, aluno3};
        Aluno[] alunosCurso2 =  {aluno1, aluno2};

        Professor professor1 = new Professor.BuilderProfessor().setNomeCompleto("Arthur Alves").setEndereco("Rua 3, num 4").setTelefone("85 99889-3632").setEmail("emailProfessor@email.com").setCpf("97551412211").build();
        Professor professor2 = new Professor.BuilderProfessor().setNomeCompleto("Maicom Douglas").setEndereco("Rua 5, num 7").setTelefone("85 98541-2365").setEmail("emailProfessor2@email.com").setCpf("544874121").build();

        Curso curso1 = new Curso.BuilderCurso().setNomeDoCurso("Curso Java Básico").setDuracao(30).setNumDeAulas(10).setProfessor(professor1).build();
        Curso curso2 = new Curso.BuilderCurso().setNomeDoCurso("Curso Spring Boot").setDuracao(50).setNumDeAulas(15).setProfessor(professor2).build();

        Curso[] cursosAluno1 = {curso1, curso2};
        Curso[] cursosAluno2 = {curso2};
        Curso[] cursosAluno3 = {curso1};

        aluno1.entrarNoCurso(cursosAluno1);
        aluno2.entrarNoCurso(cursosAluno2);
        aluno3.entrarNoCurso(cursosAluno3);

        SalaDeAula salaDeAula1 = new SalaDeAula.BuilderSalaDeAula().setAluno(alunosCurso1).setCursos(cursosAluno1).setProfessor(professor1).setNumMaximoDeAlunos(25).build();
        SalaDeAula salaDeAula2 = new SalaDeAula.BuilderSalaDeAula().setAluno(alunosCurso2).setProfessor(professor2).setNumMaximoDeAlunos(20).build();

        System.out.println("*******************************************************");
        System.out.println(salaDeAula1.toString());
        System.out.println("*******************************************************");
        System.out.println(salaDeAula2.toString());
        System.out.println("*******************************************************");

    }
}
