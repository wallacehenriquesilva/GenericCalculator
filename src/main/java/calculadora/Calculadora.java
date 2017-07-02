package calculadora;

import interfaces.CalculadoraInterface;
import model.NumeroModel;

public class Calculadora<T extends Number> implements CalculadoraInterface<T> {
    public T soma(T x, T y) {
        if (x instanceof Double) {
            return (T) new Double(x.doubleValue() + y.doubleValue());
        } else if (x instanceof Integer) {
            return (T) new Integer(x.intValue() + y.intValue());
        } else if (x instanceof Float) {
            return (T) new Float(x.floatValue() + y.floatValue());
        } else {
            throw new IllegalArgumentException("O tipo " + x.getClass() + " não é suportado");
        }
    }

    public T subtracao(T x, T y) {
        if (x instanceof Double) {
            return (T) new Double(x.doubleValue() - y.doubleValue());
        } else if (x instanceof Integer) {
            return (T) new Integer(x.intValue() - y.intValue());
        } else if (x instanceof Float) {
            return (T) new Float(x.floatValue() - y.floatValue());
        } else {
            throw new IllegalArgumentException("O tipo " + x.getClass() + " não é suportado");
        }
    }


    public T divisao(T x, T y) {
        if (x instanceof Double) {
            return (T) new Double(x.doubleValue() / y.doubleValue());
        } else if (x instanceof Integer) {
            return (T) new Integer(x.intValue() / y.intValue());
        } else if (x instanceof Float) {
            return (T) new Float(x.floatValue() / y.floatValue());
        } else {
            throw new IllegalArgumentException("O tipo " + x.getClass() + " não é suportado");
        }
    }


    public T multiplicacao(T x, T y) {
        if (x instanceof Double) {
            return (T) new Double(x.doubleValue() * y.doubleValue());
        } else if (x instanceof Integer) {
            return (T) new Integer(x.intValue() * y.intValue());
        } else if (x instanceof Float) {
            return (T) new Float(x.floatValue() * y.floatValue());
        } else {
            throw new IllegalArgumentException("O tipo " + x.getClass() + " não é suportado");
        }
    }


}
