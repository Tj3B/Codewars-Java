public String spinWords(String sentence) {
    String p = "";
    String [] str = sentence.split(" ");
    int c = str.length;
    for(int i = 0; i < c; i++ ){
      if(str[i].length() < 5){
        p += str[i] + " ";
      }
      else{
        for(int j = str[i].length() -1; j >= 0; j--){
          if( j== str[i].length() -1){
            p += str[i].substring(j) ;
          }
          else{p += str[i].substring(j,j+1);}
        }
        p += " ";
      }
      
    }
    String poop = p.substring(0,p.length()-1);
    return poop;
  }
