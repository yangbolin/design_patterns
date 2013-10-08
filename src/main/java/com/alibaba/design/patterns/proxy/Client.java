package com.alibaba.design.patterns.proxy;

/**
 * <pre>
 * 类Client.java的实现描述：代理设计模式的客户端测试类
 * 
 * 这里代理对象和被代理对象之间存在代码的依赖，就是说他们
 * 之间的耦合度有点高。
 * 
 * 关于代理设计模式有这样的好处：在被代理对象实际做一件事情
 * 的时候，可以先由被代理对象做前置以及后置处理，这些前置后
 * 置的处理逻辑不会侵入的被代理对象的代码中,Spring中的AOP
 * 理念正是这样衍生出来的。关于代理技术的目前流行的有JDK的
 * 动态代理，以及字节码增强，就是直接修改被代理类的字节码。
 * </pre>
 * 
 * @author yangbolin Oct 3, 2013 10:27:53 AM
 */
public class Client {
    public static void main(String[] args) {
        CEOAssistant ceoAssistant = new CEOAssistant(new CEO());
        ceoAssistant.doAudit();
        ceoAssistant.doPlan();
        ceoAssistant.doPunish();
    }
}
