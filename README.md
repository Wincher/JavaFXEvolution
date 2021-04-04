# JavaFXEvolution
>从零开始感受架构演进

### How to build a JavaEE application
> 1. 使用JavaEE 提供的基础API构建应用, 并逐渐构建通用工具, 逐渐抽象出类Spring的开发框架
使用mvn命令构建应用
` mvn archetype:generate -DgroupId=cn.wincher -DartifactId=stage0 -DarchetypeArtifactId=maven-archetype-quickstart `
> 
> 1. 添加基本`javax.servlet.api`支持, 添加`web.xml`[web.xml Sample](https://docs.oracle.com/cd/E19857-01/819-6518/abxii/index.html),  使用`war`插件指定`web.xml`位置
> 1. 可用`mvn package`打出`war`包, 并在`Tomcat`部署, 也可使用IDEA配置
