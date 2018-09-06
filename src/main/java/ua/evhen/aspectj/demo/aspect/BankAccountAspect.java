package ua.evhen.aspectj.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BankAccountAspect {


    @Before("execution(void ua.evhen.aspectj.demo.domain.*.set*(..)) && args(val)")
    public void setMethod(Object val, JoinPoint jp) {
        System.out.printf("%s := '%s'%n ", jp.getSignature().toShortString(), val);
    }


}
