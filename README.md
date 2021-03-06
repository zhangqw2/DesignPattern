# DesignPattern

### 概述

**GoF的设计模式**

Gang of Four，简称GoF，分别是Erich Gamma, Richard Helm, Ralph Johnson和John Vlissides，这四位软件工程学者在1994年归纳发表了23种在软件开发中使用频率较高的设计模式，旨在用模式来统一沟通面向对象方法在分析、设计和实现间的鸿沟。软件开发发展到现在设计模式已经不至23种了，但是GoF的23种设计模式还是软件开发种很常用的，所以一般讲解设计模式都是指的GoF的23种设计模式，我以后要学习的设计模式也是这23种设计模式。并且举例子也都是以Java语言为主的。

**面向对象设计原则**

&emsp;**单一职责原则（Simple Responsibility Principle,SRP）**

一个类应该只有一个功能领域的职责，对外只提供一种功能，而引起类变化的原因应该只有一个。单一原则要达到的目的就是高内聚，低耦合。例如有一个用户类，这个用户类中包含用户的属性和用户的行为，这就造成了业务对象和业务逻辑被放在了一起，使得这个类有两种职责，违背了单一职责原则。应该将属性和行为分开，分别设立单独的接口（属性接口，行为接口）和实现类（属性实现类，行为实现类），这样就可以将业务对象和业务逻辑单独分开了。

&emsp;**开闭原则（Open Close Principle,OPC）**

一个对象对扩展开放，对修改关闭。通俗的理解是：对类的改动是通过增加代码进行的，而不是改动现有的代码。例如有一个用户行为接口，这个接口已经有两个实现类了，这时有一个需求是要给这个用户新增一个行为，这个时候需要更改用户行为接口，但是这样就违背了开闭原则。真正符号开闭原则的做法是，再写一个新的接口（或抽象类）继承自用户行为接口，然后所有的用户行为实现类都实现这个新的接口（或继承自新的抽象类）。

&emsp;**里氏替换原则（Liskov Substitution Principle,LSP）**

在任何父类出现的地方都可以用它的子类来替代。也就是说同一个继承体系中的对象应该有共同的行为特征。在里氏替换原则中，所有引用基类的地方必须能够透明地使用其子类对象。只要有父类出现的地方，子类就能够出现，而且替换为子类不会产生任何错误或异常。反过来，子类出现的地方，替换为父类就可能出现问题了。

里氏替换原则为良好的继承定义了一个规范，具体有4个：

子类必须完成实现父类的方法。

子类可以有自己的特性。

覆盖或者实现父类的方法时输入参数可以被放大。

覆盖或者实现父类的方法时输出结果可以被缩小。

依赖注入原则（Dependence Inversion Principle,DIP）

编程时要依赖于抽象，不要依赖于具体的实现。在应用程序中，所有的类如果使用或依赖于其他的类，则都应该依赖于这些其他类的抽象类（或接口），而不是依赖于这些其他类的具体实现类。

依赖注入原则需要注意的是：高层次模块不应该依赖低层次模块，即使用接口或抽象类进行变量的声明、参数类型的声明、方法返回类型的声明、数据类型状态等，而不要用具体实现类来做这些。

依赖注入的实现方式有三种：

通过构造函数传递依赖对象。

通过setter方法传递依赖对象。

接口声明实现依赖对象。

&emsp;**接口分离原则（Interface Segregation Priciple,ISP）**

不应该强迫客户程序依赖它们不需要使用的方法。意思就是说，一个接口不需要提供太多的行为，一个接口应该只提供一种对外的功能，不应该把所以的操作都封装到一个接口中。

在使用接口分离原则时需要注意几点：

接口尽量小：这主要是为了保证一个接口只服务于一个子模块或一类子模块。

接口高内聚：接口高内聚是对内高度依赖，对外尽可能隔离。即一个接口内部声明的方法相互之间都与某一个子模块相关，且使这个模块必需的。

接口设计是有限度的：如果完全遵循接口分离原则，接口粒度会越来越小，接口数量剧增，会导致系统复杂度大大增加，所以在设计接口时不应该一味的去分离接口。

&esmp;**迪米特原则（最少知识原则-LeastKonwledge Priciple,LKP）**

一个软件实体应该尽可能少的与其他软件实体发生相互作用。就是说各个对象或各个类之间应该尽可能降低耦合，提高系统的可维护性。在模块之间应该通过接口来通信，而不理会模块的内部工作原理，它可以使各个模块耦合度降到最低，促进软件的复用。

