package io.zipcoder;

//import org.apache.commons.lang3.StringUtils;
/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int count = 0;
        /* for (int i = 0; i < input.length(); i++) {

        if ((Character.toLowerCase(input.charAt(i)) == 'y' || Character
                .toLowerCase(input.charAt(i)) == 'z')
                && i == input.length() - 1
                || !Character.isLetter(input.charAt(i + 1))) {
            count++;
        }
    } */

        String[] inputSplit = input.split( " ");
        for(String i : inputSplit) {
            if(i.endsWith("y") || i.endsWith("z")){
                count++;
            }
        }
        return count;

    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        String[] newStr = base.split(remove);
        String output = String.join("", newStr);
        return output;
    }



    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int isCount = 0;
        int notCount = 0;

        for( int i = 0; i < input.length() -1 ; i ++){
            if(input.charAt(i) == 'i' && input.charAt(i + 1) == 's')
            isCount++;
            if(input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't')
                notCount++;
        }

//        input = input.toLowerCase();
//        String[] isString = input.split("is");
//        isCount += isString.length;
//        String[] notString = input.split("not");
//        notCount += notString.length;
//         for()
        return (isCount == notCount);
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
//        input = " " + input + " "
      //  int gIs = 0;
     /*   if(input.charAt(0) == 'g' && input.charAt(1) != 'g'){
            return false;
        }if(input.charAt(input.length() -1) == 'g' && input.charAt(input.length() -2) != 'g'){
            return false;
        }

        for(int i = 1; i < input.length() -1; i++){
            if(input.charAt(i) == 'g') {
                if(input.charAt( i+1 ) != 'g' && (input.charAt(i -1) != 'g')){
                    return false;
                }

            }
        }
        return true; */
       for(int i = 0; i< input.length(); i++){
     if(input.charAt(i) == 'g' && input.charAt(i +1) == 'g' && input.charAt(i -1) != 'g'){
         return true;

     }}
       return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int counter = 0;
        for(int i = 0; i < input.length() -1 ; i++){
            if((input.charAt(i) == input.charAt(i +1) ) && (input.charAt(i) == input.charAt(i +2))){
                counter ++;
            }
        }
        return counter;
    }
}
