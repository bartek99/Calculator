public class Mnozenie extends Operacje {
    Obliczenie2Argumentowe iloczyn=(Double a, Double b) -> a*b;
    @Override
    protected double dzialanie(double a) {
        return 0;
    }

    @Override
    protected double dzialanie(double a, double b) {
        return iloczyn.calculate(a,b);
    }

    @Override
    protected String przeksztalcenieNaONP(Stos stos, String wynik, String rownanie, int i) {
        while (stos.size() > 0 && !stos.podgladanie().equals("(")
                && !stos.podgladanie().equals("+")
                && !stos.podgladanie().equals("-")) {
            try {
                wynik = wynik + stos.usun() + " ";
            }catch (Exception e){
                System.out.println("Stos pusty");
            }
        }
        String str = "" + rownanie.charAt(i);
        stos.dodaj(str);
        return wynik;
    }
}
