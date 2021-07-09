  public static List<Integer> spiralTraverse(int[][] array) {
		List<Integer> output = new ArrayList<Integer>();

		
		int rowStart = 0, colStart = 0, rowEnd = array.length-1, colEnd = array[0].length-1;		
		
		while (rowStart <= rowEnd && colStart <= colEnd){
			for (int co=colStart; co <= colEnd; co++)
				output.add(array[rowStart][co]);
			
			for (int ro=rowStart+1; ro <= rowEnd; ro++)
				output.add(array[ro][colEnd]);
			
			for (int co=colEnd-1; co >= colStart; co--) {
				if(rowStart ==rowEnd) break;
				output.add(array[rowEnd][co]);
			}
			
			for (int ro=rowEnd-1; ro > rowStart; ro--){
				if(colStart ==colEnd) break;
				output.add(array[ro][colStart]);
			}	
			rowStart++;
			rowEnd--;
			colStart++;
			colEnd--;		
		}
    return output;
  }