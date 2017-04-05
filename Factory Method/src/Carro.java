
import javax.swing.JOptionPane;

public class Carro extends Veiculo implements Pagamento {
    float saldo , tarifa ;
    boolean ligado;
    
    
    
    public Carro(String modelo, String placa) {
        super(modelo, placa);
    }
    
    //Sobre Carga
    public void tarifa(){
       JOptionPane.showMessageDialog(null,"Carro custa R$ 2.00");
    }
    
    public void tarifa(int qtdePessoa){
    double valor = qtdePessoa*0.25+2;
    JOptionPane.showMessageDialog(null,"Carro custa : R$" + valor);
    } 
        
   

  @Override
    public void Pagar() {
    
    saldo = Integer.parseInt(JOptionPane.showInputDialog ("Insira o valor"));
    
    if ((saldo >= 2)){
        
        saldo = saldo - tarifa;
      
        
        JOptionPane.showMessageDialog(null,"Pedagio Pago");
        
    }else{
        
       JOptionPane.showMessageDialog(null, "Valor Insuficiente!");
        System.exit(0);
        
    }}

    @Override
    public void Aprovar() {
    ligado= true;
    JOptionPane.showMessageDialog(null, "Catraca Liberada!");
    
    }//Fim do Aprovar   

}//Fim do classe



