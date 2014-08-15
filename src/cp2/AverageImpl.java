package cp2;

public class AverageImpl extends Object implements Average {
	private long begin;
	private long end;
	private int[] ints;
	private static final String EXCEPTION_MESSAGE = "ints must contain at least one int";

	public AverageImpl(int[] ints) throws IllegalArgumentException {
		// TODO Auto-generated constructor stub
		if (ints.length == 0) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
		this.ints = ints;
	}

	public static float averageTwoNumbers(int a, int b) {
		return (float) (a + b) / 2;
	}
	
	public long getRunTime() {
		return end - begin;
	}

	@Override
	public int[] getInts() {
		// TODO Auto-generated method stub
		return ints;
	}

	@Override
	public void setInts(int[] ints) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if (ints.length == 0) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
		
		this.ints = ints;
		
	}

	@Override
	public float getAverage() {
		// TODO Auto-generated method stub
		begin = System.nanoTime();
		int result = 0;
		for (int i = 0; i < ints.length; i++) {
			result += ints[i];
		}
		end = System.nanoTime();
		
		return (float)result/ints.length;
	}

}
