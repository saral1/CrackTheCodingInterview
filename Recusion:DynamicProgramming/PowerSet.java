import java.util.*;

public class SubSets{
	/***Problem 8.4: Power Set
	
	Find all subsets of a set

	***/


	/***Solution
	
	Subsets of any given set just follow binary
		-ie for a set 1234
			-subsets are just
			- 0000 or {}
			- 0001 or {4}
			- 0010 or {3}
			- 0011 or {3,4}
			...
			- 1111 or {1,2,3,4}

	@return n/a
	***/
	public void printSubsets(int set[]){
		int n = set.length;
		for(int i=0; i<(1<<n); i++){
			System.out.print("{ ");
			for(int j=0; j<n; j++){
				//(1<<j) is a number with jth bit 1
				//so i(current number) AND with (1<<j)
				if((i & (1<<j)) > 0){
					System.out.print(set[j] + " ");
				}
			}
			System.out.println("}");
		}
	}

}