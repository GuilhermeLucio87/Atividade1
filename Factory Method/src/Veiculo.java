
import javax.swing.JOptionPane;


public class Veiculo {
    private String modelo;
    private String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }
    
  public void exibirVeiculo(){
  JOptionPane.showMessageDialog(null,"\nPlaca: " + placa );
  JOptionPane.showMessageDialog(null,"\nModelo: " + modelo);
  }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}//Fim da classe veiculo
