package nikhil.nani.hierarchy;

public class HierarchyExample1
{
    interface CustomMap
    {
        <V> CustomCollection<V> collect(CustomFunction<? extends V> function);
    }

    interface CustomCollection<T>
    {
        CustomImmutableCollection<T> toImmutable();
    }

    interface CustomImmutableCollection<T>
    {
    }

    interface CustomFunction<T>
    {
    }

    CustomMap delegate;

    <V> CustomImmutableCollection<V> example(CustomFunction<? extends V> function)
    {
        return delegate.collect(function).toImmutable();
    }

    public static void main(String[] args)
    {
        System.out.println("Java version: " + System.getProperty("java.version"));
    }
}
