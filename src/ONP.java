public class ONP {
    private Stos stos = new Stos();
    Dodawanie dodawanie=new Dodawanie();
    Odejmowanie odejmowanie=new Odejmowanie();
    Mnozenie mnozenie=new Mnozenie();
    Dzielenie dzielenie=new Dzielenie();
    Potega potega=new Potega();
    Pierwiastek pierwiastek=new Pierwiastek();
    Modulo modulo = new Modulo();
    Silnia silnia= new Silnia();
    Negacja negacja=new Negacja();

    boolean czyPoprawneRownanie(String rownanie) {
        if (rownanie.endsWith("="))
            return true;
        else
            return false;
    }


    public String obliczOnp(String rownanie) {

            if (czyPoprawneRownanie(rownanie)) {
                while (!stos.getStos().isEmpty()) {
                    stos.usun();
                }
                String wynik = "";
                Double a = 0.0;
                Double b = 0.0;
                try {
                for (int i = 0; i < rownanie.length(); i++) {
                    if (rownanie.charAt(i) >= '0' && rownanie.charAt(i) <= '9' || rownanie.charAt(i) == '.') {
                        wynik += rownanie.charAt(i);
                        if (!(rownanie.charAt(i + 1) >= '0' && rownanie.charAt(i + 1) <= '9' || rownanie.charAt(i + 1) == '.')) {
                            stos.dodaj(wynik);
                            wynik = "";
                        }
                    } else if (rownanie.charAt(i) == '=') {
                        return stos.usun().toString();

                    } else if (rownanie.charAt(i) != ' ') {
                        if (rownanie.charAt(i) == '!') {
                            a = Double.parseDouble(stos.usun().toString());
                            try {
                                stos.dodaj(silnia.dzialanie(a));
                            } catch (Exception e) {
                                return e.getMessage();
                            }
                        } else if (rownanie.charAt(i) == 'n') {
                            a = Double.parseDouble(stos.usun().toString());
                            stos.dodaj(negacja.dzialanie(a));
                        } else {
                            b = Double.parseDouble(stos.usun().toString());
                            a = Double.parseDouble(stos.usun().toString());
                            switch (rownanie.charAt(i)) {
                                case ('+'): {
                                    stos.dodaj(dodawanie.dzialanie(a, b) + "");
                                    break;
                                }
                                case ('-'): {
                                    stos.dodaj(odejmowanie.dzialanie(a, b) + "");
                                    break;
                                }
                                case ('\u00D7'): {
                                    stos.dodaj(mnozenie.dzialanie(a, b) + "");
                                    break;
                                }
                                case ('\u00F7'): {
                                    try {
                                        stos.dodaj(dzielenie.dzialanie(a, b) + "");
                                    } catch (Exception e) {
                                        return e.getMessage();
                                    }
                                    break;
                                }
                                case ('^'): {
                                    stos.dodaj(potega.dzialanie(a, b) + "");
                                    break;
                                }

                                case ('\u221A'): {
                                    try {
                                        stos.dodaj(pierwiastek.dzialanie(a, b) + "");
                                    } catch (Throwable e) {
                                        return e.getMessage();
                                    }
                                    break;
                                }
                                case ('%'): {
                                    try {
                                        stos.dodaj(modulo.dzialanie(a, b) + "");
                                    } catch (Exception e) {
                                        return e.getMessage();
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                } catch (Exception e) {
                    return e.getMessage();
                }
                return "0.0";
            } else
                return "Brak '='";

    }


    public String przeksztalcNaOnp(String rownanie) {
            if (czyPoprawneRownanie(rownanie)) {
                String wynik = "";
                try {
                for (int i = 0; i < rownanie.length(); i++) {
                    if (rownanie.charAt(i) >= '0' && rownanie.charAt(i) <= '9' || rownanie.charAt(i) == '.') {
                        wynik += rownanie.charAt(i);
                        if (!(rownanie.charAt(i + 1) >= '0' && rownanie.charAt(i + 1) <= '9' || rownanie.charAt(i + 1) == '.'))
                            wynik += " ";
                    } else
                        switch (rownanie.charAt(i)) {
                            case ('+'): {
                                wynik = dodawanie.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;

                            }
                            case ('-'): {
                                wynik = odejmowanie.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;
                            }

                            case ('\u00D7'): {
                                wynik = mnozenie.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;
                            }
                            case ('\u00F7'): {
                                wynik = dzielenie.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;
                            }
                            case ('^'): {
                                wynik = potega.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;
                            }
                            case ('\u221A'): {
                                wynik = pierwiastek.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;
                            }
                            case ('%'): {
                                wynik = modulo.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;
                            }
                            case ('!'): {
                                wynik = silnia.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;
                            }
                            case ('n'): {
                                wynik = negacja.przeksztalcenieNaONP(stos, wynik, rownanie, i);
                                break;
                            }

                            case ('('): {
                                String str = "" + rownanie.charAt(i);
                                stos.dodaj(str);
                                break;
                            }
                            case (')'): {
                                while (stos.size() > 0 && !stos.podgladanie().equals("(")) {
                                    try {
                                        wynik = wynik + stos.usun() + " ";
                                    } catch (Exception e) {
                                        System.out.println("Stos pusty");
                                    }
                                    ;
                                }

                                try {
                                    stos.usun();
                                } catch (Exception e) {
                                    System.out.println("Stos pusty");
                                }
                                break;
                            }
                            case ('='): {
                                while (stos.size() > 0) {
                                    try {
                                        wynik = wynik + stos.usun() + " ";
                                    } catch (Exception e) {
                                        System.out.println("Stos pusty");
                                    }
                                }
                                wynik += "=";
                            }
                        }
                }
                } catch (Exception e) {
                    GUI.getjTextField1().setText(e.getMessage());
                    return e.getMessage();
                }
                return wynik;
            } else
                return "null";


    }

}