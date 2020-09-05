public class Pierwiastek extends Operacje {
    @Override
    protected double dzialanie(double a) {
        return 0;
    }

    @Override
    protected double dzialanie(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nie ma pierwiastka stopnia 0 ");
        }else if(b%2==0 && a<0){
            throw new IllegalArgumentException("Nie ma pierwiastka stopnia parzystego z liczby ujemnej");
        }
        else {
            return Math.pow(a,1.0/b);
        }
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
