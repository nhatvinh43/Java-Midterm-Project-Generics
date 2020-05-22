public class Fraction implements Comparable<Fraction> {

    private int TuSo;
    private int MauSo;

    public Fraction(int TuSo, int MauSo)
    {
        try
        {
            if(MauSo==0)
            {
                throw new ArithmeticException();
            }

            this.TuSo = TuSo;
            this.MauSo = MauSo;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Mau so khong duoc la so 0!");
        }
    }

    public int getMauSo() {
        return MauSo;
    }

    public void setMauSo(int mauSo) {
        MauSo = mauSo;
    }

    public int getTuSo() {
        return TuSo;
    }

    public void setTuSo(int tuSo) {
        TuSo = tuSo;
    }

    public String toString()
    {
        if(this.TuSo==0)
        {
            return "0";
        }

        if(TuSo%MauSo==0)
        {
            return String.valueOf(TuSo/MauSo);
        }

        rutGon();

        if(MauSo==1)
        {
            return String.valueOf(TuSo);
        }
        else return (String.valueOf(TuSo) + '/' + String.valueOf(MauSo));
    }

    public void rutGon()
    {
        int gcd = 1;
        for(int i = 1; i <= TuSo && i <= MauSo; i++)
        {
            if(TuSo%i==0 && MauSo%i==0)
                gcd = i;
        }

        TuSo/=gcd;
        MauSo/=gcd;

    }



    @Override
    public int compareTo(Fraction x) {

        double ps1 = (double)TuSo / (double)MauSo;
        double ps2 = (double)x.getTuSo() / (double)x.getMauSo();

        if(ps1==ps2)
        {
            return 0;
        }
        else if(ps1>ps2)
        {
            return 1;
        }
        else {
            return -1;
        }

    }

}
