package cacaniquel;

public class CacaNiquel {
	
	static ListaCircular lc1 = new ListaCircular();
	static ListaCircular lc2 = new ListaCircular();
	static ListaCircular lc3 = new ListaCircular();
  
  	public static void preencherTambores(String[] tambor1,String[] tambor2,String[] tambor3){
            
        
        for (String tbr1 : tambor1) {
            
               lc1.inserir(tbr1);
            
        }
        
        for (String tbr2 : tambor2) {
            
               lc2.inserir(tbr2);
            
        }
        
        for (String tbr3 : tambor3) {
            
               lc3.inserir(tbr3);
            
        }
                 
        
	}

    public static String girarTambores(int nDesloc1, int nDesloc2, int nDesloc3) {
          
      String resultado = "";
       
      No visor1 = lc1.primeiro;
        
      No visor2 = lc2.primeiro;
        
      No visor3 = lc3.primeiro;
        
      for(int i = 0; i < nDesloc1; i++){
          
            visor1 = visor1.next;
          
      }
        
      for(int i = 0; i < nDesloc2; i++){
          
            visor2 = visor2.next;
           
      }
        
      for(int i = 0; i < nDesloc3; i++){
          
            visor3 = visor3.next;
           
      }
        
      resultado = visor1.data + " " + visor2.data + " " + visor3.data;
        
      return resultado;

    }

}
