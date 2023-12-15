# LINE WORKS API基礎 サンプルコード

## 概要

LINE WORKS APIとBotを利用した、ユーザーが送信したメッセージをオウム返しするサンプルコードです。

## 使用方法

### 前提条件

- Gradleがインストール済みである
- Java SE 17（LTS）がインストール済みである

### 事前準備

- LINE WORKSのアカウントを新規開設する

アカウント新規作成：<https://join.worksmobile.com/jp/joinup/step1>

- Developer ConsoleからLINE WORKS Botを新規作成する
- Developer Consoleからアプリを新規登録する

Developer Console：<https://dev.worksmobile.com/jp/console/openapi/v2/app/list/view>

- 本プロジェクト内の`application.properties`で設定している環境変数の値を書き換える

### 起動

`build.gradle`が格納されているディレクトリからターミナルを開き、以下のコマンドを実行してください。

```shell
./gradlew bootRun
```

以下のような起動画面が表示されます。

```txt
> Task :bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.0)
```

LINE WORKSからのCallbackを受信するために、Developer ConsoleのBot設定からCallback URLを設定してください。

Bot設定：<https://dev.worksmobile.com/jp/console/bot/view>

Botとのトークルームからメッセージを送信すると、そのメッセージをオウム返しします。

<img alt="通信完了" src="image/sample_bot_reply01.png" width="60%">

## 問合せ先

`jsn-support@solxyz.co.jp`までお問合せください。
