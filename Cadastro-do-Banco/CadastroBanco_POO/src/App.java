public class App {
    public static void main(String[] args) {
        TelaCadastro tela = new TelaCadastro();
        new CadastroController(tela);
        tela.setVisible(true);
    }
}
