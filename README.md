# template-utils-sql
template-projects中的内置简单sql生成工具

## 更新日志 ## 
#### 1.2.2
+ 优化判断功能

#### 1.2.1
+ bug fixed 获取主键变量

#### 1.2.0
+ 增加SQLBeanBuilder中可以获取表名、主键变量以及所有字段的方法

#### 1.1.5
+ bug fixed

####1.1.2
+ bug fixed

#### 1.1.1
+ bug fixed

#### 1.1.0
+ 增强/修正：可以获取到父类的变量以及所有public、private变量

#### 1.0.0发布日志
- 初始版本发布

## 开始使用 ##
> maven 坐标  最新版本号请至中央仓库查询 当前 ```1.0.0```（2017年3月29日）
```xml
<dependency>
  <groupId>me.wuwenbin</groupId>
  <artifactId>template-utils-sql</artifactId>
  <version>${template-version}</version>
</dependency>
```
## 要求 
- jdk 1.7 以上
- 配合 `template-modules-dao` 使用更佳

## 文档
> 主要包括2个类方法 SQLBeanBuilder 和 SQLStrBuilder
- [入口方法](https://github.com/miyakowork/template-utils-sql/wiki/入口方法)
- [SQLBeanBuilder方法指南](https://github.com/miyakowork/template-utils-sql/wiki/SQLBeanBuilder方法指南)
- [SQLStrBuilder方法指南](https://github.com/miyakowork/template-utils-sql/wiki/SQLStrBuilder使用文档)
