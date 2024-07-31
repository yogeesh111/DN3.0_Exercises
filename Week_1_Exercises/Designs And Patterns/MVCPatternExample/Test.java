package MVCPatternExample;

public class Test {
    public static void main(String[] args) {
        Student model = new Student("1", "Yogeesh", "B");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Yogeesh");
        controller.setStudentGrade("A");
        controller.updateView();
    }
}
