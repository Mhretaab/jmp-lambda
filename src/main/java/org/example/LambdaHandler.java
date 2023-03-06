package org.example;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class LambdaHandler implements RequestHandler<Map<String,String>, String> {

    @Override
    public String handleRequest(Map<String, String> input, Context context) {
//        AmazonElasticLoadBalancing elb = AmazonElasticLoadBalancingClientBuilder.defaultClient();
//
//        // Send a request to the load balancer and get the response
//        DescribeInstanceHealthRequest request = new DescribeInstanceHealthRequest().withLoadBalancerName("jmp-elb");
//        DescribeInstanceHealthResult result = elb.describeInstanceHealth(request);
//
//        System.out.println(result.toString());

        return "Hello from Lambda!";
    }

}