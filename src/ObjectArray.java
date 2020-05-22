import java.lang.reflect.Array;
import java.util.Arrays;

public class ObjectArray <T> {

    private T[] arr;

    public ObjectArray(T[] objects)
    {
        this.arr = objects;
    }

    public T findLargest()
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

}
