public class Carro extends Veiculo
{
    private int portas;

    public Carro(int portas,String modelo, int ano, String placa, double valor )
    {
        super(modelo, ano, placa, valor);

    }

    public int getPortas(){
        return this.portas;   
    }

    public boolean setportas(int portas){
        if( portas > 2 || portas <=6){
            this.portas = portas;
            return true;

        }else{
            return false;
        }    

    }

    @Override
    public String toString(){
        return super.toString() + "," 
        + "Carro - Portas: "+ portas;
    }

}
