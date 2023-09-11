public class Professor extends Pessoa{
    private Curso cursoMinistrado;
    private double salario;

    private Professor(String nomeCompleto, String endereco, String telefone, String email, String cpf, double salario){
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.salario = salario;
    }

    public static class BuilderProfessor{
        protected String nomeCompleto;
        protected String endereco;
        protected String telefone;
        protected String email;
        protected String cpf;
        protected double salario;

        public BuilderProfessor setNomeCompleto(String nomeCompleto){
            this.nomeCompleto = nomeCompleto;
            return this;
        }
        public BuilderProfessor setEndereco(String endereco){
            this.endereco = endereco;
            return this;
        }
        public BuilderProfessor setTelefone(String telefone){
            this.telefone = telefone;
            return this;
        }
        public BuilderProfessor setEmail(String email){
            this.email = email;
            return this;
        }
        public BuilderProfessor setCpf(String cpf){
            this.cpf = cpf;
            return this;
        }
        public BuilderProfessor setSalario(double salario){
            this.salario = salario;
            return this;
        }
        public Professor build(){
            return new Professor(nomeCompleto, endereco, telefone, email, cpf, salario);
        }
    }


    public Curso getCursoMinistrado() {
        return this.cursoMinistrado;
    }
    public void setCurso(Curso curso){
        this.cursoMinistrado = curso;
    }

    public double getSalario() {
        return this.salario;
    }

    public void darNotas(Aluno aluno, double[] notas){
        aluno.setNotas(notas);
    }


}
