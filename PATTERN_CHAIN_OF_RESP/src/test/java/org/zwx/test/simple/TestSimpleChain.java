package org.zwx.test.simple;

import org.junit.Test;
import org.zwx.simple.*;

public class TestSimpleChain {

    @Test
    public void test(){
        Handler handler = RespFactory.getRespChain(new ConcreteHandler1(), new ConcreteHandler2(), new ConcreteHandler3());

        handler.handlerRequest();
    }
}
