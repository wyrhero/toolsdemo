package com.wyrhero.junit;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({StatisMock.class})
public class StatisMockTest {



    @Test
    public void testSayHallo() {

        PowerMockito.mockStatic(StatisMock.class);
        when(StatisMock.sayHallo(Mockito.anyString())).thenReturn(Boolean.TRUE).thenReturn(Boolean.FALSE);

        System.out.println(StatisMock.sayHallo("Test666"));
        System.out.println(StatisMock.sayHallo("Test666"));
    }
}
