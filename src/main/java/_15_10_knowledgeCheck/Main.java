package _15_10_knowledgeCheck;

public class Main {



public static int mystery(int[] elements, int target) {
	   for (int j = 0; j < elements.length; j++) {
	      if (elements[j] == target) {
	         return j;
	      }
	  }
	  return -1;
	}
}