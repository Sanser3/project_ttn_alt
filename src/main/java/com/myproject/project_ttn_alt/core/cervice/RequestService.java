package com.myproject.project_ttn_alt.core.cervice;

import com.myproject.project_ttn_alt.dto.AddTtnRequest;

import java.util.List;

public class RequestService {
    public Object createRequest(List<String> data, List<Integer> order){
        var request = new AddTtnRequest();
        request.setName(data.get(0));
        request.setAddress(data.get(1));
        request.setOrder(order);
        return request;
    }
}
