import javax.swing.*;

public class GUI extends javax.swing.JFrame {
    private static javax.swing.JButton liczba_8;
    private static javax.swing.JButton liczba_4;
    private static javax.swing.JButton liczba_5;
    private static javax.swing.JButton znakRownosci;
    private static javax.swing.JButton znakModulo;
    private static javax.swing.JButton znakSilni;
    private static javax.swing.JButton znakPotegi;
    private static javax.swing.JButton liczba_2;
    private static javax.swing.JButton znakMnozenia;
    private static javax.swing.JButton liczba_9;
    private static javax.swing.JButton liczba_6;
    private static javax.swing.JButton liczba_1;
    private static javax.swing.JButton znakDzielenia;
    private static javax.swing.JButton znakNegacji;
    private static javax.swing.JButton liczba_0;
    private static javax.swing.JButton liczba_7;
    private static javax.swing.JButton znakPierwiastka;
    private static javax.swing.JButton liczba_3;
    private static javax.swing.JButton przecinek;
    private static javax.swing.JButton znakDodawania;
    private static javax.swing.JButton znakOdejmowania;
    private static javax.swing.JButton prawyNawias;
    private static javax.swing.JButton lewyNawias;
    private static javax.swing.JButton resetowanieDzialania;
    private static javax.swing.JButton usuwanieOstatniegoElementuZDzialania;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField jTextField1;
    MenadzerPrzyciskow menadzerPrzyciskow=new MenadzerPrzyciskow();
    private static StringBuilder dzialanie = new StringBuilder();
    private static int iloscPrzecinkowWLiczbie;
    private static int iloscNawiasow;
    private static int iloscCyfrWLiczbie; //wraz z przecinkiem


    public static int getIloscPrzecinkowWLiczbie() {
        return iloscPrzecinkowWLiczbie;
    }

    public static int getIloscNawiasow() {
        return iloscNawiasow;
    }

    public static void setIloscPrzecinkowWLiczbie(int iloscPrzecinkowWLiczbie) {
        GUI.iloscPrzecinkowWLiczbie = iloscPrzecinkowWLiczbie;
    }

    public static void setIloscNawiasow(int iloscNawiasow) {
        GUI.iloscNawiasow = iloscNawiasow;
    }

    public static int getIloscCyfrWLiczbie() {
        return iloscCyfrWLiczbie;
    }

    public static void setIloscCyfrWLiczbie(int iloscCyfrWLiczbie) {
        GUI.iloscCyfrWLiczbie = iloscCyfrWLiczbie;
    }

    public GUI() {
        initComponents();
        iloscPrzecinkowWLiczbie=0;
        iloscNawiasow=0;
        iloscCyfrWLiczbie=0;
        menadzerPrzyciskow.czyPrzyciskWlaczony();
    }

    public static JButton getLiczba_4() {
        return liczba_4;
    }

    public static JButton getLiczba_5() {
        return liczba_5;
    }

    public static JButton getZnakRownosci() {
        return znakRownosci;
    }

    public static JButton getZnakModulo() {
        return znakModulo;
    }

    public static JButton getZnakSilni() {
        return znakSilni;
    }

    public static JButton getZnakPotegi() {
        return znakPotegi;
    }

    public static JButton getLiczba_2() {
        return liczba_2;
    }

    public static JButton getZnakMnozenia() {
        return znakMnozenia;
    }

    public static JButton getLiczba_9() {
        return liczba_9;
    }

    public static JButton getLiczba_6() {
        return liczba_6;
    }

    public static JButton getLiczba_1() {
        return liczba_1;
    }

    public static JButton getZnakDzielenia() {
        return znakDzielenia;
    }

    public static JButton getZnakNegacji() {
        return znakNegacji;
    }

    public static JButton getLiczba_0() {
        return liczba_0;
    }

    public static JButton getLiczba_7() {
        return liczba_7;
    }

    public static JButton getZnakPierwiastka() {
        return znakPierwiastka;
    }

    public static JButton getLiczba_3() {
        return liczba_3;
    }

    public static JButton getPrzecinek() {
        return przecinek;
    }

    public static JButton getZnakDodawania() {
        return znakDodawania;
    }

    public static JButton getZnakOdejmowania() {
        return znakOdejmowania;
    }

    public static JButton getPrawyNawias() {
        return prawyNawias;
    }

    public static JButton getLewyNawias() {
        return lewyNawias;
    }

