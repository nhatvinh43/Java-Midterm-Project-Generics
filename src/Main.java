public class Main {
    public static void main(String[] args)
    {
        ObjectArray objectArray;

        //Mảng số thực
        objectArray = new ObjectArray(new Double[] {1.34, -25.3, 0.0, 14.5, 9.23123});

        System.out.println("Phan tu lon nhat trong mang so thuc: " + objectArray.findLargest());


        //Mảng chuỗi ký tự
        MyString s1, s2, s3, s4, s5;

        s1 = new MyString("Hello");
        s2 = new MyString("It's me");
        s3 = new MyString("I've been wondering");
        s4 = new MyString("if after all these years");
        s5 = new MyString( "you'd like to meet");

        MyString[] sArr = {s1,s2,s3,s4,s5};

        objectArray = new ObjectArray(sArr);

        System.out.println("Phan tu lon nhat trong mang chuoi: " + objectArray.findLargest());

        //Mảng phân số
        Fraction f1, f2, f3, f4, f5;

        f1 = new Fraction(-1,2);
        f2 = new Fraction(-6,7);
        f3 = new Fraction(25,111);
        f4 = new Fraction(0, 15);
        f5 = new Fraction(-6,3);

        Fraction[] fArr = {f1, f2, f3, f4, f5};

        objectArray = new ObjectArray(fArr);
        System.out.println("Phan tu lon nhat trong mang phan so: " + objectArray.findLargest());

        //Mảng số phức
        ComplexNumber cn1,cn2,cn3,cn4,cn5;

        cn1 = new ComplexNumber(10,0);
        cn2 = new ComplexNumber(9,8);
        cn3 = new ComplexNumber(10,-3);
        cn4 = new ComplexNumber(1.2, 10);
        cn5 = new ComplexNumber(35.6, -9.8);

        ComplexNumber[] cnArr = {cn1,cn2,cn3,cn4,cn5};

        objectArray = new ObjectArray(cnArr);
        System.out.println("Phan tu lon nhat trong mang so phuc: " + objectArray.findLargest());
    }
}
