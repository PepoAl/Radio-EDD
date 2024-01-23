import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RadioTest{
    @Test
    public void radio(){

        Radio radio = new Radio();
        assertEquals(530.0f,radio.getCurrentFrequency());
        
    }
}