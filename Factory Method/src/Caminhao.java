
import javax.swing.JOptionPane;

public class Caminhao  extends Veiculo implements Pagamento {
     
    float saldo , tarifa ;
    boolean ligado;
    
    
    public Caminhao(String modelo, String placa) {
        super(modelo, placa);
    }//Fim Construtor
    
    // Sobre Escrita //
    public void exibirDados(){
       JOptionPane.showMessageDialog(null,"==== Caminhão ====");
        super.exibirVeiculo();
    
    }
    
     public void tarifa(){
         tarifa = tarifa + 10;
         JOptionPane.showMessageDialog(null,"Caminha custa R$ 10.00");
    }

    @Override
    public void Pagar() {
    
    saldo = Integer.parseInt(JOptionPane.showInputDialog ("Insira o valor"));
    
    if ((saldo >= 10)){
        
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

}//Fim da Classe