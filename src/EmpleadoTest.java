import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	Empleado empleado = new Empleado();
	Empleado.TipoEmpleado tipo;
	
	@Test
    public void testVendedorVentas999() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 999, 0);

        assertEquals(2000, resultado);
    }

    @Test
    public void testVendedorVentas1000() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1000, 0);

        assertEquals(2100, resultado);
    }

    @Test
    public void testVendedorVentas1001() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1001, 0);

        assertEquals(2100, resultado);
    }

    @Test
    public void testVendedorVentas1499() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1499, 0);

        assertEquals(2100, resultado);
    }

    @Test
    public void testVendedorVentas1500() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1500, 0);

        assertEquals(2200, resultado);
    }

    @Test
    public void testVendedorVentas1501() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1501, 0);

        assertEquals(2200, resultado);
    }

    @Test
    public void testEncargadoVentas999() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 999, 0);

        assertEquals(2500, resultado);
    }

    @Test
    public void testEncargadoVentas1000() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1000, 0);

        assertEquals(2600, resultado);
    }

    @Test
    public void testEncargadoVentas1001() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1001, 0);

        assertEquals(2600, resultado);
    }

    @Test
    public void testEncargadoVentas1499() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1499, 0);

        assertEquals(2600, resultado);
    }

    @Test
    public void testEncargadoVentas1500() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1500, 0);

        assertEquals(2700, resultado);
    }

    @Test
    public void testEncargadoVentas1501() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1501, 0);

        assertEquals(2700, resultado);
    }

    @Test
    public void testHorasExtra() {
        float resultado = empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1000, 5);

        assertEquals(2250, resultado);
    }


    @Test
    public void testNominaNeta2099() {
        float resultado = empleado.calculoNominaNeta(2099);

        assertEquals(2099, resultado);
    }
    
    @Test
    public void testNominaNeta2100() {
        float resultado = empleado.calculoNominaNeta(2100);

        assertEquals(2100, resultado);
    }

    @Test
    public void testNominaNeta2101() {
        float resultado = empleado.calculoNominaNeta(2101);

        assertEquals(1785.85009765625, resultado);
    }

    @Test
    public void testNominaNeta2499() {
        float resultado = empleado.calculoNominaNeta(2499);

        assertEquals(2124.150146484375, resultado);
    }

    @Test
    public void testNominaNeta2500() {
        float resultado = empleado.calculoNominaNeta(2500);

        assertEquals(2125, resultado);
    }

    @Test
    public void testNominaNeta2501() {
        float resultado = empleado.calculoNominaNeta(2501);

        assertEquals(2050.820068359375, resultado);
    }
    
}
