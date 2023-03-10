package calcule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("primul numar");
        float firstNumber = scan.nextFloat();

        System.out.println("al doilea numar");
        float secondNumber = scan.nextFloat();

        //set the values in VO
        VO calVo = new VO();
        calVo.setFirstNumber(firstNumber);
        calVo.setSecondNumber(secondNumber);

        Calcule calcul = new Calcule();

        float rezultatAdunare = calcul.adunare(calVo.getFirstNumber(), calVo.getSecondNumber());
        System.out.println("rezultatul adunarii este " + rezultatAdunare);

        float rezultatScadere = calcul.scadere(calVo.getFirstNumber(), calVo.getSecondNumber());
        System.out.println("rezultatul scaderii este " + rezultatScadere);

        float rezultatInmultire = calcul.inmultire(calVo.getFirstNumber(), calVo.getSecondNumber());
        System.out.println("rezultatul inmultirii este " + rezultatInmultire);

        float rezultatImpartire = calcul.impartire(calVo.getFirstNumber(), calVo.getSecondNumber());
        System.out.println("rezultatul impartirii este " + rezultatImpartire);
    }
}
//ok what now 2
//what now 3


