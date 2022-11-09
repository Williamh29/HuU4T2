public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        String searchStringLast = searchString.toLowerCase();
        String characterLast = character.toLowerCase();
        int characterCount = 0;
        for (int i = 0; i < searchStringLast.length(); i++) {
            String currentCharacter = searchStringLast.substring(i, i + 1);
            if (currentCharacter.equals(characterLast)) {
                characterCount++;
            }
        }
        return characterCount;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        String newString = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            String character = origString.substring(i, i+1);
            newString += character;
        }
        return newString;
    }
}