package com;

import static com.ControleDeFluxo.*;

public class Main {
    public static void main(String[] args) {

        String sIfOuSwitch = "IF";
        switch (sIfOuSwitch) {
            case "IF":
                System.out.println("IF");
                for (int i = 1; i <= 12; i++) {
                    mensagemIf(i);
                    System.out.println();
                }
                break;

            case "SWITCH":
                System.out.println("SWITCH");
                for (int i = 1; i <= 12; i++) {
                    mensagemSwitch(i);
                    System.out.println();
                }
                break;
        }
    }
}
