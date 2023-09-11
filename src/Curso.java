public class Curso {
    private String nomeDoCurso;
    private int duracao;
    private int numDeAulas;
    private Professor professor;

    private Curso(String nomeDoCurso, int duracao, int numDeAulas, Professor professor){
        this.nomeDoCurso = nomeDoCurso;
        this.duracao = duracao;
        this.numDeAulas = numDeAulas;
        this.professor = professor;
    }

    public static class BuilderCurso{
        private String nomeDoCurso;
        private int duracao;
        private int numDeAulas;
        private Professor professor;

        public BuilderCurso setNomeDoCurso(String nomeDoCurso){
            this.nomeDoCurso = nomeDoCurso;
            return this;
        }
        public BuilderCurso setDuracao(int duracao){
            this.duracao = duracao;
            return this;
        }
        public BuilderCurso setNumDeAulas(int numDeAulas){
            this.numDeAulas = numDeAulas;
            return this;
        }
        public BuilderCurso setProfessor(Professor professor){
            this.professor = professor;
            return this;
        }

        public Curso build(){
            return new Curso(nomeDoCurso, duracao, numDeAulas, professor);
        }

    }

    public String getNomeDoCurso() {
        return this.nomeDoCurso;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public int getNumDeAulas() {
        return this.numDeAulas;
    }

    public String getProfessorNome() {
        return this.professor.getNomeCompleto();
    }

    public String toString() {
        return "Curso{" +
                "nomeDoCurso='" + this.nomeDoCurso + '\'' +
                ", duracao=" + this.duracao+"H" +
                ", numDeAulas=" + this.numDeAulas +
                ", professor=" + this.professor.getNomeCompleto() +
                '}';
    }
}