    public static JButton getResetowanieDzialania() {
        return resetowanieDzialania;
    }

    public static JButton getUsuwanieOstatniegoElementuZDzialania() {
        return usuwanieOstatniegoElementuZDzialania;
    }

    public static JButton getLiczba_8() {
        return liczba_8;
    }

    public static JTextField getjTextField1() {
        return jTextField1;
    }

    public static StringBuilder getDzialanie() {
        return dzialanie;
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lewyNawias = new javax.swing.JButton();
        prawyNawias = new javax.swing.JButton();
        resetowanieDzialania = new javax.swing.JButton();
        usuwanieOstatniegoElementuZDzialania = new javax.swing.JButton();
        znakRownosci = new javax.swing.JButton();
        liczba_7 = new javax.swing.JButton();
        liczba_8 = new javax.swing.JButton();
        liczba_9 = new javax.swing.JButton();
        znakPotegi = new javax.swing.JButton();
        znakPierwiastka = new javax.swing.JButton();
        liczba_4 = new javax.swing.JButton();
        liczba_5 = new javax.swing.JButton();
        liczba_6 = new javax.swing.JButton();
        znakModulo = new javax.swing.JButton();
        znakSilni = new javax.swing.JButton();
        liczba_1 = new javax.swing.JButton();
        liczba_2 = new javax.swing.JButton();
        liczba_3 = new javax.swing.JButton();
        znakMnozenia = new javax.swing.JButton();
        znakDzielenia = new javax.swing.JButton();
        znakNegacji = new javax.swing.JButton();
        liczba_0 = new javax.swing.JButton();
        przecinek = new javax.swing.JButton();
        znakDodawania = new javax.swing.JButton();
        znakOdejmowania = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");

        jPanel1.setLayout(new java.awt.GridLayout(5, 5, 5, 5));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("");

        jPanel1.setLayout(new java.awt.GridLayout(5, 5, 5, 5));

        lewyNawias.setText("(");
        lewyNawias.addActionListener(menadzerPrzyciskow);
        jPanel1.add(lewyNawias);

        prawyNawias.setText(")");
        prawyNawias.addActionListener(menadzerPrzyciskow);
        jPanel1.add(prawyNawias);

        resetowanieDzialania.setText("C");
        resetowanieDzialania.addActionListener(menadzerPrzyciskow);
        jPanel1.add(resetowanieDzialania);

        usuwanieOstatniegoElementuZDzialania.setText("<<=");
        usuwanieOstatniegoElementuZDzialania.addActionListener(menadzerPrzyciskow);
        jPanel1.add(usuwanieOstatniegoElementuZDzialania);

        znakNegacji.setText("+/-");
        znakNegacji.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakNegacji);

        liczba_7.setText("7");
        liczba_7.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_7);

        liczba_8.setText("8");
        liczba_8.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_8);

        liczba_9.setText("9");
        liczba_9.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_9);

        znakPotegi.setText("^");
        znakPotegi.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakPotegi);

        znakPierwiastka.setText("\u221A");
        znakPierwiastka.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakPierwiastka);

        liczba_4.setText("4");
        liczba_4.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_4);

        liczba_5.setText("5");
        liczba_5.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_5);

        liczba_6.setText("6");
        liczba_6.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_6);

        znakModulo.setText("%");
        znakModulo.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakModulo);

        znakSilni.setText("!");
        znakSilni.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakSilni);

        liczba_1.setText("1");
        liczba_1.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_1);

        liczba_2.setText("2");
        liczba_2.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_2);

        liczba_3.setText("3");
        liczba_3.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_3);

        znakMnozenia.setText("\u00D7");
        znakMnozenia.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakMnozenia);

        znakDzielenia.setText("\u00F7");
        znakDzielenia.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakDzielenia);

        znakRownosci.setText("=");
        znakRownosci.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakRownosci);

        liczba_0.setText("0");
        liczba_0.addActionListener(menadzerPrzyciskow);
        jPanel1.add(liczba_0);

        przecinek.setText(".");
        przecinek.addActionListener(menadzerPrzyciskow);
        jPanel1.add(przecinek);

        znakDodawania.setText("+");
        znakDodawania.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakDodawania);

        znakOdejmowania.setText("-");
        znakOdejmowania.addActionListener(menadzerPrzyciskow);
        jPanel1.add(znakOdejmowania);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );

        pack();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }


}
