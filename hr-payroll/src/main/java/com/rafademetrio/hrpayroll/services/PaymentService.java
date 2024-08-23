package com.rafademetrio.hrpayroll.services;


import com.rafademetrio.hrpayroll.entities.Payment;
import com.rafademetrio.hrpayroll.entities.Worker;
import com.rafademetrio.hrpayroll.feignClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {


    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
