package Lab_2;

import java.util.HashMap;

public class Model {
	HashMap<Integer, Long> map = new HashMap<Integer, Long>();
	
	private Long getValueFromMemory(Integer value) {
		if(map.get(value) == null) {
			return null;
		} else {
			return (Long) map.get(value);
		}
	}
	
	private void addValueToMemory(Integer value, Long result) {
		if(map.get(value) == null) {
			map.put(value, result);
		}
	}
	
	public void clearMemory() {
		map.clear();
	}
	
	private long computePower(int power) {
		if(power == 0) {
			return 1;
		} else if(power >= 0) {
			return 2 * computePower(power-1);
		}
		return 0;
	}
	
	public long compute2Power(int power) {
		long result = 0;
		if(power < 0) {
			throw new IllegalArgumentException();
		} else {
			if(getValueFromMemory(power) != null) {
				System.out.println("(value from memory)");
				result = getValueFromMemory(power);
			} else {
				System.out.println("(new value)");
				result = computePower(power);
				addValueToMemory(power, result);
			}
		}
		return result;
		
	}
	
}
