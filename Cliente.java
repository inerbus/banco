public class Cliente{
	
	private int idCliente;
	private String nombreCliente;
	private String Nit;
	
	public Cliente(){
		
	}
	
	public int getIdCliente(){
		return this.idCliente;
	}
	public void setIdCliente(int idCliente){
		this.idCliente=idCliente;
	}
	public String getNombreCliente(){
		return this.nombreCliente;
	}
	public void setNombreCliente(String nombreCliente){
		this.nombreCliente=nombreCliente;
	}
	public void setNit(String Nit){
		this.Nit=Nit;
	}
	public String getNit(){
		return this.Nit;
	}
}