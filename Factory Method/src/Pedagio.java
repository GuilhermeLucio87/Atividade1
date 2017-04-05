
import javax.swing.JOptionPane;

public class Pedagio {
    @SuppressWarnings("empty-statement")
    public static void main (String [] args){

    int menu;
    float num  ;
        
    Carro carro = new Carro("Gol","BWMX");
    
    Onibus onibus = new Onibus ("Audace","PSQZ");
    
    Caminhao caminhao = new Caminhao ("Mercedes-Benz","VRTK");
    
    
    do{
          menu = Integer.parseInt(JOptionPane.showInputDialog("\n Pedágio: \n\n1 - Valor tarifa Carro \n2 -Pagar Carro \n3 -Valor tarifa  Onibus  \n4 -Pagar Onibus \n5 -Valor tarifa Caminhão \n6 -Pagar Caminhão \n7 -Sair"));
          
          switch(menu){
              case 1:
           num = Integer.parseInt(JOptionPane.showInputDialog ("Insira o numero de passageiros"));
             
              if ((num == 0)){
                 carro.tarifa();
                  
              }else if ((num == 1)){
                  carro.tarifa(1);
             }else if ((num == 2)){
                  carro.tarifa(2);
             
             }else if ((num ==3)){
                  carro.tarifa(3);
             
             }else if ((num == 4)){
                  carro.tarifa(4);
             }else {
             JOptionPane.showMessageDialog(null, "Limite de Passageiros e 4 , Tente Novamente!");
             }     
              
              break;
              case 2:
              carro.Pagar();    
              carro.Aprovar();
              break;
              
              case 3:
              onibus.tarifa();
              break;
              case 4:    
              onibus.Pagar();
              onibus.Aprovar();
              break;
              
              case 5:
              caminhao.tarifa();
              caminhao.exibirDados();
              break;
              case 6:
              caminhao.Pagar();
              caminhao.Aprovar();  
              break; 
              
              case 7:
              System.exit(0);  
              
              default:
                  JOptionPane.showMessageDialog(null, "O número digitado não existe. Tente novamente!");
                   System.exit(0);
                   
          }//Fim do menu
     
    }while(menu!=5);

    }//Fim do main

}//Fim Pedagio
    
    
    
    
    
    
    
    
    
    
    
    
    
  
