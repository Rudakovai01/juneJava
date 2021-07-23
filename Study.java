package HW_9;

import java.util.Arrays;
import java.util.List;
import static HW_9.Student.getListOfStudentVisitingCourse;
import static HW_9.Student.getListOfThirstyForKnowledgeStudent;
import static HW_9.Student.getUniqueCourses;


public class Study {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Стеша",
                        Arrays.asList(
                                new Course("Физика"),
                                new Course("Математическая логика"),
                                new Course("Теория вероятности"),
                                new Course("Аналитическая геометрия"),
                                new Course("Мат. анализ")
                        )),
                new Student("Афанасий",
                        Arrays.asList(
                                new Course("Дискретная математика"),
                                new Course("Математическая логика"),
                                new Course("Аналитическая геометрия"),
                                new Course("Мат. анализ")
                        )),
                new Student("Серафим",
                        Arrays.asList(
                                new Course("Теоретическая механика"),
                                new Course("Аналитическая геометрия"),
                                new Course("Мат. анализ")
                        )),
                new Student("Фекла",
                        Arrays.asList(
                                new Course("Аналитическая геометрия"),
                                new Course("Мат. анализ")
                        ))
        );
        Course mathLogic = new Course("Математическая логика");

        System.out.println("Список уникальных курсов: " + getUniqueCourses(students));
        System.out.println("Список трёх самых любознательных студентов: "
                + getListOfThirstyForKnowledgeStudent(students, 3));
        System.out.println("Список студентов, посещающих курс \"Математическая логика\": " + getListOfStudentVisitingCourse(students, mathLogic));
    }
}
