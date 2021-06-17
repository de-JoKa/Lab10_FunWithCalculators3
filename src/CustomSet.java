import java.util.Collection;

public interface CustomSet<E> {
	abstract CustomSet<E> of(Collection<? extends E> coll);
	
	abstract CustomSet<E> union(CustomSet<E> setB);
	
	abstract CustomSet<E> intersection(CustomSet<E> setB);
	
	abstract CustomSet<E> substraction(CustomSet<E> setB);
	
	abstract CustomSet<E> power(CustomSet<E> setB);
	
	abstract void add(Collection<? extends E> coll);
	abstract void add(E elem);
	
	abstract void remove(Collection<? extends E> coll);
	abstract void remove(E elem);
	
	@Override
	abstract String toString();
}
