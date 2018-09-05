import java.util.*;
class Volume
{
    float vol(float height , float width , float breadth)
    {
        return height*width*breadth;
    }
    float vol(float radius)
    {
        return (float)4*(float) 3.14*radius*radius*radius/(float) 3;
    }
    float vol(float radius,float height)
    {
        return (float)3.14*radius*radius*height;
    }

}
public class Assignment_6_3_1601CS35
{

    public static void main(String[] args)
    {   Scanner in = new Scanner(System.in);
        Volume obj = new Volume();
        while(true)
        {
            System.out.println("Enter 1 to calculate volume of cuboid , 2 for sphere , 3 for cylinder 0 to exit");
            int i = in.nextInt();
            if(i ==0)
            {
                break;
            }
            if(i==1)
            {
                System.out.println("Enter height , width , breadth");
                System.out.println(obj.vol(in.nextFloat(),in.nextFloat(),in.nextFloat()));
            }
            if(i==2)
            {
                System.out.println("Enter radius");
                System.out.println(obj.vol(in.nextFloat()));
            }
            if(i==3)
            {
                System.out.println("Enter radius and height");
                System.out.println(obj.vol(in.nextFloat(),in.nextFloat()));
            }
        }


    }
}

