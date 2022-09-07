package guru.sfg.beer.order.service.testcomponents;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class BeerOrderAllocationListener {
//    private final JmsTemplate jmsTemplate;
//
//    @JmsListener(destination = JmsConfig.ALLOCATE_ORDER_QUEUE)
//    public void list(Message msg) {
//        AllocateOrderRequest request = (AllocateOrderRequest) msg.getPayload();
//        boolean pendingInventory = false;
//        boolean allocationError = false;
//        boolean sendResponse = true;
//
//        //set pending inventory
//        if (Objects.equals(request.getBeerOrderDto().getCustomerRef(), "partial-allocation")) {
//            pendingInventory = true;
//        }
//
//        //set allocation error
//        if (Objects.equals(request.getBeerOrderDto().getCustomerRef(), "fail-allocation")) {
//            allocationError = true;
//        }
//
//        //set cancel error
//        if (Objects.equals(request.getBeerOrderDto().getCustomerRef(), "dont-allocate")) {
//            sendResponse = false;
//        }
//
//        boolean finalPendingInventory = pendingInventory;
//
//        request.getBeerOrderDto().getBeerOrderLines().forEach(beerOrderLineDto -> {
//            if (finalPendingInventory) {
//                beerOrderLineDto.setQuantityAllocated(beerOrderLineDto.getOrderQuantity() - 1);
//            } else {
//                beerOrderLineDto.setQuantityAllocated(beerOrderLineDto.getOrderQuantity());
//            }
//        });
//
//        if (sendResponse) {
//            jmsTemplate.convertAndSend(JmsConfig.ALLOCATE_ORDER_RESPONSE_QUEUE,
//                    AllocateOrderResult.builder()
//                            .beerOrderDto(request.getBeerOrderDto())
//                            .pendingInventory(pendingInventory)
//                            .allocationError(allocationError)
//                            .build());
//        }
//    }
}
