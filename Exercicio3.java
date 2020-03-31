import javax.swing.*;

   public class Exercicio3
   {
      public static int buscaLinear(String vet[], String proc)
      {
         for(int i=0; i<vet.length;i++)
         {
            if(vet[i].compareTo(proc) == 0)
               return i;
        
            else if(vet[i].compareTo(proc) > 0)
               return -1;
           }
           return -1;
      }
  
      public static void main(String args[])
      {
         String x[]={"Hus", "Huss", "Husss", "Hussss", "Husssss"};    
         
         int resp = buscaLinear(x, "Husss");
     
         if(resp == -1)
            JOptionPane.showMessageDialog(null, "Não existe no vetor");
         else
            JOptionPane.showMessageDialog(null, "Husss está no índice " + resp);
      }
   }

