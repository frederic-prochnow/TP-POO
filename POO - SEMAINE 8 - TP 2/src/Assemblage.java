import java.util.ArrayList;
import java.util.List;
/**
 * Class abstraite Assemblage
 * @author Frédéric
 * Semaine 8 tp2
 */
public abstract class Assemblage {
	
	protected List <Assemblable> list = new ArrayList <>();
	
	/**
	 * @param pi
	 */
	public void add(Assemblable a){
		list.add(a);
	}
	
	/**
	 * @param pi
	 */
	public void remove(Assemblable a) {
		list.remove(a);
	}
	
}
