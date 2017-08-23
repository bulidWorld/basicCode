## 基础篇
+ String
    * String.join();
    * StringBuffer/StringBuilder
    * StringUtils
+ 变量命名放在循环体外边
```java
......
......
//good
String s = "";
for(...){
    //bad
    String s = "";
    //do sth
}
......
......

```
*****
## 异常篇
+ try finally
```java
......
......
    try{
    //do sth
    }catch(Exp e){
        //Do LOG or others
    }finally{
        //release resource
    }
......
......
```
+ try resource
```java
......
......

try(InputStream is = Files.newInputStream(Path)){
    //read source
}

......
......
```
+ 异常捕捉放在for循环外边
```java
......
......
//bad
for (...){
    try{
        //do sth
    }catch (Exp e){
        //LOG
    }
}
//good
try{
    for(...){
        //do sth
    }
}catch(Exp e){
    //LOG
}
......
......
```
*****
## 集合篇
+ 初始化应设置集合的大小
```java
......
......
//good
List li = new ArrayList(int initSize);
//bad
List li = new ArrayList();
......
......
```
+ 遍历集合
```java
......
......
//bad
for(Object o: list){
    if (Predicate(o)){
        //remove throw Exp
        list.remove(o);
    }
}

//good
Iterator it = list.iterator();
while(it.hasNext()){
    if(Predicate(it.next())){
        it.remove();
    }
}
......
......
```
+ 集合内保存的对象应重写equals,hashCode方法
```java
......
......
@Override
public boolean equals(Object o){
    if (this == o) return true;
    if (o == null) return false;
    if (getClass != o.getClass()) return false;

    return new EqualsBuilder().append(attr1, (Cast)o.attr1).append(attr2, (Cast)o.attr2,...).isEquals();
}

@Override
public int hashCode(){
    return new HashCodeBuilder().append(attr1).append(attr2)....append(attrn).toHashCode();
}
......
......

```
+ 返回值为集合的方法不要返回null,应返回一个空的集合
```java
......
......
public List returnList(){
    //do sth

    //not hava data
    //bad
    return null;
    //good
    return Collections.emptyList(); 
}
......
......
```
+ 可通过Collections.synchronized...(obj)转化为线程安全的集合
```java
......
......
    List li = new ArrayList(initSize);
    ...
    //need Concurrent operate li
    List synList = Collections.synchronized(li);
    // some thread operate synList

......
......
```
### List
+ ArrayList
    * 底层是数组方式实现，插入慢，查找快

+ LinkedList
    * 底层是链表方式实现，插入快，查找慢

+ CopyOnWriteList
    * 并发容器

### Set
+ HashSet
    * 无序，算法复杂度O(1)

+ TreeSet
    * 实现SortedSet
    * 排序，算法复杂度O(log n)
    * 构造器传Comparator接口实现
    
+ LinkedHashSet
    * 根据插入的顺序来排序，算法复杂度O(1) 

### Map
+ HashMap
    * 无序，算法复杂度O(1) 
    
+ LinkedHashMap
    * 排序，算法复杂度O(log n) 

+ ConcurrentHashMap
    * 并发容器，线程安全
    
+ 新增方法forEach直接遍历Map集合
```java
......
......
Map.forEach((key, value) -> doSth);
......
......
```
*****
## Lambda experssion篇
+ 参数行为化
+ cleaner code
+ 类型推导

*****
## Stream篇
+ 过滤 (filter)
```java
......
......
filteredList = list.stream().filter(Predicat).collect(Collectors.sth);
......
......
```
+ 排序 (sort)
```java
......
......
sortedList = list.stream().sorted(Comparator).collect(Collectors.sth);
......
......
```
+ 映射 (map)
```java
......
......
otherList = list.stream().map(Function).collect(Collectors.sth);
......
......
```
+ 遍历 (forEach)------>终止操作
```java
......
......
list.stream().forEach(Consumer);
......
......
```
+ 匹配（allMatch, anyMatch）
```java
......
......
boolean isAllMatch = list.stream().allMatch(Predicate);

boolean isAnyMatch = list.stream().anyMatch(Predicate);
......
......
```

*****
## 工具篇
### IDEA
+ 调试技巧
    * 条件断点
    * 自定义调试代码
+ class文件反编译
+ 快捷键

### visio
+ 静态图
+ UML

### POSTMAN
+ 调试接口

### MARKDOWN
+ 简明，易用NOTE工具

### 印象笔记
+ 网页剪藏
+ 保存微信文章


*****
## 扩展篇
+ 微信号
    * importNew
    * 码农翻身
+ 网站
    * GitHub
    * stackoverflow
    * toturialpoint
+ 书籍
    * java ee toturial
    * head first 设计模式
    * In Action 系列


