package test.domain;

import domain.Mascota;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MascotaTest {
    private Mascota mascota;
    
    @Before
    public void init(){
        this.mascota = new Mascota();
    }

    @Test
    public void mascotaContentaPuedeJugar(){
        Assert.assertTrue(this.mascota.podesJugar());
    }

    @Test(expected = Exception.class)
    public void unTestQueLanzaExcepcion() throws Exception {
        throw new Exception();
    }
}
