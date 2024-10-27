package Semana2.TablaDeMultiplicar;

public class TablaDeMultiplicar {

    public static void main(String[] args) {

        System.out.println("las tablas de multiplicar del 1 al 9");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.print(STR." \{i} X \{j} = \{result}, ");
            }
                System.out.println(" ");

        }

    }
}
