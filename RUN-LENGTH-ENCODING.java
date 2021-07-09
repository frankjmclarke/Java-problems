  public String runLengthEncoding(String string) {
	String out="";
	int pos = 0;
    while(pos < string.length()){
			int count = 0;
			boolean isRepeat = false;
			while (pos != string.length()-1 &&
						 string.charAt(pos)==string.charAt(pos+1)){
				isRepeat = true;
				count++;
				pos++;
				if (count == 8)
					break;
				if (pos == string.length())
					break;
			}
			out += count+1;
			out += string.charAt(pos);	
			pos++;
		}
    return out;
  }