package nikhil.nani.reflection;

import java.util.ArrayList;

import org.eclipse.collections.impl.list.Interval;
import org.eclipse.collections.impl.list.mutable.ArrayListAdapter;

public class ArrayListReflectionJava8
{
    public static void main(String[] args)
    {
        System.out.println("Java version: " + System.getProperty("java.version"));

        ArrayList<Integer> arrayList = new ArrayList<>();
        Interval.fromTo(0, 5).each(arrayList::add);
        ArrayListAdapter.adapt(arrayList).forEachWithIndex((each, index) -> System.out.println(each + " at " + index));
    }
}
