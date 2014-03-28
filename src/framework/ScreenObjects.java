package framework;

import screens.Screen1;


public class ScreenObjects {

		
		private static Screen1  screen1;
				
		public static void initializeScreenObjects(){			
			screen1=new Screen1();					
		}
		
		/*** Getter Methods***/
		public static Screen1 screen1(){
			return screen1;
		}
		
	
}
