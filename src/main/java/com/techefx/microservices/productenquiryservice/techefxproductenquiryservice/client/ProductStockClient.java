package com.techefx.microservices.productenquiryservice.techefxproductenquiryservice.client;

import com.techefx.microservices.productenquiryservice.techefxproductenquiryservice.beans.ProductEnquiryBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="techefx-product-stock-service", url="localhost:8800")
@FeignClient(name="techefx-product-stock-service")

public interface ProductStockClient {

   @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductEnquiryBean checkProductStock(@PathVariable String productName,
                                              @PathVariable String productAvailability);

}
