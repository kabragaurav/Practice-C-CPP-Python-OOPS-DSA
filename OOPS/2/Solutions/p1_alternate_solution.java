import java.util.*;

class find{
	static void maxRepeat(String s){ 
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        char[] s1 = s.toCharArray(); 
  
        for (char c : s1) { 
            if (mp.containsKey(c)){ 
                mp.put(c, mp.get(c) + 1); 
            } 
            else{ 
                mp.put(c, 1); 
            } 
        } 
 	System.out.println("Frequencies::");
        for (Map.Entry entry : mp.entrySet()) { 
            System.out.printlney() + " " + e(entry.getKntry.getValue()); 
        } 
    } 
  
}

class p1{
	public static void main(String[] args){
		String s;
		char res;
		System.out.print("Enter String::");
		Scanner scan=new Scanner(System.in);
		s=scan.nextLine();
		find obj=new find();
		obj.maxRepeat(s);
	}

}
