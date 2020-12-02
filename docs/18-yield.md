# Scala yield

yield 读音 `ji:ld` ，在Java总没有 yield 相关语法与设计；其他比如 python / javascript 等语言总，yield 也有不同的实现机制与解释；

在 Javascript 中，yield 函数会被解释成 `生成器` ，如下代码

```javascript
// Javascript代码
// function* 和 yield 一起使用来声明生成器函数（Generator）
var func = function* (arr) {
    console.log('start')
    for (var i in arr) {
        console.log(arr[i])
        // 方法通过生成器next方法执行，每次执行到 yield 返回一个对象，包含value、done属性；
        // value就是当前yield后跟着的属性值，done表示是否完成
        yield arr[i]
    }
    console.log('end')
}
// func不会立即执行，而是返回一个生成器对象
var generator = func([12, 3, 4, 56])
console.log(Object.prototype.toString.call(generator))

while (!(rt = generator.next()).done) {
    console.log(rt.value)
}
```



不同于Javascript，在Scala中，yield只能用于for循环中，在 for 循环中yield会把当前元素记录下来，缓存在集合中，类似一个内部的缓冲区，等遍历完成之后再返回该集合，语法如下：

```scala
var it = for( 遍历 ) yield { 变量或者表达式 }
```

用例1:

```scala
var arr = Array(1, 2, 3, 4, 5)

var g = for (arr <- arr) yield {
        println(arr)
        arr * 2
      }

println("--------")

g.foreach(println(_))
```







