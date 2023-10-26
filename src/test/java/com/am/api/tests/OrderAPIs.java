package com.am.api.tests;

import com.am.api.endpoints.OrderEndpoints;
import com.am.api.reporting.Setup;
import com.poiji.bind.Poiji;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Listeners({ Setup.class })
public class OrderAPIs {

    @Test
    public void findByOrderID() {

        OrderEndpoints orderEndPoints = new OrderEndpoints();
        Response response = orderEndPoints.findPurchaseOrderById(3);

        // Extract the response body as a string
        String responseBody = response.getBody().asString();

        // Print the response body
        System.out.println("Response Body: " + responseBody);
    }

}
