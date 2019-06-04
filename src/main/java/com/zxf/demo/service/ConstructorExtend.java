package com.zxf.demo.service;

public class ConstructorExtend {
    public static void main(String args[]){
        FatherClass fa = new FatherClass();
        FatherClass fa1 = new FatherClass(100);
        SonClass son = new SonClass(200);
        SonClass son1 = new SonClass();
        son1.fun(2);
    }

}
class FatherClass{
    public FatherClass() {
        System.out.println("父类 无参 构造函数");
    }
    public FatherClass(int i){
        System.out.println("父类 一个参数构造函数super = "+i);
    }
    public FatherClass(int i,String j){
        System.out.println("父类 一个参数构造函数superi = "+i+",superj = "+j);
    }

}

class SonClass extends FatherClass{
    public SonClass(){
        super(22);//line 1
        System.out.println("子类 无参 构造函数");
    }
    public SonClass(int a){
        super(33,"啊哈哈");//line 2
        System.out.println("子类一个参数构造函数sub = "+a);
    }
    public void fun(int a){//子类中定义一个实例函数
        //super(33,"Hello");//构造函数调用必须声明在构造函数中,这行代码不注释的话会报错
        System.out.println("子类一个参数构造函数sub = "+a);
    }
}
