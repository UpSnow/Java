package arthur.atrativo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProgramaTiturecoTest {

    @Test
    public void testaSeTemMain() {
        ProgramaTitureco programa = new ProgramaTitureco();
        ProgramaTitureco.main(new String[] {});
    }
}
