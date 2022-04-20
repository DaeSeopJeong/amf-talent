package com.demo.talent.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Payment {

    String method;
    String status;
    String pg;              //"html5_inicis"
    String pay_method;      //"card"
    String merchant_uid;    //"ORD20180131-0000011"
    String name;            //견적서명 "영어 비대면 교육"
    String amount;          //금액 64900
    String buyer_email;     //구매자 email "gildong@gmail.com"
    String buyer_name;      //구매자이름 "홍길동"
    String buyer_tel;       //구매자 전화번호 "010-4242-4242"
    String buyer_addr;      //구매자 주소 "서울특별시 강남구 신사동"
    String buyer_postcode;  //구매자 우편번호 "01181"

    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPg() {
        return pg;
    }
    public void setPg(String pg) {
        this.pg = pg;
    }
    public String getPay_method() {
        return pay_method;
    }
    public void setPay_method(String pay_method) {
        this.pay_method = pay_method;
    }
    public String getMerchant_uid() {
        return merchant_uid;
    }
    public void setMerchant_uid(String merchant_uid) {
        this.merchant_uid = merchant_uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getBuyer_email() {
        return buyer_email;
    }
    public void setBuyer_email(String buyer_email) {
        this.buyer_email = buyer_email;
    }
    public String getBuyer_name() {
        return buyer_name;
    }
    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }
    public String getBuyer_tel() {
        return buyer_tel;
    }
    public void setBuyer_tel(String buyer_tel) {
        this.buyer_tel = buyer_tel;
    }
    public String getBuyer_addr() {
        return buyer_addr;
    }
    public void setBuyer_addr(String buyer_addr) {
        this.buyer_addr = buyer_addr;
    }
    public String getBuyer_postcode() {
        return buyer_postcode;
    }
    public void setBuyer_postcode(String buyer_postcode) {
        this.buyer_postcode = buyer_postcode;
    }

    
}
