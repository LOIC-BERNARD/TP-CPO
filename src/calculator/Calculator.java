// BERNARD LOIC TP0 EXO CALCULATOR 29/09/21

package calculator;

import java.util.Scanner;



public class Calculator {

  
    public static void main(String[] args) {
        
        
        System.out.println("Please enter the operator: "
                + "\n1) add"
                + "\n2) substract"
                + "\n3) multiply"
                + "\n4) divide"
                + "\n5) modulo");
        
        Scanner sc = new Scanner(System.in);
        
        int operateur;
        operateur=sc.nextInt();
        
        while (operateur<1)  { 
            System.out.println("Erreur, entrez un nouvel entier compris entre 1 et 5");
            operateur=sc.nextInt();

        }
        while (operateur>5){
            System.out.println("Erreur, entrez un nouvel entier compris entre 1 et 5");
            
            operateur=sc.nextInt();
        }

        System.out.println("Entrez un premier entier");
        int operande1;
        operande1=sc.nextInt();

        System.out.println("Entrez un deuxieme entier");
        int operande2 = operateur ;
        operande2=sc.nextInt();



        if (operateur==1){
            int a = operande1 + operande2;
            System.out.println("Le résultat est:" + a);
        }
        if (operateur==2){
            int b = operande1 - operande2;
            System.out.println("Le résultat est:" + b);
        }if (operateur==3){
            int c = operande1 * operande2;
            System.out.println("Le résultat est:" + c);
        }if (operateur==4){
            int d = operande1 / operande2;
            System.out.println("Le résultat est:" + d);
        }if (operateur==5){
            int e = operande1 % operande2;
            System.out.println("Le résultat est:" + e);
            }
        
                
        }
        
        
        
        
        
    }
    

