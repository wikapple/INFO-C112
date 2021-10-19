public class CodecademyTesting {
	public static void main(String[] args) {
		String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogigate"}};
		
		//Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
		int characterCount = 0;

    for (String[] wordDataRow : wordData){
      for (String word : wordDataRow){
        characterCount += word.length();
      }
    }


		System.out.println(characterCount);
		
		//Using nested while loops, iterate through all of the elements in the 2D array and print them to the console using the format: word [row][column]. The formatted print statement has been provided.

  int i = 0, j = 0;
    while (i < wordData.length){
      j = 0;
      while (j < wordData[i].length){
        				System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
        j++;
      }
    }
		



	}
	
}