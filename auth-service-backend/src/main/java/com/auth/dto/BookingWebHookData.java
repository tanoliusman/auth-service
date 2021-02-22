package com.auth.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class BookingWebHookData {

    private int accountId;
    private List<String> booking_numbers;

}
