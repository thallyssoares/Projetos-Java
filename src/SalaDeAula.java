import java.util.Arrays;


public class SalaDeAula {
    private Aluno[] aluno;
    private Professor professor;
    private Curso[] cursos;
    private int numMaximoDeAlunos;

    private SalaDeAula(Aluno[] aluno, Professor professor,Curso[] cursos,int numMaximoDeAlunos){
        this.aluno = aluno;
        this.professor = professor;
        this.numMaximoDeAlunos = numMaximoDeAlunos;
        this.cursos = cursos;
    }
    public static class BuilderSalaDeAula{
        private Aluno[] aluno;
        private Professor professor;
        private Curso[] cursos;
        private int numMaximoDeAlunos;
        public BuilderSalaDeAula setAluno(Aluno[] aluno){
            this.aluno = aluno;
            return this;
        }
        public BuilderSalaDeAula setProfessor(Professor professor){
            this.professor = professor;
            return this;
        }
        public BuilderSalaDeAula setNumMaximoDeAlunos(int numMaximoDeAlunos){
            this.numMaximoDeAlunos = numMaximoDeAlunos;
            return this;
        }
        public BuilderSalaDeAula setCursos(Curso[] cursos){
            this.cursos = cursos;
            return this;
        }
        public SalaDeAula build(){
            return new SalaDeAula(aluno, professor, cursos,numMaximoDeAlunos);
        }
    }

    public String getAluno() {
        String a = "";
        for (Aluno nomeAluno : aluno){
            a += nomeAluno.getNomeCompleto()+", ";
        }
        return a;

    }

    private void verificarCursosAlunos() {
        for(int i=0; i<cursos.length;i++){
            for(int j=0;j<aluno.length;j++){
                if(Arrays.asList(aluno[j].verificarCursos()).contains(cursos[i].getNomeDoCurso())){
                    System.out.println("Alunos do curso "+cursos[i].getNomeDoCurso()+"\n"+aluno[j].getNomeCompleto());
                }
            }

        }

    }
    public int getNumMaximoDeAlunos() {
        return this.numMaximoDeAlunos;
    }

    public void mostrarCursos(){
        verificarCursosAlunos();
    }

    public String toString() {
        return "SalaDeAula{" +
                ", professor=" + professor +
                ", cursos=" + Arrays.toString(cursos) +
                ", numMaximoDeAlunos=" + numMaximoDeAlunos +
                '}';
    }
}
