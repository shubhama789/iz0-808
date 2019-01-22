package q53;

interface Exportable{
	 void export();
}
class Tool implements Exportable{

	
	 public void export() {				// Compilation error if protected
		System.out.println("Tool::export");
		
	}
	
}

public class REportToll extends Tool implements Exportable{
	
	 public void export() {
		System.out.println("Rtoll::export");
	}

	 public static void main(String[] args) {
		Tool t1 = new REportToll();
		Tool t2 = new Tool();
		callExport(t1);
		callExport(t2);
	}

	public static void callExport(Exportable exportable) {
		// TODO Auto-generated method stub
		exportable.export();
	}
}
