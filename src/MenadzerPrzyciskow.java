import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenadzerPrzyciskow implements ActionListener {
    ONP onp=new ONP();
    StringBuilder rownianieONP=new StringBuilder();
    StringBuilder wynik=new StringBuilder();


    void czyPrzyciskWlaczony(){
        GUI.getLiczba_0().setEnabled(true);
        GUI.getLiczba_1().setEnabled(true);
        GUI.getLiczba_2().setEnabled(true);
        GUI.getLiczba_3().setEnabled(true);
        GUI.getLiczba_4().setEnabled(true);
        GUI.getLiczba_5().setEnabled(true);
        GUI.getLiczba_6().setEnabled(true);
        GUI.getLiczba_7().setEnabled(true);
        GUI.getLiczba_8().setEnabled(true);
        GUI.getLiczba_9().setEnabled(true);
        if(GUI.getDzialanie().length()==0){
            GUI.getLewyNawias().setEnabled(true);
            GUI.getPrawyNawias().setEnabled(false);
            GUI.getResetowanieDzialania().setEnabled(false);
            GUI.getUsuwanieOstatniegoElementuZDzialania().setEnabled(false);
            GUI.getZnakRownosci().setEnabled(false);
            GUI.getZnakPotegi().setEnabled(false);
            GUI.getZnakPierwiastka().setEnabled(false);
            GUI.getZnakModulo().setEnabled(false);
            GUI.getZnakSilni().setEnabled(false);
            GUI.getZnakMnozenia().setEnabled(false);
            GUI.getZnakDzielenia().setEnabled(false);
            GUI.getZnakNegacji().setEnabled(false);
            GUI.getPrzecinek().setEnabled(false);
            GUI.getZnakDodawania().setEnabled(false);
            GUI.getZnakOdejmowania().setEnabled(false);
        }
        else if(GUI.getDzialanie().length()!=0) {

            GUI.getResetowanieDzialania().setEnabled(true);
            GUI.getUsuwanieOstatniegoElementuZDzialania().setEnabled(true);
            if (GUI.getIloscNawiasow() == 0) {
                GUI.getLewyNawias().setEnabled(true);
                GUI.getPrawyNawias().setEnabled(false);
            }else{
                if((GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)>='0'
                    && GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)<='9')){
                    GUI.getPrawyNawias().setEnabled(true);
                }
            }
            if(GUI.getIloscPrzecinkowWLiczbie()==0) {
                if ((GUI.getDzialanie().charAt(GUI.getDzialanie().length() - 1) >= '0'
                        && GUI.getDzialanie().charAt(GUI.getDzialanie().length() - 1) <= '9')) {
                    GUI.getPrzecinek().setEnabled(true);
                }else{
                    GUI.getPrzecinek().setEnabled(false);
                }
            }else{
                GUI.getPrzecinek().setEnabled(false);
            }
            if(GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)>='0'
             && GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)<='9'){
                GUI.getLewyNawias().setEnabled(false);
                GUI.getZnakPotegi().setEnabled(true);
                GUI.getZnakPierwiastka().setEnabled(true);
                GUI.getZnakModulo().setEnabled(true);
                GUI.getZnakMnozenia().setEnabled(true);
                GUI.getZnakDzielenia().setEnabled(true);
                GUI.getZnakDodawania().setEnabled(true);
                GUI.getZnakOdejmowania().setEnabled(true);
                GUI.getZnakSilni().setEnabled(true);
                GUI.getZnakNegacji().setEnabled(true);
            }
            if(GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)=='+'
                    || GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)=='-'
                    || GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)=='\u00D7'
                    || GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)=='\u00F7'
                    || GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)=='^'
                    || GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)=='\u221A'){

                GUI.getPrawyNawias().setEnabled(false);
            }

            if(GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)==')'){
                GUI.getLiczba_0().setEnabled(false);
                GUI.getLiczba_1().setEnabled(false);
                GUI.getLiczba_2().setEnabled(false);
                GUI.getLiczba_3().setEnabled(false);
                GUI.getLiczba_4().setEnabled(false);
                GUI.getLiczba_5().setEnabled(false);
                GUI.getLiczba_6().setEnabled(false);
                GUI.getLiczba_7().setEnabled(false);
                GUI.getLiczba_8().setEnabled(false);
                GUI.getLiczba_9().setEnabled(false);
                GUI.getLewyNawias().setEnabled(false);
                GUI.getPrawyNawias().setEnabled(false);
                GUI.getResetowanieDzialania().setEnabled(true);
                GUI.getUsuwanieOstatniegoElementuZDzialania().setEnabled(true);
                GUI.getZnakRownosci().setEnabled(false);
                GUI.getZnakPotegi().setEnabled(true);
                GUI.getZnakPierwiastka().setEnabled(true);
                GUI.getZnakModulo().setEnabled(true);
                GUI.getZnakSilni().setEnabled(false);
                GUI.getZnakMnozenia().setEnabled(true);
                GUI.getZnakDzielenia().setEnabled(true);
                GUI.getZnakNegacji().setEnabled(false);
                GUI.getPrzecinek().setEnabled(false);
                GUI.getZnakDodawania().setEnabled(true);
                GUI.getZnakOdejmowania().setEnabled(true);
            }

            if(GUI.getIloscNawiasow()==0 && (GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)==')'
                    || (GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)>='0'
                    && GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)<='9'))){
                GUI.getZnakRownosci().setEnabled(true);
            }
            if(GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1) == '!' ||
                    GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1) == 'n' ||
                    (GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1) >= '0'
                     && GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1) <= '9')){
                GUI.getLewyNawias().setEnabled(false);
            }
            if(GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)=='.'){
                GUI.getLiczba_0().setEnabled(true);
                GUI.getLiczba_1().setEnabled(true);
                GUI.getLiczba_2().setEnabled(true);
                GUI.getLiczba_3().setEnabled(true);
                GUI.getLiczba_4().setEnabled(true);
                GUI.getLiczba_5().setEnabled(true);
                GUI.getLiczba_6().setEnabled(true);
                GUI.getLiczba_7().setEnabled(true);
                GUI.getLiczba_8().setEnabled(true);
                GUI.getLiczba_9().setEnabled(true);
                GUI.getLewyNawias().setEnabled(false);
                GUI.getPrawyNawias().setEnabled(false);
                GUI.getResetowanieDzialania().setEnabled(true);
                GUI.getUsuwanieOstatniegoElementuZDzialania().setEnabled(true);
                GUI.getZnakRownosci().setEnabled(false);
                GUI.getZnakPotegi().setEnabled(false);
                GUI.getZnakPierwiastka().setEnabled(false);
                GUI.getZnakModulo().setEnabled(false);
                GUI.getZnakSilni().setEnabled(false);
                GUI.getZnakMnozenia().setEnabled(false);
                GUI.getZnakDzielenia().setEnabled(false);
                GUI.getZnakNegacji().setEnabled(false);
                GUI.getPrzecinek().setEnabled(false);
                GUI.getZnakDodawania().setEnabled(false);
                GUI.getZnakOdejmowania().setEnabled(false);
            }
            if(GUI.getDzialanie().charAt(GUI.getDzialanie().length()-1)=='='){
                GUI.getLiczba_0().setEnabled(false);
                GUI.getLiczba_1().setEnabled(false);
                GUI.getLiczba_2().setEnabled(false);
                GUI.getLiczba_3().setEnabled(false);
                GUI.getLiczba_4().setEnabled(false);
                GUI.getLiczba_5().setEnabled(false);
                GUI.getLiczba_6().setEnabled(false);
                GUI.getLiczba_7().setEnabled(false);
                GUI.getLiczba_8().setEnabled(false);
                GUI.getLiczba_9().setEnabled(false);
                GUI.getLewyNawias().setEnabled(false);
                GUI.getPrawyNawias().setEnabled(false);
                GUI.getResetowanieDzialania().setEnabled(true);
                GUI.getUsuwanieOstatniegoElementuZDzialania().setEnabled(false);
                GUI.getZnakRownosci().setEnabled(false);
                GUI.getZnakPotegi().setEnabled(false);
                GUI.getZnakPierwiastka().setEnabled(false);
                GUI.getZnakModulo().setEnabled(false);
                GUI.getZnakSilni().setEnabled(false);
                GUI.getZnakMnozenia().setEnabled(false);
                GUI.getZnakDzielenia().setEnabled(false);
                GUI.getZnakNegacji().setEnabled(false);
                GUI.getPrzecinek().setEnabled(false);
                GUI.getZnakDodawania().setEnabled(false);
                GUI.getZnakOdejmowania().setEnabled(false);
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);

            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "0": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '0');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "1": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '1');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "2":{
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '2');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "3":{
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '3');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "4": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '4');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "5": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '5');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "6": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '6');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "7": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '7');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "8": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '8');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "9": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '9');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "+/-": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), 'n');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case ".": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '.');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(1);
                GUI.setIloscCyfrWLiczbie(GUI.getIloscCyfrWLiczbie()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case "+": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '+');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "-": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '-');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "\u00D7": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '\u00D7');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "\u00F7": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '\u00F7');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case  "%": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '%');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "!": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '!');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "^": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '^');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "\u221A": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '\u221A');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscCyfrWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "(": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '(');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscNawiasow(GUI.getIloscNawiasow()+1);
                czyPrzyciskWlaczony();
                break;
            }
            case ")": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), ')');
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                GUI.setIloscNawiasow(GUI.getIloscNawiasow()-1);
                GUI.setIloscPrzecinkowWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "C": {
                GUI.getDzialanie().delete(0,GUI.getDzialanie().length());
                rownianieONP.delete(0,rownianieONP.length());
                wynik.delete(0,wynik.length());
                GUI.getjTextField1().setText("");
                GUI.setIloscCyfrWLiczbie(0);
                GUI.setIloscPrzecinkowWLiczbie(0);
                GUI.setIloscNawiasow(0);
                czyPrzyciskWlaczony();
                break;
            }
            case "<<=": {
                GUI.getDzialanie().deleteCharAt(GUI.getDzialanie().length()-1);
                GUI.getjTextField1().setText(GUI.getDzialanie().toString());
                czyPrzyciskWlaczony();
                break;
            }
            case "=": {
                GUI.getDzialanie().insert(GUI.getDzialanie().length(), '=');
                rownianieONP.append(onp.przeksztalcNaOnp(GUI.getDzialanie().toString()));
                wynik.append(onp.obliczOnp(rownianieONP.toString()));
                GUI.getjTextField1().setText(GUI.getDzialanie().toString() + rownianieONP + wynik);
                GUI.setIloscPrzecinkowWLiczbie(0);
                czyPrzyciskWlaczony();
                break;
            }

        }
    }
}
