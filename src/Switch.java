

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        String conceito;
        System.out.println(" Digite umas das opções de 1 a 7");

        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                conceito = "Domingo";
                break;
            case 2:
                conceito = "Segunda";
                break;
            case 3:
                conceito = "Terça";
                break;
            case 4:
                conceito = "Quarta";
                break;
            case 5:
                conceito = "Quinta";
                break;
            case 6:
                conceito = "Sexta";
                break;
            case 7:
                conceito = "Sabado";
                break;
            default:
                conceito = "Digita uma opção valida";

        }
        System.out.println(conceito);

                sc.close();
    }
}
