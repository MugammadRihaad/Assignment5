package Factory;

import Domain.Ledger;
import util.Misc;

public class LedgerFactory {

    public static Ledger getLedger(String dateRecorded){
        return new Ledger.Builder().cash(Misc.generatedId())
                            .dateRecorded(dateRecorded)
                             .build();
    }
}
