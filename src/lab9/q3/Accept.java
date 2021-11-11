package lab9.q3;

@FunctionalInterface
public interface Accept {
	public abstract boolean accept(String userName, String password);
}
