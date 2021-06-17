import java.util.HashSet;
import java.util.Set;

public class CalcEngineSet extends CalcEngine {

	Set<String> setA = new HashSet<String>();
	Set<String> setB = new HashSet<String>();
	Set<String> setResult = new HashSet<String>();

	public CalcEngineSet() {
		super();
	}

	private Set<String> parseStringToSet(String input) {
		return null;
	}

	public void setSet(String input, SetName setName) throws IllegalArgumentException {
	}

	public int sizeOfSet(SetName setName) {
		return 0;
	}

	public void clear() {

	}

	public Set<String> union() {
		Set<String> union = new HashSet<String>();
		union.addAll(setA);
		union.addAll(setB);
		return union;
	}

	public Set<String> intersection() {
		Set<String> intersection = new HashSet<String>();
		intersection.addAll(setA);
		intersection.retainAll(setB);
		return intersection;
	}

	public Set<String> subtraction() {
		Set<String>	subtraction = new HashSet<String>();
		subtraction.addAll(setA);
		subtraction.removeAll(setB);
		return subtraction;
	}

	public Set<String> power() {
		return null;
	}

	enum SetName {
		SET_A,SET_B,SET_RESULT;
	}
}