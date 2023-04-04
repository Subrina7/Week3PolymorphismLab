import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StationaryShopTest {

    StationaryShop stationaryShop;

    @BeforeEach
    public void setUp(){
        stationaryShop = new StationaryShop("Rymans");
    }
    @Test
    public void shopStartsEmpty(){
        assertThat(stationaryShop.countStock()).isEqualTo(0);
    }
    @Test
    public void gettersAndSetters(){
        assertThat(stationaryShop.getName()).isEqualTo("Rymans");
        assertThat(stationaryShop.getTill()).isEqualTo(0);
        // cant test arraylist..? assertThat(stationaryShop.getStock()).isEqualTo(0);
        stationaryShop.setName("WHsmith");
        stationaryShop.setTill(55.20);
        assertThat(stationaryShop.getName()).isEqualTo("WHsmith");
        assertThat(stationaryShop.getTill()).isEqualTo(55.20);
        // stationaryShop.setStock();
    }
    @Test
    public void canAddStock(){
        Pen pen1 = new Pen("Handwriting pen", "Black", 3, false);
        Pen pen2 = new Pen("Fountain pen", "Blue", 3, false);
        stationaryShop.addStock(pen1);
        stationaryShop.addStock(pen2);
        assertThat(stationaryShop.countStock()).isEqualTo(2);
    }

    @Test //INTERFACE METHOD OMG??
    public void canEngrave(){
        Pen pen1 = new Pen("Handwriting pen", "Black", 3, false);
        assertThat(pen1.addEngraving("Subrina")).isEqualTo("Engraving added for Subrina");
        Calculator calc = new Calculator("Casio", "Blue", 10, true);
        assertThat(calc.addEngraving("Imaan")).isEqualTo("Engraving added for Imaan");
    }

    @Test // OVERLOADING INTERFACE METHOD IN CALCULATOR..???!!
    public void canOverloadEngraving(){
        Calculator calc = new Calculator("Digital", "Black", 7, false);
        assertThat(calc.addEngraving("Subrina", "SF123")).isEqualTo("Engraving added for Subrina, student number: SF123");


    }




}
