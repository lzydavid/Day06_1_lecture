package sdf;

@FunctionalInterface
public interface MyRunnableInterface<T> {
    
    //function signature(function method)
    T process(T a, T b);

}
