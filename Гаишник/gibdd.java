/**
 * Created by TIP on 18.09.14.
 */

import java.util.Scanner;

public class gibdd {

    String answer ="";
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        gibdd gai = new gibdd();
        gai.wakeUp();
    }

    void wakeUp(){
        System.out.println("Проснулся?");
        answer = scan.nextLine();
        if(answer.equals("нет")){
            System.out.println("Люди спокойны! Начинаем заново!");
            System.out.println("");
            wakeUp();
        }
        else{
            if(answer.equals("да"))
                wand();
        }
    }

    void wand(){
        System.out.println("Жезл найден?");
        answer = scan.nextLine();
        if(answer.equals("да")){
            calm();
        }
        else{
            if(answer.equals("нет"))
            {
                System.out.println("Идем спать! И начинаем заново");
                System.out.println("");
                wakeUp();
            }
        }
    }

    void calm(){
        System.out.println("Есть подозрительное ТС?");
        answer = scan.nextLine();
        if(answer.equals("да")){
            System.out.println("Взмахиваем жезлом...");
            System.out.println("");
            stopVehicle();
        }
        else{
            if(answer.equals("нет"))
                System.out.println("Говорим о проблемах с напарником...");
                money();
                calm();
        }
    }
    void stopVehicle(){
        System.out.println("Водитель остановился?");
        answer = scan.nextLine();
        if(answer.equals("да")){
            docs();
        }
        else{
            if(answer.equals("нет"))
                pursuit();
        }


    }

    void docs(){
        System.out.println("Проверяем документы...");
        System.out.println("Все ли в порядке?");
        answer = scan.nextLine();
        if(answer.equals("да")){
            money();
        }
        else{
            if (answer.equals("нет"))
                penalty();
        }
    }

    void penalty(){
        System.out.println("Оштрафовать нарушителя?");
        answer = scan.nextLine();
        if(answer.equals("да")){
            System.out.println("Штрафуем и радуемся!");
            money();
        }
        else{
            if (answer.equals("нет"))
                System.out.println("Надо быть добрее)))");
                System.out.println("");
                calm();
        }
    }

    void pursuit(){
        System.out.println("Догнали нарушителя?");
        answer = scan.nextLine();
        if(answer.equals("да"))
            docs();
        else{
            if(answer.equals("нет"))
                System.out.println("Хорошо бы новый служебный автомобиль!");
                money();
        }

    }

    void money(){
        System.out.println("Считаем деньги...");
        System.out.println("Хватит ли их на сегодня?");
        answer = scan.nextLine();
        if(answer.equals("да")){
            System.out.println("Начинаем заново!");
            System.out.println("");
            wakeUp();
        }
        else{
            if(answer.equals("нет"))
                System.out.println("Иди работай!");
                System.out.println("");
                calm();
        }
    }
}
