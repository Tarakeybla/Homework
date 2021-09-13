import members.*;
import obstacles.Obstacle;
import obstacles.*;

public class Main {
        public static void main(String[] args) {

            Capabilities[] competitors = {new Bird("Боб"), new Cat("Барсик"), new Dog("Бобик")};
            Obstacle[] obstacles = {new Track(400), new Wall(2), new Pool(100)};

            Teams team = new Teams("Победители", competitors);

            System.out.println("============Создание новой команды============");
            System.out.println(team.getTeamName());

            System.out.println("============Перечисление участников команды============");
            team.showResults();

            // new Course
            Course course = new Course(obstacles);

            System.out.println("============Прохождение препятствий============");
            course.doIt(team);

            System.out.println("============Результаты команды============");
            team.showResults();

            System.out.println("============Участники команды прошедшие препятствия============");
            team.showMembersFinishedCourse();
        }
}
