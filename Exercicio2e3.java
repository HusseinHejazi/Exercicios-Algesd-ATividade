import javax.swing.*;
   public class Exercicio2e3
   {      
        //2) O que acontece quando tento fazer busca bin�ria em um vetor N�O ordenado?
        //O programa ir� executar da mesma forma, s� que ele ira ter que ordenar antes de executar o processo, formando um resultado mais lento do que uma ordenado.           
    
       //3) Como voc� implementaria busca bin�ria num vetor de Strings?
      public static int buscaBinaria (String vet[], String proc)
      {
         int inicio = 0;
         int fim = vet.length - 1;
             
         while(inicio <= fim)
         {
            int meio = (inicio + fim) / 2;
                
            if(vet[meio].compareTo(proc) == 0)
               return meio;                          
            else
               if (vet[meio].compareTo(proc) < 0)
                  inicio = meio + 1;
               else
                  fim = meio - 1;
         }
         return -1;
      }
          
       public static void main (String args[])
      {
         String vet[] = {"Hus", "Huss", "Husss", "Hussss", "Husssss"};         
      
         int respBin = buscaBinaria (vet, "Hussss");
         
         if(respBin == -1)
            JOptionPane.showMessageDialog(null, "N�o existe no vetor");
         else
            JOptionPane.showMessageDialog(null, "Hussss est� no �ndice " + respBin);
      }

      }
   