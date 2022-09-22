package com.sahil.InterfaceExample;

public interface Engine {
    void start();
    void stop();
}



// In short this interface is same as Abstract class but in interface you cannot have any
// normal function (non-abstract function) like in an Abstract class
// the reason for this is that, you can enjoy the Multiple inheritance
// if interface provide you a way to make any normal function this mean it would be already
// specified means same problem again arise if the two interface has the same method name
// then the class which is inheriting would get confused to which method it has to run