// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj program ktory chcesz uzyc: (1-4)");
    System.out.println("1-Suma");
    System.out.println("2- Roznica");
    System.out.println("3- Iloczyn");
    System.out.println("4- Iloraz");
    int program = scanner.nextInt();
    switch(program)
      {
        case 1:
          System.out.println("Podaj pierwsza liczbe ");
          double Liczba_1 = scanner.nextInt();

          System.out.println("Podaj druga liczbe ");
          double Liczba_2 = scanner.nextInt();

          System.out.println("Suma liczb podanych przez uzytkownika: ");
          System.out.println(Liczba_1+Liczba_2);
          break;
        case 2:
          System.out.println("Podaj pierwsza liczbe ");
          double Liczba_1_roznica = scanner.nextInt();

          System.out.println("Podaj druga liczbe ");
          double Liczba_2_roznica = scanner.nextInt();

          System.out.println("Roznica liczb podanych przez uzytkownika: ");
          System.out.println(Liczba_1_roznica-Liczba_2_roznica);
          break;
        case 3:
          System.out.println("Podaj pierwsza liczbe ");
          double Liczba_1_iloczyn = scanner.nextInt();

          System.out.println("Podaj druga liczbe ");
          double Liczba_2_iloczyn = scanner.nextInt();
          System.out.println("Iloczyn liczb podanych przez uzytkownika: ");
          System.out.println(Liczba_1_iloczyn*Liczba_2_iloczyn);
          break;
          
        case 4:
          System.out.println("Podaj pierwsza liczbe ");
          double Liczba_1_iloraz = scanner.nextInt();

          System.out.println("Podaj druga liczbe ");
          double Liczba_2_iloraz = scanner.nextInt();
          if(Liczba_2_iloraz==0)
          {
            System.out.println("Nie mozna dzielic przez 0.");
            break;
          }
          System.out.println("Iloraz liczb podanych przez uzytkownika: ");
          System.out.println(Liczba_1_iloraz/Liczba_2_iloraz);
          break;

        default:
           System.out.println("Nie podano programu, zakonczono dzialanie programu");
          break;
      }
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}