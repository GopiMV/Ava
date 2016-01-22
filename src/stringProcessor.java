
public class stringProcessor {
	String query;
	
	public stringProcessor(String query){
		this.query = query;
	}
	
	public void stringFlow(){
		
		if(this.query.contains("search")){
			String toGoogle = this.query.replaceAll("search ","");
			runProgram program = new runProgram();
			program.googleSearch(toGoogle);
		} else if(this.query.contains("chrome")){
        	runProgram program = new runProgram();
        	program.executeChrome();
        } else if (this.query.contains("game")){
        	runProgram program = new runProgram();
        	program.executeCSS();
        } else if (this.query.contains("music")){
        	runProgram program = new runProgram();
        	program.executeSpotify();
        } else if (this.query.contains("mail")){
        	runProgram program = new runProgram();
        	program.openMail();
        } else if(this.query.contains("find")){
			String toGoogle = this.query.replaceAll("find ","");
			runProgram program = new runProgram();
			program.googleMap(toGoogle);
        }
	}

}
