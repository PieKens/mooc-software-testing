package tudelft.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class InvoiceFilterTest {
    @Test void filterInvoices() {

        Invoice mauricio = new Invoice("Mauricio", 20.0);
        Invoice arie = new Invoice("Arie", 300.0);
        InvoiceDao dao = Mockito.mock(InvoiceDao.class);

        InvoiceFilter filter = new InvoiceFilter();
        List<Invoice> result = filter.filter();

        Assertions.assertEquals(mauricio, result.get(0));
        Assertions.assertEquals(1, result.size());

    }

}
