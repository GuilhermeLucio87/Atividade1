
import javax.swing.JOptionPane;


public class Onibus extends Veiculo implements Pagamento  {
    float saldo , tarifa ;
    boolean ligado;
    
    
    public Onibus(String modelo, String placa) {
        super(modelo, placa);
    }//Fim do construtor 
    
    public void tarifa(){
        tarifa = tarifa + 7;
        JOptionPane.showMessageDialog(null,"Onibus Custa R$ 7.00");
    }

    
    @Override
    public void Pagar() {
    
    saldo = Integer.parseInt(JOptionPane.showInputDialog ("Insira o valor"));
    
    if ((saldo >= 7)){
        
        saldo = saldo - tarifa;
      
        
        JOptionPane.showMessageDialog(null,"Pedagio Pago");
        
    }else{
        
       JOptionPane.showMessageDialog(null, "Valor Insuficiente!");
        System.exit(0);
        
    }//Fim do if
    
    }//Fim da interface

    @Override
    public void Aprovar() {
    ligado= true;
    JOptionPane.showMessageDialog(null, "Catraca Liberada!");
    }   

    
    
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}//Fim da classe