package nikhil.nani.reflection;

import java.util.ArrayList;

import org.eclipse.collections.impl.list.Interval;
import org.eclipse.collections.impl.list.mutable.ArrayListAdapter;

/*
http://mail.openjdk.java.net/pipermail/jigsaw-dev/2017-May/012673.html
--illegal-access=permit
 */
public class ArrayListReflection
{
    public static void main(String[] args)
    {

        System.out.println("Java version: " + System.getProperty("java.version"));

        ArrayList<Integer> arrayList = new ArrayList<>();
        Interval.fromTo(0, 5).each(arrayList::add);
        ArrayListAdapter.adapt(arrayList).forEachWithIndex((each, index) -> System.out.println(each + " at " + index));

    }

}
