  public boolean generateDocument(String characters, String document) {
    int[]tiles = new int[256];
		for (int i=0; i<characters.length();i++) {
			int c = characters.charAt(i);
			tiles[c]++;
		}
		for (int i=0; i<document.length();i++) {
			int c = document.charAt(i);
			tiles[c]--;
			if (tiles[c]<0)
				return false;
		}
    return true;
  }