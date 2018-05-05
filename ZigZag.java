class ZigZag {
  public static void main(String[] args){
      String input = "PAYPALISHIRING";
      int numRows = 4;
      ZigZag t = new ZigZag();
      System.out.println(t.convert(input, numRows));
  }
  
  public String convert(String s, int numRows) {
      String[] zigzag = new String[numRows];      
      int stringLength = s.length();
      int index = 0;      
            
      for(int i = 0; i<numRows; i++){
        zigzag[i] = "";
      }
      
      while(index<s.length()){
        for(int i = 0; i<numRows; i++){                   
          if(index < s.length()){
            zigzag[i] += s.charAt(index);
          }
          
          index++;
        }
        
        for(int i = (numRows-2); i>0; i--){                   
          if(index < s.length()){
            zigzag[i] += s.charAt(index);          
          }
          
          index++;
        }
        
      }
      
      for(int i = 1; i<numRows; i++){
        zigzag[0] += zigzag[i];
        zigzag[i] = "";
      }
      
      return zigzag[0];
  }
}