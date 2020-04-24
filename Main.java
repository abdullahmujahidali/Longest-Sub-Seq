import java.util.*;

class Main {

static int lengthOfLongestSubstring(String strin) {

int size = strin.length(); //get length of string

int result = 0; // count

// current index of character

Map<Character, Integer> map = new HashMap<>(); // hashmap to check

// try to extend the range [i, j]

for (int j = 0, i = 0; j < size; j++) {

if (map.containsKey(strin.charAt(j))) { // if it maps

i = Math.max(map.get(strin.charAt(j)), i); //

}

result = Math.max(result, j - i + 1); // increment in the result of length

map.put(strin.charAt(j), j + 1); // map string

}

return result;

}

public static void main(String[] args) {

Scanner sc= new Scanner(System.in);

String s=" ";

s= sc.nextLine();

System.out.println(lengthOfLongestSubstring(s));

}

}

IF YOU HAVE ANY QUERY PLEASE COMMENT DOWN BELOW
PLEASE GIVE A THUMBS UP

Comment 
