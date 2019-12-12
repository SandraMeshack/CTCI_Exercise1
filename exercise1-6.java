String compress(String str) {
int finalLength = countCompression(str);
if (finalLength >= str.length()) return str;

StringBuilder compressed = new StringBuilder(finalLength);
int countConsecutive = 0;
for (int i = 0; i < str.length(); i++) {
countConsecutive++;

if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
compressed.append(str.charAt(i));
compressed.append(countConsecutive);
countConsecutive = 0;
}
}
retun compressed.toString();
}
int countCompression(String str) {
int compressedLength = 0;
int countConsecutive = 0;
for (int i = 0; i < str.length(); i++){
countConsecutive++;

if (i +1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
compressedLength += 1 + String.valueOf(countConsecutive).length();
countConsecutive=0;
}
}
return compressedLength;
}
