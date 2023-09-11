public class Aluno extends Pessoa{
    private double[] notas;
    private Curso[] cursos;

    private Aluno(String nomeCompleto, String endereco, String telefone, String email, String cpf){
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }
    public static class BuilderAluno{
        protected String nomeCompleto;
        protected String endereco;
        protected String telefone;
        protected String email;
        protected String cpf;

        public BuilderAluno setNomeCompleto(String nomeCompleto) {
            this.nomeCompleto = nomeCompleto;
            return this;
        }

        public BuilderAluno setEndereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public BuilderAluno setTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public BuilderAluno setEmail(String email) {
            this.email = email;
            return this;
        }

        public BuilderAluno setCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }
        public Aluno build(){
            return new Aluno(nomeCompleto, endereco, telefone, email, cpf);
        }
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public String verificarNotas(){
        String n = "";
        for(double nota: notas){
            n += "Nota: "+nota+"\n";
        }
        return n;
    }
    public void entrarNoCurso(Curso[] cursos){
        this.cursos = cursos;
    }
    public String[] verificarCursos(){
        String[] c = new String[cursos.length];
        for(int i=0; i< cursos.length;i++){
            c[i] = cursos[i].getNomeDoCurso();
        }
        return c;
    }
}
