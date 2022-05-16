package com.example.springbatch.entities;

import lombok.Data;

@Data
public class Coin {
    private String asset_id;
    private String name;
    private float type_is_crypto;
    private String data_quote_start;
    private String data_quote_end;
    private String data_orderbook_start;
    private String data_orderbook_end;
    private String data_trade_start;
    private String data_trade_end;
    private float data_symbols_count;
    private float volume_1hrs_usd;
    private float volume_1day_usd;
    private float volume_1mth_usd;
    private String id_icon;
    private String data_start;
    private String data_end;
}
