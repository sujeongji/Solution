package solution;

public class JewelsAndStones {

    public static int findJewelsInStones(String j, String s) {
        boolean[] jewels = new boolean[128];
        for (int i = 0; i < j.length(); i++) {
            jewels[j.codePointAt(i)] = true;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (jewels[s.codePointAt(i)]) {
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
	    System.out.print(findJewelsInStones("aA","aAAbbbb"));
		}
	}