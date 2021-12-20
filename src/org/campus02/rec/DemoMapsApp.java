package org.campus02.rec;

public class DemoMapsApp {

    public static void main(String[] args) {

        Ort graz = new Ort("Graz");
        Ort wien = new Ort("Wien");
        Ort marburg = new Ort("Marburg");
        Ort linz = new Ort("Linz");

        graz.addNachbar(marburg);
        graz.addNachbar(wien);
        wien.addNachbar(linz);
        wien.addNachbar(graz);
        linz.addNachbar(graz);
        linz.addNachbar(wien);
        marburg.addNachbar(graz);

        System.out.println("hasCircle(graz) = " + hasCircle(graz));
    }

    public static boolean hasCircle(Ort o){
        return hasCircle(o, o, null);
    }

    public static boolean hasCircle(Ort start, Ort current, Ort previous){

        for (Ort n : current.getNachbarn()){
            if (n == previous){
                return false;
            }

            if (n == start){
                return true;
            }
            else{
                boolean result = hasCircle(start, n, current);
                if(result)
                    return true;
            }
        }
        return false;
    }

}
