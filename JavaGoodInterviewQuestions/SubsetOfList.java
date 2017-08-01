import java.util.*;
import java.lang.*;

public class SubsetOfList{


List<Integer> primaryList = new ArrayList<Integer>(Arrays.asList(1,2,33,10));
TreeSet<Integer> answer ;
// 2^4 --> subsets possible. 
// With brute force the complexity is 2^n.


public void SubsetOfList(){
	getSubsetFromPrimaryList(primaryList,null,null);
}
public TreeSet<Integer> getSubsetFromPrimaryList(List<Integer> parent, List<Integer> listLeftHalf ,List<Integer> listRightHalf){
int totalSize = parent.size();
int mid = totalSize/2;


//  Divide and Conquer. 

if(listLeftHalf.size()==1){
	TreeSet<Integer> answer1 = new TreeSet<Integer>();
		answer1.add(null);
		
		answer1.add(listLeftHalf.get(0));
		return answer1;
	}



if(listRightHalf.size()==1){
	 TreeSet<Integer> answer2 = new TreeSet<Integer>();
		
	answer2.add(null);
		
		answer2.add(listLeftHalf.get(0));
		return answer2;
	}



 answer.add(getSubsetFromPrimaryList(parent.subList(0,mid),parent.subList(0,mid/2),parent.subList(mid/2,mid)));

 answer.add(getSubsetFromPrimaryList(parent.subList(mid, mid+ mid/2),parent.subList(0,mid/2),parent.subList(mid/2,mid)));

 return answer;
}


public static void main(String[] args){
	SubsetOfList listSubset = new SubsetOfList();

	// getSubsetFromPrimaryList(primaryList,null,null);
}
}