import javax.swing.JOptionPane;

public class CadastroController {
    private final TelaCadastro view;
    private Cliente clienteAtual;

    public CadastroController(TelaCadastro view) {
        this.view = view;
        this.view.getJbAtualizar().addActionListener(e -> executarAcaoAtualizar());
        this.view.getJbConsultar().addActionListener(e -> executarAcaoConsultar());
        this.view.getJbFechar().addActionListener(e -> System.exit(0));
    }

    private void executarAcaoConsultar() {
        System.out.println("Botão CONSULTAR foi pressionado.");
        clienteAtual = new Cliente();
        clienteAtual.setNome("Pedro Coltro");
        clienteAtual.setEndereco("Avenida Orosimbo Maia");
        clienteAtual.setTelefone("199952573813");
        clienteAtual.setCpf("123.456.789-00");

        view.getJtfNome().setText(clienteAtual.getNome());
        view.getJtfEndereco().setText(clienteAtual.getEndereco());
        view.getJtfTelefone().setText(clienteAtual.getTelefone());
        view.getJtfCpf().setText(clienteAtual.getCpf());

        view.getJbAtualizar().setEnabled(true);
        view.getJbAtualizar().setText("Salvar Edição");
    }

    private void executarAcaoAtualizar() {
        if (clienteAtual != null) {
            clienteAtual.setNome(view.getJtfNome().getText());
            clienteAtual.setEndereco(view.getJtfEndereco().getText());
            clienteAtual.setTelefone(view.getJtfTelefone().getText());

            clienteAtual.editar();
            JOptionPane.showMessageDialog(view, "Cliente editado com sucesso!");
        } else {
            System.out.println("Iniciando gravação de novo cliente...");

            Cliente novoCliente = new Cliente();
            novoCliente.setNome(view.getJtfNome().getText());
            novoCliente.setEndereco(view.getJtfEndereco().getText());
            novoCliente.setTelefone(view.getJtfTelefone().getText());
            novoCliente.setCpf(view.getJtfCpf().getText());

            Conta novaConta;
            if (view.getJrbCorrente().isSelected()) {
                novaConta = new ContaCorrente();
            } else {
                novaConta = new ContaPoupanca();
            }

            novaConta.setAgencia(view.getJtfAgencia().getText());
            novaConta.setNumero(view.getJtfConta().getText());
            novaConta.setTitular(novoCliente);
            novaConta.gravar();

            JOptionPane.showMessageDialog(view, "Novo cliente gravado com sucesso!");
        }
    }
}
