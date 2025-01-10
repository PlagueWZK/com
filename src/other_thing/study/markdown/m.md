# 傻逼王忠睿

## 粗体

这是一个**粗体**文字  
__或者你可以这样__  
这样 __也__ 可以,或**这样**

## 斜体

这 _样_ 子
*或者这样也可以*

***还可以又斜体又加粗***

## 删除线

~~还可有删除线~~

~~***杂交***~~
***~~杂交~~***

## 分割线:👇

***
___
 * * * *    *  *
- - -
## 下划线
<u>haha</u>
## 表情
:smile:
## 分级标题:

>
> ## 二级标题:王忠睿傻逼
> ### 三级标题：傻逼宋俊浩
> #### 四级
> ##### 五级
> ###### 六级 (最高)

> 也可以一级标题
> =
> 或者二级标题
> -

## 无序列表

* 我是一个
* 我是第二

+ 我是第一,使用不同符号会认为是另一个同级列表(即中间有空格)
+ 第二个

- 第一个
- 第二个

## 有序列表 & 嵌套

1. 的
2. 有序
3. 列表
    * 认为是二级
    * 列表
        1. 三级列表
        2. 有序的  
           换行，但是仍被认为是三级列表内内容
    * 在一个
4. 回溯

## 勾选框&嵌套

* [ ] 勾选框
    * [x] 打勾的框
        1. [ ] 或者说这样

- [ ] 不同列表符号都可以

## 代码块

### 可以使用四个空格(或者说一个制表符)

        #include<iostream>
        int main() {
            std::cout<<"Hello world!<<std::endl;
            return 0; 
        }

### 或者：

```c++
#include<iostream>
int main(){}
```

在```后边加上语言名

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

### 句内的代码块

***example:*** 我们比较两个字符串对象时用`equals()`方法，而不是用 `==`。

## 引用

> Markdown 是一种轻量级标记语言,
> - 创始人为约翰·格鲁伯（John Gruber）。
>
> 它允许人们使用易读易写的纯文本格式编写文档，然后转换成有效的 XHTML（或者HTML）文档。这种语言吸收了很多在电子邮件中已有的纯文本标记的特性。
>> 嵌套

- 无序列表
  > 引用
  >> 引用嵌套
- 列表

## 链接

### 单链接

前往[百度](https://www.baidu.com)查看

### 标题跳转
参考[标题](#多链接组织)

### 多链接组织

[想要][a]购买[XXX][b]请前往[官网][c]

[a]: https://www.baidu.com

[b]: https://www.baidu.com

[c]: https://www.baidu.com

## 脚注

IDEA不支持的脚注[^1]

[^1]:XXX

## 插入图片

![对图片的描述](https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png)

## 表格

| 名字  | 年龄 | 性别 | 性质 |
|:---:|:---|---:|----|
| 小明  | 18 |  男 | 群众 |
| 小红  | 17 |  女 | 团员 |
| 王忠睿 | 21 |  ? | 傻逼 |

减号处的冒号`:`在哪表示向哪对齐

## 使用HTML代码

<img style="width: 200px;height: 200px" src="https://s2.loli.net/2025/01/08/6QXK2s1byfHtadT.png" alt="图片插入">

## 数学类

x<sup>2</sub>

x<sub>2</sub>

$x + 5 = 6$

$$
x + 6 - 8 = 5  
$$

$\frac{1}{2}$

$\frac{1}{2} + \frac{1}{3} = \frac{5}{6}$

$\sqrt{x + 5} = 6$

$x^2$

$\sqrt[y]{\{[(4+x)-3]\}}$

$$
\not=
\not\equiv
\leq
\geq
\times
\div
\pm
\sum
\prod
\coprod
\overline(1+2+3+4)
\sin
$$

