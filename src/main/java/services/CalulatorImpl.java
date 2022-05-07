package services;

import jakarta.jws.WebService;

@WebService(endpointInterface = "services.Calculator")
public class CalulatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int multibly(int a, int b) {
        return a * b;
    }

}
