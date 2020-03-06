import java.util.ArrayList;
import java.util.Date;

public class Venda {
	private Date date;
	private ArrayList listaItens = new ArrayList();
	
	public Venda(Date date, ArrayList listaItens) {
		super();
		this.date = date;
		this.listaItens = listaItens;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList getListaItens() {
		return listaItens;
	}

	public void setListaItens(ArrayList listaItens) {
		this.listaItens = listaItens;
	}
	
	
	
}
