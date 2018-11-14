package com.simple.alipay;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create By S I M P L E On 2018/11/14 16:22:28
 */
@Controller
@RequestMapping("/ali/")
public class AlipayTest {

    @RequestMapping(value = "pay", method = RequestMethod.GET)
    @ResponseBody
    public void pay() {
        AlipayClient alipayClient = new
                DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do","2016081500253860","请复制上一步中生成的密钥中的商户应用私钥","json","utf-8",
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnoSvDFYSoxA90STnKcsdz0VGtXW9qs9wYgKMhi0yKQtGgvFpB+YBz2iTZqXl/IV5htj9Ec4RFFiCPOPy18ACGuMgNJnF8obxTqx98pnRcgakvUB45si2HbZWdGF9kYntfS7InQiRo3G4zo4oo5JWJ0U+7n++12q8lWmWqDA1Pq4pJK7VXSIMKTlCP0l4QdyZgvemuLYx2bgcZogKjugv5mmCKvTpb7KV/E2tmhoLDUuyH4LNVa2oqXQ2owj3zW798EkXTE/NvoSncIGp9KK4QgfUx3HMMRGaq0lPsK/0jhpX5XAocQ1kIdCWNLh2u8kM/8NH4jB2wSYSM2k6grJopQIDAQAB","RSA2" );
    }
}