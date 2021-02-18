
// Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


// delDel("adelbc") → "abc"
// delDel("adelHello") → "aHello"
// delDel("adedbc") → "adedbc"

public String delDel(String str) {
  if (str.length() <= 3) {
        return str;
  }
  char beginning = str.charAt(0);
  String middle = str.substring(1,4);
  String end = str.substring(4, str.length());
  
  if (middle.equals("del")) {
    return beginning + end;
  }

  return str;
}