### 一、创建型模式
#### 1.简单工厂模式
 **定义**：由一个工厂对象决定创建出哪一种类型实例。客户端只需传入工厂类的参数，无心关心创建过程。
 
 **优点**：具体产品从客户端代码中抽离出来，解耦。
 
 **缺点**：工厂类职责过重，增加新的类型时，得修改工程类得代码，违背开闭原则。

#### 2.工厂方法模式

为了解决简单工厂模式的缺点，诞生了工厂方法模式（Factory method pattern）。

**定义**：定义创建对象的接口，让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到了子类进行。

**优点**：

&emsp;具体产品从客户端代码中抽离出来，解耦。

&emsp;加入新的类型时，只需添加新的工厂方法（无需修改旧的工厂方法代码），符合开闭原则。

**缺点**：类的个数容易过多，增加复杂度。

#### 3.抽象工厂模式

抽象工厂模式（Abstract factory pattern）提供了一系列相关或者相互依赖的对象的接口，关键字是“一系列”。

**优点**：

&emsp;具体产品从客户端代码中抽离出来，解耦。

&emsp;将一个系列的产品族统一到一起创建。

**缺点**：拓展新的功能困难，需要修改抽象工厂的接口；

综上所述，抽象工厂模式适合那些功能相对固定的产品族的创建
#### 4.建造者模式
建造者模式也称为生成器模式（Builder Pattern），将复杂对象的建造过程抽象出来（抽象类别），使这个抽象过程的不同实现方法可以构造出不同表现（属性）的对象。简单来说就是，相同的过程可以创建不同的产品。

将复杂对象的建造过程抽象出来（抽象类别），使这个抽象过程的不同实现方法可以构造出不同表现（属性）的对象。

简单来说就是，相同的过程可以创建不同的产品。

**适用于**：

&emsp;1.一个对象有非常复杂的内部结构（很多属性）

&emsp;2.想将复杂对象的创建和使用分离。

**优点**：

&emsp;1.封装性好，创建和使用分离

&emsp;2.拓展性好，建造类之间独立，一定程度上解耦。

**缺点**：

&emsp;1.产生多余的Builder对象；

&emsp;2.产品内部发生变化，建造者需要更改，成本较大。

#### 5.单例模式
单例模式目的是为了一个类只有一个实例。

**优点**：

&emsp;1.内存中只有一个实例，减少了内存开销；

&emsp;2.可以避免对资源的多重占用；

&emsp;3.设置全局访问点，严格控制访问。

**缺点**：

&emsp;没有接口，拓展困难。

##### 5.1 懒汉模式
最简单，但线程不安全 

[com.example.designpattern.singletonpattern.LazySingleton](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/LazySingleton.java)

可以加同步锁解决安全问题，但是同步锁锁的是整个类，比较消耗资源，并且即使运行内存中已经存在LazySingleton，调用其getInstance还是会上锁

[com.example.designpattern.singletonpattern.LazySingletonSync](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/LazySingletonSync.java)

##### 5.2 双重同步锁单例模式

[com.example.designpattern.singletonpattern.LazyDoubleCheckSingleton](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/LazyDoubleCheckSingleton.java)

由于指令重排的原因，某些线程可能会获取到空对象，后续对该对象的操作将触发空指针异常。

要修复这个问题，只需要阻止指令重排即可，所以可以给instance属性加上volatile关键字。

[com.example.designpattern.singletonpattern.LazyDoubleCheckVolatileSingleton](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/LazyDoubleCheckVolatileSingleton.java)

上面这种写法是不但确保了线程安全，并且当LazyDoubleCheckSingleton实例创建好后，后续再调用其getInstance方法不会上锁。

##### 5.3 静态内部类单例模式

[com.example.designpattern.singletonpattern](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/StaticInnerClassSingleton.java)

为什么这个例子是可行的呢？主要有两个原因：

&emsp;1.JVM在类的初始化阶段会加Class对象初始化同步锁，同步多个线程对该类的初始化操作；

&emsp;2.静态内部类InnerClass的静态成员变量instance在方法区中只会有一个实例。
> 在Java规范中，当以下这些情况首次发生时，A类将会立刻被初始化：
>
> 1.A类型实例被创建；
>
> 2.A类中声明的静态方法被调用；
>
> 3.A类中的静态成员变量被赋值；
>
> 4.A类中的静态成员被使用（非常量）；

