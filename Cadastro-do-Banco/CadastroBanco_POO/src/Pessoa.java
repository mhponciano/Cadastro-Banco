public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public void gravar() {
        System.out.println("Salvando dados de Pessoa: " + this.nome);
    }
    public void editar() {
        System.out.println("Editando dados de Pessoa: " + this.nome);
    }
    public void excluir() {
        System.out.println("Excluindo Pessoa: " + this.nome);
    }
    public void cancelar() {
        System.out.println("Operação cancelada para Pessoa: " + this.nome);
    }
}
