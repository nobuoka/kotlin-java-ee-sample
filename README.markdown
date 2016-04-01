Kotlin で Java EE アプリケーションを書くサンプル
==================================================

Kotlin を使って Java EE アプリケーションを書いてみるサンプルプロジェクトです。

* [Kotlin](https://kotlinlang.org/) 1.0
* [Gradle](http://www.gradle.org/) — Build Automation tool
* [Payara Micro](http://www.payara.fish/) — Java EE application server (derived from GlassFish)

Java EE の機能としては以下のものを使用しています。

* CDI
* JAX-RS
* MVC 1.0 (Java EE 8)
* JPA (Derby)

Derby を使用しており、実行時に DB の生成を行うため、特に DB の用意をすることなく実行して試すことができます。

## プロジェクト構成

2 つのサブプロジェクトから成ります。

* `application` プロジェクト : Java EE アプリケーション本体。
* `payaraServer` プロジェクト : `application` プロジェクトのアプリケーションを Payara Micro 上で実行するプロジェクト。

## ビルドと実行

### Prerequisites

* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### Running on Payara Micro

```
./gradlew run
```
