
class Main {

  public boolean isAnagram(String word1, String word2) {
	  return false;
  }

  public static void main(String[] args) {
    Main app = new Main();

    if( app.isAnagram("tap", "pat") ) {
    	System.out.println("anagram");
    } else {
    	System.out.println("no anagram");
    }
  }

}