import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("*******");


        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("*******");

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1, "Ozturk", 10000);
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(2, "Gamze Gizem", 20000);
        System.out.println(juniorDeveloper.toString());
        juniorDeveloper.Work();

        MidDeveloper midDeveloper = new MidDeveloper(1,"İclal",50000);
        System.out.println(midDeveloper.toString());
        midDeveloper.Work();

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(1,"Hasan",70000);
        System.out.println(seniorDeveloper.toString());
        seniorDeveloper.Work();


        HRManager hrManager = new HRManager(1,"Özlem", 30000,
                new JuniorDeveloper[4],new MidDeveloper[3],new SeniorDeveloper[2]);
        hrManager.addEmployee(0,juniorDeveloper);
        hrManager.addEmployee(1,juniorDeveloper1);
        hrManager.addEmployee(0,midDeveloper);

        System.out.println(hrManager.toString());
    }
}