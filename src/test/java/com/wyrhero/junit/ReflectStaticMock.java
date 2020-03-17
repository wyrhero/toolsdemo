package com.wyrhero.junit;

import javassist.*;
import javassist.util.HotSwapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import sun.reflect.Reflection;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Objects;

import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class ReflectStaticMock {

    @Test
    public void testSayHallo() throws Exception {
        //StatisMock.sayHallo
        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClass = classPool.get("com.wyrhero.junit.StatisMock");

        String methodName = "sayHallo";
        CtMethod sourceMethod = ctClass.getDeclaredMethod(methodName);

        //CtMethod newMethod = CtNewMethod.copy(sourceMethod,methodName,ctClass,null);

        boolean result = true;
        //注入的代码
        StringBuffer body = new StringBuffer();
        body.append("{\n return Boolean.");
        if(result) {
            body.append("FALSE");
        } else {
            body.append("TRUE");
        }
        body.append(";");
        body.append(" \n}");

        sourceMethod.setBody(body.toString());

        System.out.println(StatisMock.sayHallo("Test666"));
        System.out.println(StatisMock.sayHallo("Test666"));

    }

    public static void main(String[] args) {
        System.out.println(BigDecimal.ZERO.equals(0.0D));
        System.out.println(BigDecimal.ZERO.equals(0.00D));
        System.out.println(BigDecimal.ZERO.equals(0D));

        System.out.println(BigDecimal.valueOf(0D).equals(0.0D));
        System.out.println(BigDecimal.valueOf(0D).equals(0.00D));
        System.out.println(BigDecimal.valueOf(0D).equals(0D));

        System.out.println(BigDecimal.valueOf(0D).compareTo(BigDecimal.valueOf((0.0D))));
        System.out.println(BigDecimal.valueOf(0D).compareTo(BigDecimal.valueOf(0.00D)));
        System.out.println(BigDecimal.valueOf(0D).compareTo(BigDecimal.valueOf(0D)));

        System.out.println(BigDecimal.ZERO.equals(BigDecimal.valueOf(0.0D)));
        System.out.println(BigDecimal.ZERO.equals(BigDecimal.valueOf((0.00D))));
        System.out.println(BigDecimal.ZERO.equals(BigDecimal.valueOf((0D))));

        System.out.println(Objects.equals(0.000D,0D));
    }
}
