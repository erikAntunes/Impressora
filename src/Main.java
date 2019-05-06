import javax.print.Doc;

public class Main {

    public static void main(String[] args) {


        Contrato contrato1 = new Contrato();
        contrato1.setNome("Contrato de Aluguel");
        contrato1.setTipo(".docx");

        Foto foto1 = new Foto();
        foto1.setNome("Perfil");
        foto1.setTipo(".png");

        Documento documento1 = new Documento();
        documento1.setNome("RG");
        documento1.setTipo(".pdf");

        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato1);
        impressora.adicionarImprimivel(foto1);
        impressora.adicionarImprimivel(documento1);
        impressora.imprimirTudo();

    }
}
