package services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface Calculator {

    @WebMethod
    int add(int a, int b);

    @WebMethod
    int sub(int a, int b);

    @WebMethod
    int divide(int a, int b);

    @WebMethod
    int multibly(int a, int b);
}
