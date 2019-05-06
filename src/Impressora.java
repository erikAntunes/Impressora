import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> ListaImprimivel = new ArrayList<>();

    public void adicionarImprimivel (Imprimivel umImprimivel){

        ListaImprimivel.add(umImprimivel);
    }

    public void imprimirTudo(){
        for (Imprimivel umImprimivel : ListaImprimivel){
            umImprimivel.imprimir();
            System.out.println("________________________");
        }
    }
}
