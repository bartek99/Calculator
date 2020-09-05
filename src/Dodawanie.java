public class Dodawanie extends Operacje  {

    Obliczenie2Argumentowe suma=(Double a, Double b) -> a+b;
    @Override
    protected double dzialanie(double a) {
        return 0;
    }

    @Override
    public double dzialanie(double a, double b){
        return suma.calculate(a,b);
    }
    @Override
    public String przeksztalcenieNaONP(Stos stos,String wynik, String rownanie, int i){
        while (stos.size() > 0 && !stos.podgladanie().equals("(")) {
            try {
                wynik = wynik + stos.usun().toString() + " ";
            }catch (Exception e){
                System.out.println("Stos pusty");
            }
        }
        String str = "" + rownanie.charAt(i);
        stos.dodaj(str);
        return wynik;
    }
}
