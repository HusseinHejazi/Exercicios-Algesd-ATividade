import javax.swing.*;
   public class Exercicio4
   {
    public static int buscaLinearModificada (int vet[], int procurado)
      {
          int cont = 1;
      
         for(int i = 0; i < vet.length; i++)
         {
            if(vet[i] == procurado)
               return cont;
            
            cont++;           
         }
         return -1;
      }   
          
       public static int buscaBinariaModificada (int vet[], int procurado)
      {
          int cont = 1;
         int inicio = 0;
         int fim = vet.length - 1;
             
         while(inicio <= fim)
         {
            int meio = (inicio + fim) / 2;
                
            if(vet[meio] == procurado)
               return cont;                    
            else
               if (vet[meio] < procurado)
                  inicio = meio + 1;
               else
                  fim = meio - 1;
            
             cont++;
         }
         return -1;
      }
          
       public static void main (String args[])
      {
         int vet[] = new int[1000];
         
         for(int i=0; i<1000; i++) vet[i] = i;
         
         int passosLinear = 0, passosBinaria = 0;
         
         for(int i=0; i < 2000; i++)
         {
              int aleatorio = (int) (Math.random()*1000);
         
              passosLinear = passosLinear + buscaLinearModificada(vet, aleatorio);
              passosBinaria = passosBinaria + buscaBinariaModificada(vet, aleatorio);
         }
         int passosLinearbaixo = passosLinear - passosLinear + 1;
         int passosLinearalto = passosLinear / 2000;
         int passosBinariabaixo = passosBinaria - passosBinaria + 1;
         int passosBinariaalto = passosBinaria / 2000;
              
         System.out.println ("Quantidade de passos da Busca Linear minimo: " + passosLinearbaixo);
         System.out.println ("Quantidade de passos da Busca Binária minimo: " + passosBinariabaixo);
         System.out.println ("Quantidade de passos da Busca Linear alto: " + passosLinearalto);
         System.out.println ("Quantidade de passos da Busca Binária alto: " + passosBinariaalto);
      }
   }
      