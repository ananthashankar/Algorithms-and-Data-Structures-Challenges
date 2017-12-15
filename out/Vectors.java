import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/// combination of all words
public class Vectors {
	
	public static ArrayList<String> recursiveFunc(Vector<Vector<String>> inp){
		
		ArrayList<String> result = new ArrayList<>();
		
		// return nothing if vector empty
		if(inp.size() == 0){
			return null;
		}
		
		// if inp vector size is 1 then
		if(inp.size() == 1){
			for(String word : inp.get(0)){
				result.add(word);
			}
			return result;
		}
		
		
		// call recursive function for each word in first vector
		for(int i = 0; i<inp.elementAt(0).size(); i++){
			int traverseCount = 0;
			// Collect first word from row to concatenate
			String row1 = inp.elementAt(0).elementAt(i);
			result = recursiveCalc(inp.subList(1, inp.size()), row1, traverseCount, result);
		}
		
		return result;
	}
	
	// recursive function that traverse through each 
	//index recursively until all index are visited
	public static ArrayList<String> recursiveCalc(List<Vector<String>> inp, String row1, 
			int traverseCount, ArrayList<String> result){
		
		if(traverseCount == inp.size()){
			result.add(row1);
		} else {
			
			for(String word : inp.get(traverseCount)){
				String tmp = row1 + " " + word;
				recursiveCalc(inp, tmp, traverseCount+1, result);
				tmp = row1;
			}
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test vector1
		Vector<String> vec1 = new Vector<String>();
		vec1.add("A1");
		vec1.add("A2");
		
		// test vector2
		Vector<String> vec2 = new Vector<String>();
		vec2.add("B1");
		vec2.add("B2");
		vec2.add("B3");
		
		// test vector3
		Vector<String> vec3 = new Vector<String>();
		vec3.add("C1");
		vec3.add("C2");
		vec3.add("C3");
		vec3.add("C4");
		
		// test accumulating vector
		Vector<Vector<String>> vecFinal = new Vector<>();
		vecFinal.add(vec1);
		vecFinal.add(vec2);
		vecFinal.add(vec3);
		
		// Call function to
		ArrayList<String> result = recursiveFunc(vecFinal);
		
		// printing result
		for(String res : result){
			System.out.println(res);
		}

	}

}
