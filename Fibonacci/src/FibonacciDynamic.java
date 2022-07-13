import java.util.HashMap;

public class FibonacciDynamic {
	HashMap<Integer, Long> hm = new HashMap<Integer, Long>();

	public FibonacciDynamic() {
		hm.put(0, (long) 0);
		hm.put(1, (long) 1);
	}

	public static void main(String[] args) {
		
		FibonacciDynamic obj = new FibonacciDynamic();
		
		System.out.println(obj.fibonaci(1000));
	}

	public Long fibonaci(int num) {
		if (hm.containsKey(num))
			return hm.get(num);
		long tempFibo = fibonaci(num - 1) + fibonaci(num - 2);
		hm.put(num, tempFibo);
		return tempFibo;
	}

}
