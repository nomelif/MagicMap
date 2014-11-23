/*

By Théo Friberg under GNU GPL v. 3


Using MagicMap:

MagicMap is invoked by typing java MagiMap.class -cli [path to input file] [path to output file]
*/

public class Main {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		// See if invoked with -cli -argument
		
		if(arg.length > 0){
			
			// App is invoked with -cli -argument
			
			if(args[0] == "-cli"){
				
				// Does the app get the right arguments?
				
				boolean right_args = false;
				
				if(args.length > 2){
					
					/*
					
					Processing of the image will be here and will be implemented shortly
					
					*/
					
					
				}else{
					
					// Too few arguments, app was invoked incorrectly
					
					right_args = false;
				}
				
				// If the app wasn't invoked correctly
				
				if(right_args == false){
					
					System.out.println("Usage: java MagicMap.class -cli [input file] [output file]");
				}
				
			}
		}
	
	
	}

}
