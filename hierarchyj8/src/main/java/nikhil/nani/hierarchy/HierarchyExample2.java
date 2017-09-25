package nikhil.nani.hierarchy;

import org.eclipse.collections.api.block.function.Function;

public class HierarchyExample2
{
    public static <T extends Comparable<T>, V> CustomFunction<T, V> example(
            Function<? super T, ? extends V> defaultFunction)
    {
        return new CustomFunction<>(defaultFunction);
    }

    private static class CustomFunction<T extends Comparable<T>, V>
    {
        private Function<? super T, ? extends V> defaultFunction;

        public CustomFunction()
        {
        }

        public CustomFunction(Function<? super T, ? extends V> newDefaultFunction)
        {
            this.defaultFunction = newDefaultFunction;
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Java version: " + System.getProperty("java.version"));
    }
}
