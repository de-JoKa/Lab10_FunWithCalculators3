import java.util.HashSet;
import java.util.Set;

public class CalcEngineSet extends CalcEngine {

	Set<String> setA = new HashSet<String>();
	Set<String> setB = new HashSet<String>();
	Set<String> setResult = new HashSet<String>();

	public CalcEngineSet() {
		super();
	}

	public void clear() {
		if (setA != null && setB != null && setResult != null) {
			setA.clear();
			setB.clear();
			setResult.clear();
		}
	}

	public void union() {
		Set<String> union = new HashSet<String>();
		union.addAll(setA);
		union.addAll(setB);
		setResult = union;
	}

	public void intersection() {
		Set<String> intersection = new HashSet<String>();
		intersection.addAll(setA);
		intersection.retainAll(setB); // remove all elements that are not in set B
		setResult = intersection;
	}

	public void subtraction() {
		Set<String> subtraction = new HashSet<String>();
		subtraction.addAll(setA);
		subtraction.removeAll(setB);
		setResult = subtraction;
	}

	public Set<String> power() {
		return null;
	}

	public void addToSetA(String element) {
		setA.add(element);
	}

	public void addToSetB(String element) {
		setB.add(element);
	}

	public String getStringSetA() {
		return setA.toString();
	}

	public String getStringSetB() {
		return setB.toString();
	}

	public String getStringResult() {
		return setResult.toString();
	}
}