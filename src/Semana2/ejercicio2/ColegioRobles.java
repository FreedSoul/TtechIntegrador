package Semana2.ejercicio2;

public class ColegioRobles {
    public float estudiantes;

    public ColegioRobles(int estudiantes) {
        this.estudiantes = estudiantes;
    }

    public float calcularCrecimiento(){
        int currentYear = 2024;
        int futureYear = 2035;
        int growYears = futureYear - currentYear;


        for (int i = 0; i < growYears; i++) {
            estudiantes += (estudiantes * 0.12f);
        }
        estudiantes = (int) estudiantes;
        return estudiantes;
    }
}
