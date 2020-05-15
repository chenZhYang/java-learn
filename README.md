# java-learn
java学习记录

## 内部类学习
 静态内部类、成员内部类、局部内部类、匿名内部类
### 成员内部类
 不能创建静态方法和变量，这个和JVM加载顺序有关，因为静态方法和变量优先加载原则，含有静态方法和变量会导致编译器产生加载顺序的歧义

### 局部内部类
 在方法内使用的类，如果确定该类只有在该方法内使用，可以在方法内创建内部类，也成局部内部类
 
### 匿名内部类
 需要继承一个父类或实现接口来完成，使用过程中不需要声明该类即可直接使用