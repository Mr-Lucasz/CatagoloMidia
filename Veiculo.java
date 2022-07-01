public class Veiculo
{
    protected String modelo;
    protected int ano;
    protected String placa;
    protected double valor;

    public Veiculo(String modelo, int ano, String placa, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }

    public String getModelo(){
        return this.modelo ;   
    }

    public boolean setModelo(String modelo){
        if( !modelo.isEmpty() ){
            this.modelo = modelo;
            return true;

        }else{
            return false;
        }
    }

    public int getAno(){
        return this.ano;   
    }

    public boolean setAno(int ano){
        if( ano >= 1900){
            this.ano = ano;
            return true;

        }else{
            return false;
        }    

    }

    public String getPlaca(){
        return this.placa ;   
    }

    public boolean setPlaca(String placa){
        if( !placa.isEmpty() ){
            this.placa = placa;
            return true;

        }else{
            return false;
        }
    }

    public double getValor(){
        return this.valor;   
    }

    public boolean setValor(double valor){
        if( valor >= 0){
            this.valor = valor;
            return true;

        }else{
            return false;
        }    

    }

}