##### 5.4 饿汉单例模式


[com.example.designpattern.singletonpattern.HungrySingleton](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/HungrySingleton.java)

这种模式在类加载的时候就完成了初始化，所以并不存在线程安全性问题；但由于不是懒加载，饿汉模式不管需不需要用到实例都要去创建实例，如果创建了不使用，则会造成内存浪费。



##### 5.5 序列化破坏单例模式

[com.example.designpattern.singletonpattern.HungrySingletonSerial](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/HungrySingletonSerial.java)

**演示**

[com.example.designpattern.singletonpattern.appliction](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/Application.java)

序列化后，虽然是单例模式，但却成功创建出了两个不一样的实例，单例遭到了破坏。

要让反序列化后的对象和序列化前的对象是同一个对象的话，可以在HungrySingleton里加上readResolve方法：

这种方式最终反序列化出来的对象和序列化对象是同一个对象。但这种方式反序列化过程内部还是会重新创建HungrySingletonSerial实例，只不过因为HungrySingletonSerial类定义了readResolve方法（方法内部返回instance引用），反序列化过程会判断目标类是否定义了readResolve该方法，是的话则通过反射调用该方法。

##### 5.6 反射破坏单例模式

[com.example.designpattern.singletonpattern.appliction](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/Application.java)

通过反射破坏了私有构造器权限，成功创建了新的实例。

对于这种情况，饿汉模式下的例子可以在构造器中添加判断逻辑来防御（懒汉模式的就没有办法了）

```java
public class HungrySingleton {

    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("forbidden");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
```

##### 5.7 枚举单例模式

枚举单例模式是推荐的单例模式，它不仅可以防御序列化攻击，也可以防御反射攻击。

[com/example/designpattern/singletonpattern/EnumSingleton](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/singletonpattern/EnumSingleton.java)

**示例**

