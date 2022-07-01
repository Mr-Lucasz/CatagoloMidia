import java.util.ArrayList;

public class Detran
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String estado;
    private ArrayList<Veiculo> veiculos;

    public Detran(String estado){
        this.estado = estado;
        this.veiculos = new ArrayList<Veiculo>();
    }

    public void addVeiculo(Veiculo umVeiculo){
        this.veiculos.add(umVeiculo);
    }

    public String toString(){
        String texto = "Estado: "+this.estado+"\n";
        texto += "Veiculos: \n";
        for(Veiculo vei: veiculos){
            vei.toString();
        }

        return texto;
    }
}
