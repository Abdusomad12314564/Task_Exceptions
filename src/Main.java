import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("""
                    \nПараллелепипедтин аянтын эсептөөнү кааласаңыз 1ди басыңыз
                    Параллелепипедтин көлөмүн эсептөөнү кааласаңыз 2ни басыңыз
                    Цилиндрдин аянтын эсептөөнү кааласаңыз 3тү басыңыз
                    Цилиндрдин көлөмүн эсептөөнү кааласаңыз 4тү басыңыз
                    Эгер программаны токтотууну кааласаңыз 0ду басыңыз
                    №: """);
            try {
                int num = new Scanner(System.in).nextInt();
                if (num == 0) {
                    System.err.println("Сиз программаны токтоттуңуз");
                    break;
                }
                switch (num) {
                    case 1 -> {
                        System.out.println("Параллелепипедтин аянтын эсептөө үчүн үч жолу сан бериңиз");
                        Parallelepiped parallelepiped = new Parallelepiped(
                                new Scanner(System.in).nextInt(),
                                new Scanner(System.in).nextInt(),
                                new Scanner(System.in).nextInt());
                        if (parallelepiped.getLength() < 0 || parallelepiped.getHeight() < 0 || parallelepiped.getWidth() < 0) {
                            throw new MyExc();
                        }
                        parallelepiped.area();
                    }
                    case 2 -> {
                        System.out.println("Параллелепипедтин көлөмүн эсептөө үчүн үч жолу сан бериңиз");
                        Parallelepiped parallelepiped = new Parallelepiped(
                                new Scanner(System.in).nextInt(),
                                new Scanner(System.in).nextInt(),
                                new Scanner(System.in).nextInt());
                        if (parallelepiped.getLength() < 0 || parallelepiped.getHeight() < 0 || parallelepiped.getWidth() < 0) {
                            throw new MyExc();
                        }
                        parallelepiped.volume();
                    }
                    case 3 -> {
                        System.out.println("Цилиндрдин аянтын эсептөө үчүн эки жолу сан бериңиз");
                        Cylinder cylinder = new Cylinder(new Scanner(System.in).nextInt(),
                                new Scanner(System.in).nextInt());
                        if (cylinder.getHeight() < 0 || cylinder.getRadius() < 0) {
                            throw new MyExc();
                        }
                        cylinder.area();
                    }
                    case 4 -> {
                        System.out.println("Цилиндрдин көлөмүн эсептөө үчүн эки жолу сан бериңиз");
                        Cylinder cylinder = new Cylinder(new Scanner(System.in).nextInt(),
                                new Scanner(System.in).nextInt());
                        if (cylinder.getHeight() < 0 || cylinder.getRadius() < 0) {
                            throw new MyExc();
                        }
                        cylinder.volume();
                    }
                    default -> System.out.println("Мындай иш аракет жок!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Тамга жазган болбойт!");
            } catch (MyExc e) {
                System.out.println("Терс сан берген болбойт!");
            }
        }
    }
}