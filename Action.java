package Lesson1bis;

import java.util.Arrays;

public interface Action {

    // Задание 1
    default void runTask1(String entity){
        System.out.printf("%s is running%n", entity);
    }
    default void jumpTask1(String entity){
        System.out.printf("%s is jumping%n%n", entity);
    }

    // Задание 2
    default void runningTask2(String entity, int powerRun, int trackMetres){
        System.out.printf("Бежит %s. Дистанция %d метров, запас хода %d метров%n", entity,trackMetres, powerRun);
        boolean runResult = true;
        if ((powerRun-=trackMetres)<0) runResult = false;
        System.out.printf("Результат: %b%n%n", runResult);
    }
    default void jumpingTask2(String entity, int powerJump, int barrierMetres){
        System.out.printf("Прыгает %s. Барьер %d метров, запас прыжка %d метров%n", entity, barrierMetres, powerJump);
        boolean jumpResult = true;
        if ((powerJump-=barrierMetres)<0) jumpResult = false;
        System.out.printf("Результат: %b%n%n", jumpResult);
    }

    //Задание 3
    default int[][] doIt(int[][]members, int[][]COURSE_INFO){
        System.out.println("Полоса препятствий: " + Arrays.deepToString(COURSE_INFO).replace("], ", "]"));
        System.out.println();
        int[][] winList = new int[members.length][2];
        for (int i = 0; i < members.length; i++){
            for (int j = 0; j < COURSE_INFO.length; j++){
                members[i][0] = members[i][0] - COURSE_INFO[j][0];
                members[i][1] = members[i][1] - COURSE_INFO[j][1];
                if (members[i][0]<0 || members[i][1]<0){
                    winList[i][0] = i;
                    winList[i][1] = 0; // значение 0 - значит не прошел полосу препятствий
                    break;
                }
            }
            if (members[i][0]>=0 && members[i][1]>=0){
                winList[i][0] = i;
                winList[i][1] = 1; // значение 1 - значит прошел полосу препятствий
            }
        }
        return winList;
    }

    default void showResults(int[][] winList){
        for (int i = 0; i < winList.length; i++){
            if (winList[i][1] == 0){
                System.out.printf("Участник #%d не прошел полосу препятствий%n", (i+1));
            }
            else if (winList[i][1] == 1){
                System.out.printf("Участник #%d успешно прошел полосу препятствий%n", (i+1));
            }
        }
    }



}


