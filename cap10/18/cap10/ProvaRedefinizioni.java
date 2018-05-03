package cap10;

class File {
	protected File getNewFile() throws Exception { return null;}	
}

class TextFile extends File{
	@Override	
	protected File getNewFile() throws Exception { return null;}	
}
class DocFile extends File{
	@Override	
	public TextFile getNewFile(){ return null;}	
}


public class ProvaRedefinizioni {

}
