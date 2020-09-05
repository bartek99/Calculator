public class Dzielenie extends Operacje{
    @Override
    protected double dzialanie(double a) {
        return 0;
    }

    @Override
    protected double dzialanie(double a, double b) throws IllegalArgumentException {
        if(b==0){
            throw new IllegalArgumentException("Nie mozna podzielic przez 0");
        }else {
            return a/b;
        }
    }

    @Override
    protected String przeksztalcenieNaONP(Stos stos, String wynik, String rownanie, int i) {
        while (stos.size() > 0 && !stos.podgladanie().equals("(")
                && !stos.podgladanie().equals("+")
                && !stos.podgladanie().equals("-")) {
            try {
                wynik = wynik + stos.usun() + " ";
            }catch (Exception e){
                return "Stos pusty";
            };
        }
        String str = "" + rownanie.charAt(i);
        stos.dodaj(str);
        return wynik;
    }
}
