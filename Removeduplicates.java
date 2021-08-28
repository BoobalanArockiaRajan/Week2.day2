package Week2.day2;

public class Removeduplicates {
	public static void main(String[] args) {
		String text = "Why blood same blood";
	
		String[] strArry = text.split(" ");
				
		for (int i = 0; i < strArry.length; i++) {
			int count = 0;
			for (int j = 0; j < strArry.length; j++) {
				if (strArry[i].equals(strArry[j])) 
				{
					count = count + 1;
				}
			}
			if (count > 1) {
				strArry[i]=strArry[i].replace(strArry[i], "");
			}

		}

		for (int l = 0; l < strArry.length; l++) {
			System.out.print(strArry[l] + " ");

		}

	}

}
