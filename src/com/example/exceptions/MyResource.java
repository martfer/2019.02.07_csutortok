
package com.example.exceptions;


import com.example.exceptions.basics.MyException;

public class MyResource implements AutoCloseable {

    @Override
    public void close() throws MyException {
        System.out.println("close called in " + getMyName() );
        throw new MyException("Problem with closing...");
    }
    
    public void read() throws MyException {
        System.out.println("read called in " + getMyName() );
        throw new MyException("Problem with reading...");        
    }
    
    public String getMyName() {
        return this.getClass().getSimpleName();
    }
}
