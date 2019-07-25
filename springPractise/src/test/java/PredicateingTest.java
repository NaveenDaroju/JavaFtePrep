/*
import org.junit.Test;

import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.*;

public class PredicateingTest {
    public void testing() {
        String stringStream = Optional.ofNullable(getBillSummaryResponse)
                .map(GetAggregatedCustomerInfoResponse::getCustomer)
                .map(Customer::getFraudLockDetails)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(isFraudLock())
                .map(FraudLockDetail::getFraudLockIndicator)
                .findFirst()
                .toString();
    }

    @Test
    public static void testSetup() {

    }

    public void insertBlankPages(File inputFile, String outputFile, final int OFFSET) {
        try (PDDocument newDocument = createNewDocument();
             PDDocument oldDocument = createOldDocument(inputFile)) {

            List<PDPage> oldPages = getAllPages(oldDocument);

            oldPages.stream()
                    .limit(oldPages.size() - OFFSET)
                    .forEach(page -> {
                        newDocument.addPage(page);
                        newDocument.addPage(new PDPage(page.getMediaBox()));
                    });

            newDocument.save(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (COSVisitorException e) {
            e.printStackTrace();
        }
    }


}*/
