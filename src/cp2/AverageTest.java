package cp2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AverageTest {
	public static void main(String[] args) {
		int[] ints = { 1, 2, 3, 4 };
		AverageImpl averageImpl = new AverageImpl(ints);

		String testString = buildTestString(averageImpl.getInts(),
				averageImpl.getAverage(), averageImpl.getRunTime());
		System.out.println(testString);

		ints[0] = 2;
		ints[1] = 3;
		ints[2] = 4;
		ints[3] = 5;
		averageImpl.setInts(ints);

		testString = buildTestString(averageImpl.getInts(),
				averageImpl.getAverage(), averageImpl.getRunTime());

		int[] ints2 = {};
		try {
			averageImpl.setInts(ints2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Oops! can't use an empty array");
		}

		System.out.println("AverageImpl.averageTwoNumbers(1, 2) = "
				+ AverageImpl.averageTwoNumbers(1, 2));
		System.out.println(Math.PI);

	}

	private static String buildTestString(int[] values, float average, long time) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String timestamp = formatter.format(now);
		StringBuffer sb = new StringBuffer(timestamp);
		sb.append(">Averaged {");
		for (int i = 0; i < values.length; i++) {
			sb.append(values[i]);
			if (i < values.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("} and got");
		sb.append(average);
		sb.append(" in ");
		sb.append(time);
		sb.append(" nanoseconds");
		return sb.toString();

	}
}
