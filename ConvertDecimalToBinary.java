import java.util.HashSet;
import java.util.Set;

public class ConvertDecimalToBinary {
	
	public static Double convertDecimalToBinary(Double val) {
		
		String res = convertIntToBinary(Integer.valueOf(val.toString().split("\\.")[0]));
		res += "." + convertDecimalPartToString(Double.valueOf("0." + val.toString().split("\\.")[1]));
		
		return Double.valueOf(res);
	}
	
	private static String convertIntToBinary(int val) {
		String s = "";
		while(val > 0) {
			s = ((val % 2) == 0 ? "0" : "1") + s;
			val /= 2;
		}
		return s;
	}
	
	private static String convertDecimalPartToString(Double val) {
		String s = "";
		Set<Double> multiples = new HashSet<Double>();
		boolean isExists = false;
		
		while(val > 0) {
			val *= 2;
			s += val.toString().split("\\.")[0];
			val = Double.valueOf("0." + val.toString().split("\\.")[1]);
			if(multiples.contains(val)) {
				break;
			}
			multiples.add(val);
		}
		return s;
	}

	public static void main (String args[]) {
		System.out.println("Hello");
		System.out.println(convertDecimalToBinary(7d));
	}
}
