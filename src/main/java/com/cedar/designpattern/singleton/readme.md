单例设计模式介绍

所谓类的单例设计模式，就是采取一定的方法保证再整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得对象实例的方法。

比如Hibernate的SessionFactory，它充当数据存储源的代理，并负责创建Session对象。SessionFactory并不是轻量级的，一般情况下，一个项目通常只需要一个SessionFactory就够，这里就用到了单例模式

单例设计模式八种方式

1. 饿汉式（静态常量）
2. 饿汉式（静态代码块）
3. 懒汉式（线程不安全）
4. 懒汉式（线程安全，同步方法）
5. 懒汉式（线程安全，同步代码块）
6. 双重检查
7. 静态内部类
8. 枚举



1. 饿汉式（静态常量）

>实现方式：
>>1. 构造器私有化（防止外部手动new对象）
>>2. 类的内部创建对象
>>3. 向外暴露一个静态的公共方法 getInstance
>优缺点说明：
>
>> 1. 优点：写法比较简单，在类装载时就完成了实例化。避免了线程同步问题
>> 2. 缺点：在类装载的时候完成实例化，没有达到**Lazy Loading**的效果。如果至始至终未使用该实例，就会造成内存的浪费
>> 3. 这种方式基于classloader机制避免了多线程的同步问题，不过，**instance是在类装载时就实例化**，在单例模式中大多数都是调用getInstance方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式（或其他静态方法）导致类的装载，这时候初始化instance就没有达到Lazy Loading的效果
>> 4. 结论：这种单例模式可用，可能造成内存浪费

2. 饿汉式（静态代码块）

> 优缺点说明：
>
> > 1. 这种方式和静态常量的饿汉式类似，只不过将类实例化的过程放在了静态代码块中，也是在类加载时执行，并初始化实例。
> > 2. 结论：这种单例模式可用，可能造成内存浪费

3. 懒汉式（线程不安全）

> 优缺点说明：
>
> > 1. 起到了懒加载的效果，但只能在单线程下使用
> > 2. 如果在多线程下，一个线程进入if判断语句未执行完，而另一个线程也通过了if判断语句，此时就会产生多个实例。所以在多线程下不能使用这种方式
> > 3. 结论：实际开发中，不使用该种方式实线单例模式

4. 懒汉式（线程安全，同步方法）

> 优缺点说明：
>
> > 1. 解决了线程不安全的问题
> > 2. 效率问题。每个线程在通过```getInstance()```获取实例时，都要进行同步。其实这个方法只执行一次实例化就可以了，后面想获得该实例，直接```return```就可以。方法执行同步的效率太低了
> > 3. 结论：实际开发中，不推荐使用该种方式

5. 懒汉式（线程安全，同步代码块）

> 优缺点说明：
>
> > 1. 这种方式是想在第四种的基础上做改进，基于同步方法效率低，只同步实例化的过程，即使用了同步代码块
> > 2. 但这种方式并不能起到线程同步的作用，因为第三中方式存在的问题依然存在，便会产生多个实例
> > 3. 结论：实际开发中，不使用该种方式

6. 双重检查

> 优缺点说明：
>
> > 1. Double-Check机制在多线程开发中经常使用到。
> > 2. 两次```if```判断语句，实例化代码只会执行一次，后面再次访问，会在```if```判断为```false```而直接```return```，避免代码反复同步。
> > 3. 线程安全，延迟加载，效率较高
> > 4. 结论：实际开发中，推荐使用该种方式

7. 静态内部类

> 优缺点说明：
>
> > 1. 采用类装载的机制，保证只有一个线程来初始化实例，在类装载时，其他线程无法进入
> > 2. 静态内部类不会在装载外部类时装载，而是在使用该类时才装载，从而实现懒加载
> > 3. 线程安全，延迟加载，效率高
> > 4. 结论：实际开发中，推荐使用该种方式

8. 枚举

> 优缺点说明：
>
> > 1. 借助JDK1.5以后的枚举来实线，不仅能避免多线程同步问题，而且还能防止反序列化重新创建新对象。
> > 2. 这种方式是《Effective Java》作者```Josh Bloch```提倡的
> > 4. 结论：实际开发中，推荐使用该种方式

注意事项和细节说明

1. 单例模式保证了内存中该类只存在一个对象，节省了系统资源，对于需要频繁创建销毁的对象，使用单例模式可以提高系统性能
2. 实例化对象需要特定的方式去获取，而不是简单的new
3. 单例模式使用的场景：需要频繁创建和销毁的对象、创建对象时耗时过多或耗费资源过多（重量级对象），但又经常用到的对象、工具类对象、频繁访问数据库或文件的对象（比如数据源、session工厂等）