[com/example/designpattern/singletonpattern/EnumSingletonTest](https://github.com/zhangqw2/DesignPattern/blob/master/src/test/java/com/example/designpattern/singletonpattern/EnumSingletonTest.java)

**防御序列化攻击原理**:

&emsp;跟踪ObjectInputStream#readObject源码，其中当反编译对象为枚举类型时，将调用readEnum方法：

```java
/**
     * Reads in and returns enum constant, or null if enum type is
     * unresolvable.  Sets passHandle to enum constant's assigned handle.
     */
    private Enum<?> readEnum(boolean unshared) throws IOException {
        if (bin.readByte() != TC_ENUM) {
            throw new InternalError();
        }

        ObjectStreamClass desc = readClassDesc(false);
        if (!desc.isEnum()) {
            throw new InvalidClassException("non-enum class: " + desc);
        }

        int enumHandle = handles.assign(unshared ? unsharedMarker : null);
        ClassNotFoundException resolveEx = desc.getResolveException();
        if (resolveEx != null) {
            handles.markException(enumHandle, resolveEx);
        }

        String name = readString(false);
        Enum<?> result = null;
        Class<?> cl = desc.forClass();
        if (cl != null) {
            try {
                @SuppressWarnings("unchecked")
                //同一个枚举对象
                Enum<?> en = Enum.valueOf((Class)cl, name);
                result = en;
            } catch (IllegalArgumentException ex) {
                throw (IOException) new InvalidObjectException(
                    "enum constant " + name + " does not exist in " +
                    cl).initCause(ex);
            }
            if (!unshared) {
                handles.setObject(enumHandle, result);
            }
        }

        handles.finish(enumHandle);
        passHandle = enumHandle;
        return result;
    }
```

name为枚举类里的枚举常量，对于线程来说它是唯一的，存在方法区，所以通过Enum.valueOf((Class)cl, name)方法得到的枚举对象都是同一个。

**防御反射攻击原理**:

查看Constructor类

```java
    @CallerSensitive
    public T newInstance(Object ... initargs)
        throws InstantiationException, IllegalAccessException,
               IllegalArgumentException, InvocationTargetException
    {
        if (!override) {
            if (!Reflection.quickCheckMemberAccess(clazz, modifiers)) {
                Class<?> caller = Reflection.getCallerClass();
                checkAccess(caller, clazz, null, modifiers);
            }
        }
        
        if ((clazz.getModifiers() & Modifier.ENUM) != 0)
            //Java禁止通过反射创建枚举对象。
            throw new IllegalArgumentException("Cannot reflectively create enum objects");
        ConstructorAccessor ca = constructorAccessor;   // read volatile
        if (ca == null) {
            ca = acquireConstructorAccessor();
        }
        @SuppressWarnings("unchecked")
        T inst = (T) ca.newInstance(initargs);
        return inst;
    }
```

#### 6.原型模式

原型实例指定创建对象的种类，通过拷贝这些原型创建新的对象。

**适用于**：

类初始化消耗较多资源；

循环体中生产大量对象的时候。

**优点**：

原型模式性能比直接new一个对象性能好；

简化创建对象过程。

**缺点**：

对象必须重写Object克隆方法；

复杂对象的克隆方法写起来较麻烦（深克隆、浅克隆）

### 二、结构型模式

#### 1. 外观模式

外观模式又叫门面模式，提供了统一得接口，用来访问子系统中的一群接口。

**适用于**：

子系统越来越复杂，增加外观模式提供简单接口调用；

构建多层系统结构，利用外观对象作为每层的入口，简化层间调用。

**优点**：

简化了调用过程，无需了解深入子系统；

减低耦合度；

更好的层次划分；

符合迪米特法则。

**缺点**：

增加子系统，拓展子系统行为容易引入风险；

不符合开闭原则。

#### 2.装饰者模式

在不改变原有对象的基础之上，将功能附加到对象上，提供了比继承更有弹性的替代方案。

**适用于**：

拓展一个类的功能；

动态给对象添加功能，并且动态撤销。

**优点**：

继承的有力补充，不改变原有对象的情况下给对象拓展功能；

通过使用不同的装饰类、不同的组合方式，实现不同的效果。

符合开闭原则。

**缺点**：

增加程序复杂性；

#### 3.适配器模式

将一个类的接口转换为期望的另一个接口，使原本不兼容的类可以一起工作。

**适用于**：

已存在的类，它的方法和需求不匹配时（方法结果相同或者相似）

**优点**:

提高类的透明性和复用，现有的类复用但不需改变；

目标类和适配器类解耦，提高程序拓展性；

符合开闭原则。

**缺点**：

适配器编写过程需要全面考虑，可能会增加系统的复杂性；

降低代码可读性。

分为：类适配器模式和对象适配器模式。

[类适配器模式](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/adapterpattern/RaspberryPieAdaptor.java)

[对象适配器模式](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/adapterpattern/RaspberryPieObjectAdaptor.java)

#### 4.享元模式

提供了减少对象数量从而改善应用所需的对象结构的方式，运用共享技术有效地支持大量细粒度的对象。

**适用于**：

底层系统开发，解决性能问题；

系统拥有大量相似对象，需要缓冲池的场景。

**优点**：

减少对象的创建，降低内存占用；

**缺点**：

关注内/外部状态，关注线程安全问题；

程序的逻辑复杂化。

内部状态：简单理解为享元对象的属性状态，不会因为外部的改变而改变； 外部状态：简单理解为方法参数。

JDK中的字符串常量池，数据库连接池等都是用的享元模式。

#### 5.组合模式

将对象组合成树形结构以表示“部分-整体”的层次结构，使客户端对单个对象和组合对象保持一致的方式处理。

**适用于**：

客户端可以忽略组合对象与单个对象的差异；

处理树形结构数据。

**优点**:

层次清晰；

客户端不必关系层次差异，方便控制；

符合开闭原则。

**缺点**：

树形处理较为复杂。

#### 6.桥接模式

将抽象部分和具体实现部分分离，使它们都可以独立变化。通过组合的方式建立两个类之间的关系，而不是通过继承。

**适用于**：

抽象和实体实现之间增加更多的灵活性；

一个类存在多个独立变化的维度，并且需要独立拓展；

不希望使用继承。

**优点**：

分离抽象部分和具体实现部分；

提高了系统可拓展性；

符合开闭原则和合成复用原则。

**缺点**：

增加了系统的理解和设计难度；

#### 7.代理模式
为其他对象提供一种代理，以控制对这个对象的访问，代理对象在客户端和目标对象之间起到了中介的作用。

**适用于**：

保护目标对象；

增强目标对象。

**优点**：

将代理对象和真实被调用的目标对象分离；

降低耦合，拓展性好；

保护目标对象，增强目标对象。

**缺点**：

造成类的数目增加，增加复杂度；

客户端和目标对象增加代理对象，会造成处理速度变慢

##### 1.静态代理

通过在代码中显式地定义了一个代理类，在代理类中通过同名的方法对目标对象的方法进行包装，客户端通过调用代理类的方法来调用目标对象的方法。

[PieServiceProxy](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/proxypattern/PieServiceProxy.java)

##### 2.动态代理

JDK的动态代理只能代理接口，通过接口的方法名在动态生成的代理类中调用业务实现类的同名方法。

静态代理的缺点就是每需要代理一个类，就需要手写对应的代理类。这个问题可以用动态代理来解决

[DynamicProxy](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/proxypattern/DynamicProxy.java)

##### 3.CGLib代理

通过继承来实现，生成的代理类就是目标对象类的子类，通过重写业务方法来实现代理。

##### 4.Spring对代理模式的拓展

&emsp;1.当Bean有实现接口时，使用JDK动态代理；

&emsp;2.当Bean没有实现接口时，使用CGLib代理。

可以通过以下配置强制使用CGLib代理：
```
spring:
  aop:
    proxy-target-class: true
```

### 三、行为型模式

#### 1.模板方法模式

模板方法模式定义了一个流程的骨架，由多个方法组成。并允许子类为一个或多个步骤提供实现。简而言之就是公共的不变的部分由父类统一实现，变化的部分由子类来个性化实现。

**优点**：

提高复用性；

提高拓展性；

符合开闭原则。

**缺点**：

类的数目增加；

增加了系统实现的复杂度；

父类添加新的抽象方法，所有子类都要改一遍。

#### 2.迭代器模式

迭代器模式，又称游标模式。这种模式提供一种方法访问一个容器对象中各个元素，而又不需要暴露该对象的内部细节。

通过引入迭代器可以将数据的遍历功能从聚合对象中分离出来，聚合对象只负责存储数据，而遍历数据由迭代器实现完成。Java语言类库中已经实现了迭代器模式，在实际开发中我们直接使用已经定义好的迭代器就可以了，像List、Set等集合都可以直接使用。

**优点**

1、它支持以不同的方式遍历一个聚合对象，在同一个聚合对象上可以定义多种遍历方式。替换迭代器就可以切换遍历方法。

2、迭代器简化了聚合类。聚合对象可以不用自己再提供遍历方法。

3、在迭代器模式中由于引入了抽象层，增加新的聚合类和迭代器类都很方便，无须修改原有代码，满足“开闭原则”的要求。

**缺点**

1、由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器来，类的个数成对增加，这在一定程度上增加了系统的复杂性。

2、抽象迭代器设计难度相对较大，需要充分考虑到系统将来的扩展，，例如JDK内置迭代器Iterator就无法实现逆向遍历，如果需要实现逆向遍历，只能通过其子类ListIterator等来实现，而ListIterator迭代器无法用于操作Set类型的聚合对象。

**适用场景**

在以下情况可以考虑使用迭代器模式

1、访问一个聚合对象的内容而无须暴露它的内部表示。将聚合对象的访问与内部数据的存储分离，使得访问聚合对象时无须了解其内部实现细节。

2、需要为一个聚合对象提供多种遍历方式。

3、为遍历不同聚合结构提供统一的接口，该接口的实现类中为不同的聚合结构提供不同的遍历方式，而客户端可以一致性的操作该接口。

迭代器模式主要由以下角色组成

**抽象迭代器角色（Iterator）**：抽象迭代器角色定义访问和遍历元素的接口。[Iterator](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/iterator/Iterator.java)接口就是代表的这个角色。

**具体迭代器角色（Concrete Iterator）**：具体迭代器角色要实现迭代器接口， 并要记录遍历中的当前位置。[BookShelfIterator](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/iterator/BookShelfIterator.java)类就是代表的这个角色。

**容器角色（Aggregate）**：容器角色负责提供创建具体迭代器角色的接口。[Aggregate](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/iterator/Aggregate.java)接口代表的就是这个角色。

**具体容器角色（Concrete Aggregate）**：具体容器角色实现创建具体迭代器角色的接口，这个具体迭代器角色与该容器的结构相关。[BookShelf](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/iterator/BookShelf.java)

代表的就是这个角色。

#### 3.策略模式

策略模式定义了算法家族，分别封装起来，让它们之间可以互相替换。此模式让算法的变化不会影响到使用算法的用户。策略模式常用于消除大量的if else代码。

**适用场景**：

系统有很多类，它们的区别仅仅在于行为不同；

一个系统需要动态地在几种算法中选择一种；

#### 4.解释器模式

解释器模式是指给定一个使用规定格式和语法的语言，并且建立一个解释器来解释该语言中的句子。

**优点**

1、易于改变和扩展文法。因为该模式使用类表示文法，所以可以使用继承改变或扩展该文法。

2、每条文法规则都可以是一个类，所以可以很方便的实现一个简单的语言。

3、易于实现文法的定义。在抽象语法树中每一个表达式节点类的实现方式都是相似的，这些类的代码编写都不会特别复杂，还可以通过一些工具自动生成节点类代码。

4、增加新的解释表达式较为方便。如果用户需要增加新的解释表达式只需要对应增加一个新的终结符表达式或非终结符表达式类，原有表达式类代码无须修改，符合“开闭原则”。

**缺点**

1、对于复杂文法难以维护。在解释器模式中，每一条规则至少需要定义一个类，因此如果一个语言包含太多文法规则，类的个数将会急剧增加，导致系统难以管理和维护，此时可以考虑使用语法分析程序等方式来取代解释器模式。

2、执行效率较低。由于在解释器模式中使用了大量的循环和递归调用，因此在解释较为复杂的句子时其速度很慢，而且代码的调试过程也比较麻烦。

**适用场景**

1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。

2、一些重复出现的问题可以用一种简单的语言来进行表达。

3、一个语言的文法较为简单。

4、执行效率不是关键问题。



#### 5.观察者模式

观察者模式定义了对象之间的一对多依赖，让多个观察者同时监听某个主题对象，当主体对象发生变化时，它的所有观察者都会收到响应的通知。

**优点**：

观察者和被观察者之间建立一个抽象的耦合；

观察者模式支持广播通信。

**缺点**：

观察者之间有过多的细节依赖，提高时间消耗及程序复杂度；

应避免循环调用。

[Blog类](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/observerpattern/Blog.java)是被观察者对象，被观察者对象需要继承JDK的Observable类，继承后，被观察者对象包含如下属性和方法

```java
public class Observable {
    //标志位
    private boolean changed = false;
    //观察者集合
    private Vector<Observer> obs;

    /** Construct an Observable with zero Observers. */

    public Observable() {
        obs = new Vector<>();
    }

    /**
     * Adds an observer to the set of observers for this object, provided
     * that it is not the same as some observer already in the set.
     * The order in which notifications will be delivered to multiple
     * observers is not specified. See the class comment.
     *
     * @param   新增观察者
     * @throws NullPointerException   if the parameter o is null.
     */
    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    /**
     * Deletes an observer from the set of observers of this object.
     * Passing <CODE>null</CODE> to this method will have no effect.
     * @param   o   删除观察者
     */
    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    /**
     * If this object has changed, as indicated by the
     * <code>hasChanged</code> method, then notify all of its observers
     * and then call the <code>clearChanged</code> method to
     * indicate that this object has no longer changed.
     * <p>
     * Each observer has its <code>update</code> method called with two
     * arguments: this observable object and <code>null</code>. In other
     * words, this method is equivalent to:
     * <blockquote><tt>
     * notifyObservers(null)</tt></blockquote>
     *通知观察者
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#hasChanged()
     * @see     java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * If this object has changed, as indicated by the
     * <code>hasChanged</code> method, then notify all of its observers
     * and then call the <code>clearChanged</code> method to indicate
     * that this object has no longer changed.
     * <p>
     * Each observer has its <code>update</code> method called with two
     * arguments: this observable object and the <code>arg</code> argument.
     *通知观察者,并传递数据
     * @param   arg   any object.
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#hasChanged()
     * @see     java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers(Object arg) {
        /*
         * a temporary array buffer, used as a snapshot of the state of
         * current Observers.
         */
        Object[] arrLocal;

        synchronized (this) {
            /* We don't want the Observer doing callbacks into
             * arbitrary code while holding its own Monitor.
             * The code where we extract each Observable from
             * the Vector and store the state of the Observer
             * needs synchronization, but notifying observers
             * does not (should not).  The worst result of any
             * potential race-condition here is that:
             * 1) a newly-added Observer will miss a
             *   notification in progress
             * 2) a recently unregistered Observer will be
             *   wrongly notified when it doesn't care
             */
            if (!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }

    /**
     * Clears the observer list so that this object no longer has any observers.
     * 删除所有观察者
     */
    public synchronized void deleteObservers() {
        obs.removeAllElements();
    }

    /**
     * Marks this <tt>Observable</tt> object as having been changed; the
     * <tt>hasChanged</tt> method will now return <tt>true</tt>.
     * 设置标志位为true
     */
    protected synchronized void setChanged() {
        changed = true;
    }

    /**
     * Indicates that this object has no longer changed, or that it has
     * already notified all of its observers of its most recent change,
     * so that the <tt>hasChanged</tt> method will now return <tt>false</tt>.
     * This method is called automatically by the
     * <code>notifyObservers</code> methods.
     *重置标志位为false
     * @see     java.util.Observable#notifyObservers()
     * @see     java.util.Observable#notifyObservers(java.lang.Object)
     */
    protected synchronized void clearChanged() {
        changed = false;
    }

    /**
     * Tests if this object has changed.
     *判断标志位是否发生改变
     * @return  <code>true</code> if and only if the <code>setChanged</code>
     *          method has been called more recently than the
     *          <code>clearChanged</code> method on this object;
     *          <code>false</code> otherwise.
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#setChanged()
     */
    public synchronized boolean hasChanged() {
        return changed;
    }

    /**
     * Returns the number of observers of this <tt>Observable</tt> object.
     *统计观察者数量
     * @return  the number of observers of this object.
     */
    public synchronized int countObservers() {
        return obs.size();
    }
```

Blog的comment方法中，当博客收到评论时，首先调用父类的setChanged()方法，设置标识位 changed = true，表示被观察者发生了改变；然后调用父类的notifyObservers(Object)方法通知所有观察者。

观察者对象[Author](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/observerpattern/Author.java)需要实现JDK的Observer类，重写update方法。当被观察者对象调用了notifyObservers方法后，相应的观察者的update方法会被调用。

#### 6.备忘录模式

备忘录模式是指在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可以将该对象恢复到原先保存的状态。


**优点**

1、它提供了一种状态恢复的实现机制，使得用户可以方便地回到一个特定的历史步骤，当新的状态无效或者存在问题时，可以使用暂时存储起来的备忘录将状态复原。

2、备忘录实现了对信息的封装，一个备忘录对象是一种原发器对象状态的表示，不会被其他代码所改动。备忘录保存了原发器的状态，采用列表、堆栈等集合来存储备忘录对象可以实现多次撤销操作。

**缺点**

资源消耗过大，如果需要保存的原发器类的成员变量太多，就不可避免需要占用大量的存储空间，每保存一次对象的状态都需要消耗一定的系统资源。

**适用场景**

1、保存一个对象在某一个时刻的全部状态或部分状态，这样以后需要时它能够恢复到先前的状态，实现撤销操作。

2、防止外界对象破坏一个对象历史状态的封装性，避免将对象历史状态的实现细节暴露给外界对象。

**原发器类（Originator）**：创建一个备忘录对象，使用备忘录存储它的内部状态。[Game](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/mementopattern/Game.java)

**负责人类（CareTaker）**：负责保存好备忘录对象，不能检查或操作备忘录的内容。[Caretaker](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/mementopattern/Caretaker.java)

**备忘录类（Memento）**：将原发器的内部状态存储起来，原发器根据需要决定备忘录存储原发器的哪些内部状态。
[GameMemento](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/mementopattern/GameMemento.java)

#### 7.命令模式
将一个请求封装为一个对象，从而使我们可用不同的请求对用户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。
**优点**

1、降低系统的耦合度。由于请求者与接收者之间不存在直接引用，因此请求者与接收者之间实现完全解耦，相同的请求者可以对应不同的接收者，同样，相同的接收者也可以供不同的请求者使用，两者之间具有良好的独立性。

2、新的命令可以很容易地加入到系统中。由于增加新的具体命令类不会影响到其他类，因此增加新的具体命令类很容易，无须修改原有系统源代码，甚至客户类代码，满足“开闭原则”的要求。

**缺点**

使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个对请求接收者的调用操作都需要设计一个具体命令类，因此在某些系统中可能需要提供大量的具体命令类，这将影响命令模式的使用。

**使用场景**

系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。

系统需要在不同的时间指定请求、将请求排队和执行请求。

组成命令模式的角色如下所示：

Command（抽象命令者）：定义命令的接口，声明执行的方法。

ConcreteCommand（具体命令类）：命令接口实现对象，是“虚”的实现；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。

Receiver(接收者)：真正执行命令的对象。任何类都可能成为一个接收者，只要它能够根据命令要求实现的相应功能。

Invoker(调用者)：要求命令要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这是用户端真正出发命令并要求命令执行相应操作的地方，也就是说，相当于使用命令对象的入口。

Client：创建具体的命令对象，并且设置命令对象的接收者。也可以理解为装配者。

#### 8.中介者模式

用一个中介对象来封装一系列的对象交互。中介者使得各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

**优点**：

（1）松散耦合

    中介者模式通过把多个同事对象之间的交互封装到中介者对象里面，从而使得同事对象之间松散耦合，基本上可以做到互不依赖。这样一来，同事对象就可以独立地变化和复用，而不再像以前那样“牵一发而动全身”了。

（2）集中控制交互

    多个同事对象的交互，被封装在中介者对象里面集中管理，使得这些交互行为发生变化的时候，只需要修改中介者对象就可以了，当然如果是已经做好的系统，那就扩展中介者对象，而各个同事类不需要做修改。

（3）多对多变成一对多

    没有使用中介者模式的时候，同事对象之间的关系通常是多对多的，引入中介者对象以后，中介者对象和同事对象的关系通常变成了双向的一对多，这会让对象的关系更容易理解和实现。

**缺点**：

过度集中化。如果同事对象的交互非常多，而且比较复杂，当这些复杂性全部集中到中介者的时候，会导致中介者对象变得十分复杂，而且难于管理和维护。


#### 9.责任链模式

职责链模式为请求创建一个接收此次请求对象的链。

**适用于**：

一个请求的处理需要多个对象当中的一个或几个协作处理；

**优点**：

请求的发送者和接受者（请求的处理）解耦；

职责链可以动态的组合。

**缺点**：

职责链太长或者处理时间过长，影响性能；

职责链可能过多。

#### 10.访问者模式

通过一个访问者类，改变元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。

目的是将数据结构与数据操作分离,解决稳定的数据结构和易变的操作耦合问题。

需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，使用访问者模式将这些封装到类中。

关键操作: 在被访问的类里面加一个对外提供接待访问者的接口,在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。

**优点**： 

1、符合单一职责原则。 

2、优秀的扩展性。 

3、灵活性。

**缺点**： 

1、具体元素对访问者公布细节，违反了迪米特原则。 

2、具体元素变更比较困难。 3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。

**使用场景**： 

1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。 

2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。

注意事项：访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器。

#### 11.状态模式

状态模式允许一个对象在其状态改变时，改变它的行为，对象看起来似乎修改了它的类。

用于解决系统中复杂的对象状态转换以及各个状态下的封装等问题。

状态模式在功能上和策略模式很类似，但是在实现思想上状态模式是将各个状态分离解耦的，并且可以将对象的具体行为委托给当前的状态对象，而策略模式中，策略的选择是根据Context类中的行为来确定的，也不存在各个状态的切换。在实际开发中，状态模式具有较高的使用频率，在工作流和游戏开发中状态模式都得到了广泛的应用，例如公文状态的转换、游戏中角色的升级等。

**优点**

1、封装了状态的转换规则，在状态模式中可以将状态转换的工作封装在环境类或具体的状态类中，可以对状态转换码进行集中管理，而不是分散在一个个的业务中。

2、将所有与某个状态有关的行为放到一个类中，只需要注入一个不同的状态对象即可使环境对象拥有不同的行为。

3、允许状态转换逻辑与状态对象合为一体，而不是提供一个巨大的条件语句块，状态模式可以让我们避免使用庞大的条件语句来将业务方法和状态转换代码交织在一起。

**缺点**

1、状态模式的使用必然会增加系统中类和对象的个数，导致系统运行开销增大。

2、状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱，增加系统设计的难度。

**使用场景**

1、对象的行为依赖于它的状态（如某些属性值），状态的改变将导致行为的变化。

2、在代码中包含大量与对象状态有关的条件语句，这些条件语句的出现，会导致代码的可维护性和灵活性变差，不能方便地增加和删除状态，并且导致客户类与类库之间的耦合增强。
在状态模式中，主要涉及了如下几个角色。

环境角色（Context）：定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。这个具体状态类的实例给出此环境对象的现有状态。[LeaveApply](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/statepattern/LeaveApply.java)

抽象状态角色（State）：定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为。[ApplyState](https://github.com/zhangqw2/DesignPattern/blob/master/src/main/java/com/example/designpattern/statepattern/ApplyState.java)

具体状态角色（Contract）：每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。

