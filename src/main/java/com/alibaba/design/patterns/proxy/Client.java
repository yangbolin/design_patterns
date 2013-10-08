package com.alibaba.design.patterns.proxy;

/**
 * <pre>
 * ��Client.java��ʵ���������������ģʽ�Ŀͻ��˲�����
 * 
 * ����������ͱ��������֮����ڴ��������������˵����
 * ֮�����϶��е�ߡ�
 * 
 * ���ڴ������ģʽ�������ĺô����ڱ��������ʵ����һ������
 * ��ʱ�򣬿������ɱ����������ǰ���Լ����ô�����Щǰ�ú�
 * �õĴ����߼���������ı��������Ĵ�����,Spring�е�AOP
 * ���������������������ġ����ڴ�������Ŀǰ���е���JDK��
 * ��̬�����Լ��ֽ�����ǿ������ֱ���޸ı���������ֽ��롣
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
