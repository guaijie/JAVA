# IDEA里面的facets和artifacts的讲解

## Facets（原型）：

1.  Facets表述了在Module中使用的各种各样的框架、技术和语言。这些Facets让Intellij IDEA知道怎么对待module内容，并保证与相应的框架和语言保持一致。

2.  使用Facets能让我们下载并配置framework所必须的组件，会自动生成各种各样的描述符，并存储在适当的位置，等等。

3.  大多数Facets可以无冲突得添加到Module中。

4.  也有一些Facets是继承其他Facets的，这些Facets的添加就必须先添加他们的父Facets，这些Facets也要依赖Intellij IDEA的相关插件是否开启.

**在Facets中一般需要配置Deployment Descriptors（部署配置文件）、Web Resource Directories(Web 资源目录）、Source Roots（资源根目录）。**

## Modules（模块）：

1.  一个Module可以包含多个Content Root，但但多数情况一个Content Root就够了。在特殊情况下，没有Content Root的module也很有用。

2.  一个Content Root里的文件夹分为以下几类：

    1.  Source Roots：

        标为此类的文件夹，告诉Intellij IDEA，此文件夹及其子文件夹应作为构建过程的一部分进行编译。

    2.  Resource Roots:

        在我们的应用中，是给resource文件用的。如，图片文件、各种各样的xml配置文件和properties属性文件等。

        在构建过程中，所有resource Roots下的内容将原封不动得拷贝到Output文件夹。

    3.  Excluded Roots:

        Intellij IDEA对该文件夹基本忽略，对该文件夹下的文件提供非常有限的代码辅助。即便是搜索，Intellij IDEA也不会查找这个文件夹下的内容。

        把一些不怎么重要的文件夹标记为Excluded Roots，可以提高Intellij IDEA的用户体验。

    4. Test resource roots

        （或测试资源文件夹；如roottestresourceij；只有在java模块）是资源文件与您的测试源有关。在所有其他方面，这些文件夹类似于资源文件夹。

    5. Test source roots (or test source folders; shown as rootTest)

        这些根类似于源根，但用于用于测试的代码（例如用于单元测试）。测试源文件夹允许您将与测试相关的代码与生产代码分开。

    6. Web Resource Dircetories
    
        指的是web资源（html，js等）所在的目录，一般为webapp，如果设置错了会导致启动tomcat时报404，找不到web资源


    **如果一个Module只是作为一个单独的依赖库，显然是不需要Content Root的。**

## artifacts（打包）：

1.  artifact是一个项目资源的组合体。例如，一个已编译的java类的集合，一个已打包的java应用。

2.  artifact可以是一个archive文件，也可以是一个包含以下结构元素的目录结构：

    --（一个或多个）module的编译Output;

    --包含在module的依赖中的Libraries；

    --资源的集合，如web页面，图片，decriptor文件；

    --其他artifacts；

    --个别文件、目录和archives；

3.  常规设置：

    Name ：artifact配置的名称，又或是artifact的名称。

    Type ：artifact的类型

    Output directory ：当执行build(Build | Build Artifacts)时，artifacts将被放到这个指定的目录下。

    Build on make ：当build project(Build | Make Project)时，会自动build artifacts。




# 服务器启动失败或异常

## tomcat 启动失败的几种可能

1.  jdk配置路径错误 

2.  项目未添加tomcat驱动

3.  项目中的web.xml中配置错误，tomcat无法识别

4.  端口被占用
    
## 服务器启动异常的几种可能

1.  web.xml配置错误。默认首面不存在。

2.  Project Structure中未指定Source Folders（**告诉编辑器文件夹及其子文件夹应作为构建过程的一部分进行编译**） 路径或路径错误

3.  Project Structure中未指定Resource Folders（**存放静态资源、xml配置文件和properties属性文件等。构建过程中，所有resource Roots下的内容将原封不动得拷贝到Output文件夹。**） 路径或路径错误

4.  Project Structure中未指定配置文件web.xml路径或路径错误

5.  artifacts没有配置和部署到tomcat中

6.  依赖的架包不存在
