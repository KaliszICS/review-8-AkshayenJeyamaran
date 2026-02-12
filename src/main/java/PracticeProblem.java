public class PracticeProblem {

	public static void main(String args[]) {

	}
    
	public static String pluralize(String s) {
		if (s.length() >= 2 && s.toLowerCase().substring(s.length() - 2) .equals ("ey")){
			return "eys";
		} 
		else if (s.length() >= 1 && s.toLowerCase().substring(s.length() - 1) .equals ("y")){
			return "ies";
		}

		else if (s.length() >= 3 && (s.toLowerCase().substring(s.length() - 3) .equals ("ife"))) {
			return "ives";
		}

		else {
			return "s";
		}
	}
	public static int min(int int1, int int2, int int3) {
		if (int1 < int2) {
			if (int1 < int3) {
				return (int1);
			}

			else {
				return int3;
			}
		}
		else {
			if (int2 < int3) {
				return int2;
			}
			else { 
				return int3;
			}

		}
	}

	public static boolean isLeapYear(int int1) {
		if (int1 % 4 != 0) {
			return false;
			}
		else {
			if (int1 % 100 == 0) {
				if (int1 % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			else { 
				return true;
			}
		}
	}
}
