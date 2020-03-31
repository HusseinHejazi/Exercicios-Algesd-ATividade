import javax.swing.*;

   public class Exercicio2
   {
      public static int buscaLinear(int vet[], int proc)
      {
         for(int i=0; i<vet.length;i++)
         {
            if(vet[i] == proc)
               return i;
        
            else if(vet[i] > proc)
               return -1;
           }
           return -1;
      }
  
      public static void main(String args[])
      {
         int x[]={-5, 0, 1, 2, 3, 4, 5, 8, 9};
     
         int proc = Integer.parseInt(JOptionPane.showInputDialog("Qual o número procurado?"));
         int resp = buscaLinear(x, proc);
     
         if(resp == -1)
            JOptionPane.showMessageDialog(null, "Não existe no vetor");
         else
            JOptionPane.showMessageDialog(null, "Está no índice " + resp);
      }
   }

