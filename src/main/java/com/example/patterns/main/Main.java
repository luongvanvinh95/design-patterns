package com.example.patterns.main;

import com.google.gson.Gson;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String json = "{\"cusInfo\":[{\"companyName\":\"Tập Đoàn M\",\"email\":\"starwars.tcbs@gmail.com\",\"password\":\"0303576603\",\"custodycd\":\"xxxxxxx899\",\"businessNo\":\"0303576603\",\"investmentBond\":\"0.00\",\"issuanceBond\":\"5174764.30\",\"cashin\":\"0.00\",\"cashout\":\"1694517.22\",\"netcash\":\"-1694517.22\"}],\"chartInvestByBond\":[],\"chartInvestByIssuer\":[],\"TableInvestment\":[],\"TableIssuance\":[],\"chartCashflow\":[{\"label\":[\"Tiền coupon sắp nhận\",\"Tiền tất toán sắp nhận\",\"Tiền coupon sắp trả\",\"Tiền đáo hạn sắp trả\",\"Tiền thuần\"],\"data\":[[\"0\",\"0.00\"],[\"0.00\",\"0.00\"],[\"0.00\",\"0.00\"],[\"0.00\",\"0.00\"],[\"0\",\"0.00\"]]}],\"chartCashflowByMonth\":[{\"label\":[\"December-23\",\"January-24\",\"February-24\",\"March-24\",\"April-24\",\"May-24\",\"June-24\",\"July-24\",\"August-24\",\"September-24\",\"October-24\",\"November-24\",\"December-24\"],\"dataset\":[{\"netCash\":[\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\"],\"cashIn\":[\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\"],\"cashOut\":[\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\",\"0.00\"]}]}],\"TableCashIn\":[],\"TableCashOut\":[]}";
        Gson gson = new Gson();
        Map<String, Object> mParams = gson.fromJson(json,  Map.class);
        System.out.println(mParams);
    }
}
