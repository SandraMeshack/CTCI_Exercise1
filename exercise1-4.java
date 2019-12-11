boolean isPermutationOfPalindrome(String phrase) {
int countodd = 0;
int[] table = new int[Character.getNumericValue('z')-Character.getnumericValue('a')+1];
for(char c : phrase.toCharArray()){
int x=getCharNumber(c);
if(x != -1) {
table[x]++;
if (table[x] % 2 == 1){
countOdd++;
} else {
countOdd--;
}
}
}
return countOdd <= 1;
}