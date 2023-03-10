package calcule;

public class Calcule {
    float result;

    //method pentru adunare
    public static float adunare(float num1, float num2) {
        return  num1 + num2;
        //return result;
        //lalalala
    }

    //method pentru scadere
    public float scadere(float num1, float num2) {
        result = num1 - num2;
        return result;
    }

    //method pentru inmultire
    public float inmultire(float num1, float num2) {
        result = num1 * num2;
        return result;
    }

    //mothod pentru impartire
    public float impartire(float num1, float num2) {
        result = num1 / num2;
        return result;
    }
}