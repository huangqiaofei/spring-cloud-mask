package com.qiao.getway.configuration.fallback;


import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author huangqf
 * @date: 2019/6/29 14:28
 * @description:
 * @email 244154988@qq.com
 */
@Component
public class CustomerFallback implements FallbackProvider {

    private static final String SERVICE_CUSTOMER = "mask-user";

    @Override
    public String getRoute() {
        return SERVICE_CUSTOMER;
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() {
                return HttpStatus.OK.value();
            }

            @Override
            public String getStatusText() {
                return HttpStatus.OK.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() {
                return new ByteArrayInputStream(("The " + SERVICE_CUSTOMER + " is unavailable.").getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return headers;
            }
        };
    }
}
