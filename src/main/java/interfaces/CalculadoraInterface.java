package interfaces;

public interface CalculadoraInterface<T> {
    public T soma(T x, T y);
    public T subtracao(T x, T y);
    public T divisao(T x, T y);
    public T multiplicacao(T x, T y);
}
