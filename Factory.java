public class Factory {

	public Factory(){
		
	}
	
	public iTree choose(String comp){
		switch(comp){
		case "1":
			return new TwoThreeTree();
		case "2":
			return new SplayBST();
		}
		return null;

	}
}