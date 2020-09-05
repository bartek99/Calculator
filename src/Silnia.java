public class Silnia extends Operacje {

    @Override
    protected double dzialanie(double a) {
        if(a<0) {
            throw new IllegalArgumentException("Nie ma silni z liczby ujemnej");
        }else if(Math.floor(a)!=a){
            throw new IllegalArgumentException("Nie ma silni z liczby po przecinku");
        }
        else {
            if (a == 0 || a == 1) {
                return 1;
            } else {
                return a * dzialanie(a - 1);
            }
        }
    }

    @Override
    protected double dzialanie(double a, double b) {
        return 0;
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
            }
        }
        String str = "" + rownanie.charAt(i);
        stos.dodaj(str);
        return wynik;
    }
}
