import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
      System.out.println("Bienvenid@ a Gabo el leedor de mentes. Piensa en una mascota que yo la intentare adivinar");
      System.out.println("Tu mascota es Ovipara? (S/N)");
    Scanner first = new Scanner(System.in);
    String answer1 = first.nextLine();
      if (answer1.equals("S") || answer1.equals("s"))
      {
        System.out.println("Tu mascota vuela? (S/N)");
        Scanner secund = new Scanner(System.in);
        String answer2 = secund.nextLine();
        if (answer2.equals("S") || answer2.equals("s"))
        {
          System.out.println("Tu mascota es un Pajaro");
        }
        else 
        {
        System.out.println("Tu mascota es una Tortuga");
        }
      }
      else 
      {
      System.out.println("Tu mascota camina en 4 patas? (S/N)");
      Scanner third = new Scanner(System.in);
      String answer3 = third.nextLine();
      if (answer3.equals("S") || answer3.equals("s"))
        {
        int numero = (int) Math.random() * 2;
          if (numero == 1)
        System.out.println("Tu mascota es un Perro");
          else 
            System.out.println("Tu mascota es un Gato");
        }
      else
        {
        System.out.println("Tu mascota es un amfibio? (S/N)");
    Scanner fourth = new Scanner(System.in);
    String answer4 = fourth.nextLine();
          if (answer4.equals("S") || answer4.equals("s"))
          {
            System.out.println("Tu mascota es una Serpiente");
          }
          else 
          {
            System.out.println("Tu mascota es un Dinoraurio");
          }
        }
      }
   
    }
}