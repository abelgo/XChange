package com.xeiam.xchange.coinbaseex.dto.trade;

public class CoinbaseExSendMoneyResponse {

    public static class Data {
        private final String id;

        public Data(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }

    private final Data data;

    public CoinbaseExSendMoneyResponse(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "CoinbaseExSendMoneyResponse{" +
                "data=" + data +
                '}';
    }
}
