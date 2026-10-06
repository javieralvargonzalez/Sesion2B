
public class Empleado {	

	public enum TipoEmpleado {Vendedor, Encargado};
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		float salarioBase = 0;

        if (tipo == TipoEmpleado.Vendedor) 
        {
            salarioBase = 2000;
        } 
        else if(tipo == TipoEmpleado.Encargado) 
        {
            salarioBase = 2500;
        }
        else {return -1;}

        if (ventasMes >= 1500) 
        {
            salarioBase += 200;
        } 
        else if (ventasMes >= 1000) 
        {
            salarioBase += 100;
        }

        salarioBase = salarioBase + horasExtra * 30;

        return salarioBase;
		
	}
	
	public float calculoNominaNeta(float nominaBruta) 
	{
	
		float retencion = 0;

        if (nominaBruta > 2500) 
        {
            retencion = 0.18f;
        } 
        else if(nominaBruta > 2100)
        {
            retencion = 0.15f;
        }
        else if(nominaBruta < 0) {return -1;}

        return nominaBruta * (1 - retencion);
    }
}
	
