package Factory;

import junit.framework.TestCase;

public class LedgerFactoryTest extends TestCase {
    private LedgerFactory ledgerFactory;

    public void setUp() throws Exception {
        ledgerFactory=new LedgerFactory();
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testGetLedger() {
      String dateRecorded="12/04/1999" ;
      ledgerFactory.getClass();
        System.out.println(ledgerFactory);
    }
}