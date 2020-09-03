# DesignPattern
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
