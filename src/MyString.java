public class MyString  implements Comparable<MyString> {

    private String s;

    public MyString(String s)
    {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String toString()
    {
        return s;
    }

    @Override
    public int compareTo(MyString o) {
        return s.length() - o.getS().length();
    }
}
