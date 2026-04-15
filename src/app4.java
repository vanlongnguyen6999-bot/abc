import java.util.Scanner;
public class app4 {
    public static void main(String args[]){
        Triangle t = new Triangle();
        System.out.println("Nhập vào 3 cạnh của tam giác: ");
        double side1, side2, side3;
        String color;
        Scanner s = new Scanner(System.in);
        side1 = s.nextDouble();
        side2 = s.nextDouble();
        side3 = s.nextDouble();
        s.nextLine();
        System.out.println("Nhập màu của tam giác: ");
        color = s.nextLine();
        t.setColor(color);
        t.setSide1(side1);
        t.setSide2(side2);
        t.setSide3(side3);
        if(t.isValid()){
            System.out.println(t.toString());
        }
        else{
            System.out.println("Độ dài bạn vừa nhập không phải độ dài 3 cạnh của tam giác");
        }
    }
}
