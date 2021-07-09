	static char crypt(char ch, int key){
		int newKey=key+ch;
		while (newKey>'z')
			newKey-=26;
		System.out.println(" "+newKey + " "+neww);
		return (char)newKey;
		
	}
  public static String caesarCypherEncryptor(String str, int key) {
    String s="";
		for (int i=0; i<str.length();i++){
			s+= crypt(str.charAt(i),key);
		}
    return s;
  }