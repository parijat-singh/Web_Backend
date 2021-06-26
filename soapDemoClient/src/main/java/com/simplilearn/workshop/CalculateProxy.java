package com.simplilearn.workshop;

public class CalculateProxy implements com.simplilearn.workshop.Calculate {
  private String _endpoint = null;
  private com.simplilearn.workshop.Calculate calculate = null;
  
  public CalculateProxy() {
    _initCalculateProxy();
  }
  
  public CalculateProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculateProxy();
  }
  
  private void _initCalculateProxy() {
    try {
      calculate = (new com.simplilearn.workshop.CalculateServiceLocator()).getCalculate();
      if (calculate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculate != null)
      ((javax.xml.rpc.Stub)calculate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.simplilearn.workshop.Calculate getCalculate() {
    if (calculate == null)
      _initCalculateProxy();
    return calculate;
  }
  
  public int multply(int a, int b) throws java.rmi.RemoteException{
    if (calculate == null)
      _initCalculateProxy();
    return calculate.multply(a, b);
  }
  
  
}