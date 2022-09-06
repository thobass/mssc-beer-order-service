package guru.sfg.beer.order.service.services;

import guru.sfg.brewery.model.CustomerPagedList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerPagedList listCustomers(Pageable pageable) {
        return null;
    }
}
