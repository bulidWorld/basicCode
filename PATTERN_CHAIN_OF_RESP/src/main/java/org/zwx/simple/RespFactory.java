package org.zwx.simple;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

public class RespFactory {

    public static Handler getRespChain(Handler... handlers){
        Optional<Handler> handler = Arrays.stream(handlers).reduce((prev, next) -> prev.setSucessor(next));

        return handlers[0
                ];
    }

    @Test
    public void testReduce(){
        String[] strs = {"12","22","3", "4"};

        Optional<String> s = Arrays.stream(strs).reduce((str1, str2) -> str1 + str2);
        System.out.println(s.get());

    }
}
