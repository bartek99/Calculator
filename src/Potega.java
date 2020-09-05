public class Potega extends Operacje {
    Obliczenie2Argumentowe potega=(Double a, Double b) -> Math.pow(a,b);
    @Override
    protected double dzialanie(double a) {
        return 0;
    }

    @Override
    protected double dzialanie(double a, double b) {
        return potega.calculate(a,b);
    }

    @Override
    protected String przeksztalcenieNaONP(Stos stos, String wynik, String rownanie, int i) {

        while (stos.size() > 0 && (stos.podgladanie().equals("^")
                || stos.podgladanie().equals("\u221A")
                || stos.podgladanie().equals("!")
                || stos.podgladanie().equals("n"))) {
            try {
                wynik = wynik + stos.usun() + " ";
            }catch (Exception e){
                System.out.println("Stos pusty");
            };
        }
        String str = "" + rownanie.charAt(i);
        stos.dodaj(str);
        return wynik;
    }
}
