package guru.sfg.beer.order.service.testcomponents;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class BeerOrderValidationListener {
//    private final JmsTemplate jmsTemplate;
//
//    @JmsListener(destination = JmsConfig.VALIDATE_ORDER_QUEUE)
//    public void list(Message msg) {
//        boolean isValid = true;
//        boolean sendResponse = true;
//
//        ValidateOrderRequest request = (ValidateOrderRequest) msg.getPayload();
//
//        if (Objects.equals(request.getBeerOrder().getCustomerRef(), "fail-validation")) {
//            isValid = false;
//        }
//
//        //set cancel error
//        if (Objects.equals(request.getBeerOrder().getCustomerRef(), "dont-validate")) {
//            sendResponse = false;
//        }
//
//        if (sendResponse) {
//            jmsTemplate.convertAndSend(JmsConfig.VALIDATE_ORDER_RESPONSE_QUEUE,
//                    ValidateOrderResult.builder()
//                            .isValid(isValid)
//                            .orderId(request.getBeerOrder().getId())
//                            .build());
//        }
//    }
}
