import java.util.*;
public class palindrom {
    public static void main(String[] agrs){
        // Scanner s =new Scanner(System.in);
        // System.out.print("Enter the String: ");
        // String str1=s.nextLine();
        // str1=str1. replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // String str2="";
        // for(int i=str1.length()-1;i>=0;i--){
        //     str2+=str1.charAt(i);
        // }
        // boolean a=str1.equals(str2);
        // if(a){
        //     System.out.println("String "+str1+" is a palindrom");
        // }
        // else{
        //     System.out.println("String "+str1+" is not a palindrom");
        // }
        // palindrom.substr();
        palindrom.longstr();
        //palindrom.longstrinanotherway();
        //s.close();
    }
    public static void substr(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input=s.nextLine();
        int count=0;
        int len=input.length();
        System.out.println("Plandromic sub Sequences/Strings ");
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String sub=input.substring(i,j);
                if(isPalindrome(sub)){
                    System.out.println(sub);
                    count++;
                }
            }
        }
        System.out.println("Total palindrome with Strings: "+count);
        s.close();
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left< right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void longstr(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input=s.nextLine();
        int n=input.length();
        int max=1;
        int start=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if( checkPal(input,i,j) && (j-i+1)>max){
                    start=i;
                    max=j-i+1;
                }
            }
        }
        String k=input.substring(start,start+max);
        int l=k.length();
        System.out.println("longest Substring of palindromic: "+k);
        System.out.println("length of Substring is: "+l);
        s.close();
    }
    public static boolean checkPal(String str,int left,int right){
        while(left< right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void longstrinanotherway(){
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scanner.nextLine();
		int n = s.length();
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			dp[i][i] = 1;
		}
		for (int len = 2; len <= n; len++) {
			for (int i = 0; i <= n - len; i++) {
				int j = i + len - 1;
				if (s.charAt(i) == s.charAt(j)) {
					if (len == 2)
						dp[i][j] = 2;
					else
						dp[i][j] = dp[i + 1][j - 1] + 2;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}
		int i = 0, j = n - 1;
		char[] lps = new char[dp[0][n - 1]];
		int start = 0, end = lps.length - 1;
		while (i <= j) {
			if (s.charAt(i) == s.charAt(j)) {
				lps[start] = s.charAt(i);
				lps[end] = s.charAt(j);
				i++;
				j--;
				start++;
				end--;
			} else if (dp[i + 1][j] > dp[i][j - 1]) {
				i++;
			} else {
				j--;
			}
		}
		System.out.println("Length of Longest Palindromic Subsequence: " + dp[0][n - 1]);
		System.out.println("Longest Palindromic Subsequence: " + new String(lps));
		scanner.close();
    }
}
