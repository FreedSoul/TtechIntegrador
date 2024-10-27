package Semana1.ejercicio8;

import java.util.*;

public class CuestionarioCorto {
    public record Question(Integer number, String question, Boolean correctAns){}
    public String answer;
    public boolean aux;
    public Question[] colaPreguntas;
    public CuestionarioCorto(){
        this.colaPreguntas = new Question[]{
                new Question(1,"¿Colon descubrió América?",true),
                new Question(2,"¿La independencia de México fue en el año 1810?",false),
                new Question(3,"¿The Doors fue un grupo de rock americano?",true),
                new Question(4,"¿waka waka lo canta shakira?",true),
        };

    }

    public boolean makeQuestion(int questionNumber) {
        Question currentQuestion = colaPreguntas[questionNumber];
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(currentQuestion.number+". "+currentQuestion.question);
            answer = scanner.nextLine().trim().toLowerCase();
            if(answer.equals("si")){
                aux = true;
                return aux == currentQuestion.correctAns;
            } else if (answer.equals("no") ) {
                aux = false;
                return aux == currentQuestion.correctAns;
            } else {
                System.out.println("utiliza las palabras [si] o [no] para responder");
            }
        }
    }

    public void startQuestionaire(){
        int totalQuestions = colaPreguntas.length;
        boolean continueQuestions;

        for (int i = 0; i < totalQuestions; i++) {
            continueQuestions = makeQuestion(i);
            if(i == totalQuestions-1 && continueQuestions == true){
                System.out.println("haz hecho todas las preguntas, Felicidades haz ganado!!");
            }
            if (!continueQuestions) {
                break;
            }
        }
        System.out.println("el juego ha terminado");
    }
}
