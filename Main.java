package Lesson1bis;

public class Main {
    public static void main(String[] args) {
        Action a = new Man();
        Man m = new Man();
        Cat c = new Cat();
        Robot r = new Robot();
        Track t = new Track();
        Barrier b = new Barrier();
        int[][] winList;

        // Задание 1
        System.out.println("Задание 1."); // Я не придумал как не писать такой длинный список команд ниже. Может быть вы подскажете?
        a.runTask1(m.entity);
        a.jumpTask1(m.entity);
        a.runTask1(c.entity);
        a.jumpTask1(c.entity);
        a.runTask1(r.entity);
        a.jumpTask1(r.entity);


        // Задание 2
        System.out.println("Задание 2.");
        a.runningTask2(m.entity, m.powerRun, t.trackMetres);
        a.jumpingTask2(m.entity, m.powerJump, b.barrierMetres);
        a.runningTask2(c.entity, c.powerRun, t.trackMetres);
        a.jumpingTask2(c.entity, c.powerJump, b.barrierMetres);
        a.runningTask2(r.entity, r.powerRun, t.trackMetres);
        a.jumpingTask2(r.entity, r.powerJump, b.barrierMetres);

        //Задание 3
        System.out.println("Задание 3.");
        int[][] members = {{3,4}, {10,10}, {6,2}, {8,9}}; // бег, прыжок
        int[][] COURSE_INFO = {{2,3}, {1,3}, {3,1}}; // чередуются длина дорожки, высота барьера
        winList = a.doIt(members, COURSE_INFO);
        a.showResults(winList);
    }
}