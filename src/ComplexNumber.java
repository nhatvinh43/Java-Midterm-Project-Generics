import static java.lang.Math.abs;

public class ComplexNumber implements Comparable<ComplexNumber> {

    private double PhanThuc;
    private double PhanAo;

    public double getPhanAo() {
        return PhanAo;
    }

    public double getPhanThuc() {
        return PhanThuc;
    }

    public void setPhanAo(double phanAo) {
        PhanAo = phanAo;
    }

    public void setPhanThuc(double phanThuc) {
        PhanThuc = phanThuc;
    }

    public ComplexNumber(double thuc, double ao)
    {
        try
        {
            if (thuc==0)
            {
                throw new ArithmeticException();
            }
        } catch(ArithmeticException e)
        {
            System.out.println("Phan thuc khong duoc la so 0");
            return;
        }

        PhanAo = ao;
        PhanThuc = thuc;
    }

    public String toString()
    {
        char sign = '+';

        if(PhanAo<0)
        {
            sign = '-';
        }

        return String.valueOf(PhanThuc) + ' ' + sign + ' ' +  String.valueOf(abs(PhanAo)) + 'i';
    }

    @Override
    public int compareTo(ComplexNumber x) {

        if(PhanThuc == x.getPhanThuc())
        {
            return (int) (PhanAo - x.getPhanAo());
        }
        else
        {
            return (int) (PhanThuc - x.getPhanThuc());
        }
    }
}
