package nova.core.util.math;

/**
 * Applied to any object that can do mathematical operations.
 *
 * @param <I> -describeme-
 * @param <O> -describeme-
 * @author Calclavia
 */
public abstract class Operator<I extends Operator<I, O>, O extends I> {
	public abstract O add(I other);

	public abstract O add(double other);

	public final O subtract(I other) {
		return add(other.negate());
	}

	public final O subtract(double other) {
		return add(-other);
	}

	public abstract O multiply(double other);

	public final O divide(double other) {
		return multiply(1 / other);
	}

	/**
	 * Gets the reciprocal of this vector.
	 * Any value of zero will cause a division by zero error.
	 *
	 * @return -describeme-
	 */
	public abstract O reciprocal();

	public final O negate() {
		return multiply(-1);
	}

	public O $plus(I v) {
		return add(v);
	}

	public O $plus(double v) {
		return add(v);
	}

	public O $minus(I v) {
		return subtract(v);
	}

	public O $minus(double v) {
		return subtract(v);
	}

	public O $times(double d) {
		return multiply(d);
	}

	public O $div(double d) {
		return multiply(1 / d);
	}

	public O unary_$minus() {
		return negate();
	}
}
