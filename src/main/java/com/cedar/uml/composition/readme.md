类图---组合关系（Composition）

组合关系也是整体和部分的关系，但是整体和部分不可分开

组合关系和聚合关系的例子：定义实体Person、IDCard、Head，Person可以没有IDCard，但Person不可以无Head，那么IDCard聚合到Person，Head组合到Person

```java
public class Person {
   private IDCard idCard;
   private Head head = new Head();
}

public class IDCard {}
public class Head {}
```

如果程序中Person实体中定义了对IDCard的**级联删除**，即删除Person时连同IDCard一起删除，那么IDCard和Person就是组合了。