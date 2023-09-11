public abstract class Pessoa {
    protected String nomeCompleto;
    protected String endereco;
    protected String telefone;
    protected String email;
    protected String cpf;

    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCpf(){
        return this.cpf;
    }
}
