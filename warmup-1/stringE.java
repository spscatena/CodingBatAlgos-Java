
// Return true if the given string contains between 1 and 3 'e' chars.


// stringE("Hello") → true
// stringE("Heelle") → true
// stringE("Heelele") → false

public boolean stringE(String str) {
  int eCount = 0;
  for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
          eCount++;
      }
  }
  if ((eCount >= 1) && (eCount<= 3)) {
      return true;
  }
  return false;
}
