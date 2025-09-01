import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {
    private JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf;
    private JTextField jtfAgencia, jtfConta, jtfNome, jtfEndereco, jtfTelefone, jtfCpf;
    private JSeparator jSeparator01, jSeparator02;
    private JRadioButton jrbCorrente, jrbPoupanca;
    private ButtonGroup bgContas;
    private JButton jbConsultar, jbAtualizar, jbFechar;

    public TelaCadastro() {
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        centralizar();

        adicionarLabel("Código da Agência", 10, 10, 110, 18);
        jtfAgencia = adicionarTextField(125, 10, 50, 20);

        adicionarLabel("Número da Conta", 205, 10, 105, 18);
        jtfConta = adicionarTextField(315, 10, 60, 20);

        jSeparator01 = adicionarSeparador(10, 40, 365, 10);

        jlNome = adicionarLabelDireita("Nome:", 10, 50, 60, 18);
        jtfNome = adicionarTextField(75, 50, 300, 20);

        jlEndereco = adicionarLabelDireita("Endereço:", 10, 75, 60, 18);
        jtfEndereco = adicionarTextField(75, 75, 300, 20);

        jlTelefone = adicionarLabelDireita("Telefone:", 10, 100, 60, 18);
        jtfTelefone = adicionarTextField(75, 100, 300, 20);

        jlCpf = adicionarLabelDireita("CPF:", 10, 125, 60, 18);
        jtfCpf = adicionarTextField(75, 125, 300, 20);

        jrbCorrente = adicionarRadioButton("Conta Corrente", 100, 150, 111, 20, 'C', true);
        jrbPoupanca = adicionarRadioButton("Conta Poupança", 225, 150, 118, 20, 'P', false);

        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        jSeparator02 = adicionarSeparador(10, 180, 365, 10);

        jbConsultar = adicionarBotao("Consultar", 35, 190, 100, 23, 'S', true);
        jbAtualizar = adicionarBotao("Atualizar", 145, 190, 100, 23, 'A', false);
        jbFechar = adicionarBotao("Fechar", 255, 190, 100, 23, 'F', true);
    }

    // métodos auxiliares
    private JLabel adicionarLabel(String texto, int x, int y, int largura, int altura) {
        JLabel label = new JLabel(texto);
        label.setBounds(x, y, largura, altura);
        getContentPane().add(label);
        return label;
    }

    private JLabel adicionarLabelDireita(String texto, int x, int y, int largura, int altura) {
        JLabel label = adicionarLabel(texto, x, y, largura, altura);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        return label;
    }

    private JTextField adicionarTextField(int x, int y, int largura, int altura) {
        JTextField campo = new JTextField();
        campo.setBounds(x, y, largura, altura);
        getContentPane().add(campo);
        return campo;
    }

    private JSeparator adicionarSeparador(int x, int y, int largura, int altura) {
        JSeparator sep = new JSeparator();
        sep.setBounds(x, y, largura, altura);
        getContentPane().add(sep);
        return sep;
    }

    private JRadioButton adicionarRadioButton(String texto, int x, int y, int largura, int altura, char tecla, boolean selecionado) {
        JRadioButton rb = new JRadioButton(texto);
        rb.setBounds(x, y, largura, altura);
        rb.setMnemonic(tecla);
        rb.setSelected(selecionado);
        getContentPane().add(rb);
        return rb;
    }

    private JButton adicionarBotao(String texto, int x, int y, int largura, int altura, char tecla, boolean habilitado) {
        JButton botao = new JButton(texto);
        botao.setBounds(x, y, largura, altura);
        botao.setMnemonic(tecla);
        botao.setEnabled(habilitado);
        getContentPane().add(botao);
        return botao;
    }

    private void centralizar() {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        setLocation((tela.width - janela.width) / 2, (tela.height - janela.height) / 2);
    }

    // getters
    public JTextField getJtfAgencia() { return jtfAgencia; }
    public JTextField getJtfConta() { return jtfConta; }
    public JTextField getJtfNome() { return jtfNome; }
    public JTextField getJtfEndereco() { return jtfEndereco; }
    public JTextField getJtfTelefone() { return jtfTelefone; }
    public JTextField getJtfCpf() { return jtfCpf; }
    public JRadioButton getJrbCorrente() { return jrbCorrente; }
    public JButton getJbConsultar() { return jbConsultar; }
    public JButton getJbAtualizar() { return jbAtualizar; }
    public JButton getJbFechar() { return jbFechar; }
}
