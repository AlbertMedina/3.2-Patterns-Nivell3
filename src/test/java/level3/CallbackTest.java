package level3;

import level3.gateway.PaymentGateway;
import level3.payment.BankAccountPayment;
import level3.payment.CreditCardPayment;
import level3.payment.PaypalPayment;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CallbackTest {

    @Test
    void shouldPaymentGatewayWorkWithCreditCard() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        PaymentGateway paymentGateway = new PaymentGateway();
        paymentGateway.pay(99.99, new CreditCardPayment("test-card-number"));
        assertEquals("Processing payment..." + System.lineSeparator() + "Paying 99.99€ with credit card: test-card-number" + System.lineSeparator() + "Payment completed", outputStream.toString().trim());
    }

    @Test
    void shouldPaymentGatewayWorkWithPaypal() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        PaymentGateway paymentGateway = new PaymentGateway();
        paymentGateway.pay(99.99, new PaypalPayment("test-email"));
        assertEquals("Processing payment..." + System.lineSeparator() + "Paying 99.99€ with Paypal: test-email" + System.lineSeparator() + "Payment completed", outputStream.toString().trim());
    }

    @Test
    void shouldPaymentGatewayWorkWithBankAccount() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        PaymentGateway paymentGateway = new PaymentGateway();
        paymentGateway.pay(99.99, new BankAccountPayment("test-iban"));
        assertEquals("Processing payment..." + System.lineSeparator() + "Paying 99.99€ with bank account: test-iban" + System.lineSeparator() + "Payment completed", outputStream.toString().trim());
    }
}
