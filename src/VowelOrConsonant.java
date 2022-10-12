import java.util.Scanner;//Importing java.util package

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        //character local variable ch
        char ch;

        //creating object of Scanner class for use input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet to find if it is Vowel or Consonant");
        ch = scanner.next().charAt(0);

        //Statement to make sure character is alpabet only
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            //checking vowel or consonants
            switch(ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");

            }

        }
          else
          {
              System.out.println("Please enter Alphabet");
          }


    }
}
