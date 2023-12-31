# LINE WORKS API基礎 サンプルコード

## 目次 <!-- omit in toc -->

- [概要](#概要)
- [使用方法](#使用方法)
  - [前提条件](#前提条件)
  - [事前準備](#事前準備)
  - [サンプルプロジェクトのクローン](#サンプルプロジェクトのクローン)
  - [アプリケーション起動](#アプリケーション起動)
  - [アプリケーション起動後設定](#アプリケーション起動後設定)
    - [ポート転送設定](#ポート転送設定)
    - [Callback URL設定](#callback-url設定)
  - [動作確認方法](#動作確認方法)
- [問合せ先](#問合せ先)

## 概要

LINE WORKS APIとBotを利用した、ユーザーが送信したメッセージをBotがオウム返しするサンプルコードです。

## 使用方法

### 前提条件

- [Visual Studio Code](https://code.visualstudio.com/download)（バージョン1.82以上）がインストール済み
- [Gradle](https://gradle.org/releases/)がインストール済み
- [Java SE 17（LTS）](https://www.oracle.com/jp/java/technologies/downloads/)がインストール済み
- [GitHub](https://github.co.jp/)のアカウントを作成済み
- [Git](https://git-scm.com/downloads)がインストール済み

各種のインストール方法およびアカウント作成方法はリンク先を参照してください。

### 事前準備

- [LINE WORKSのアカウントを新規開設](https://join.worksmobile.com/jp/joinup/step1)

- [Developer Console](https://dev.worksmobile.com/jp/console/openapi/v2/app/list/view)から`Bot`と`アプリ`を新規作成

- 本プロジェクト内の[application.properties](./src/main/resources/application.properties)で設定している環境変数の値を更新（値はすべてDeveloper Consoleから取得できます）

### サンプルプロジェクトのクローン

コマンドライン実行画面から、次のコマンドを実行してください。

```shell
git clone https://github.com/solxyz-jsn/lineworks-sample
```

### アプリケーション起動

Visual Studio Codeでフォルダ`lineworks-sample`を開いてください。

左メニューの`JAVA PROJECT`から、プロジェクト`lineworks-sample`を右クリックして`Run`を選択してください。

<img alt="起動" src="image/sample_bot_setting05.png" width="60%">

（画像のVisual Studio Codeはバージョン1.83です）

補足として、Visual Studio Code上でターミナルを開いていれば、ターミナルから次のコマンドを実行しても起動できます（`build.gradle`と同一のディレクトリから実行すること）。

```shell
./gradlew bootRun
```

### アプリケーション起動後設定

起動後に行う設定の詳細は、[SOLXYZ Academy](https://academy.solxyz.co.jp)内コース「LINE WORKS API基礎」でも説明を記載しています。併せて参考にしてください。

#### ポート転送設定

LINE WORKSからのHTTPS POSTリクエストを受信するために、ポート転送の設定を行う必要があります。この手順には、**GitHubのアカウントが必須**となります。

Visual Studio Code上でターミナルを開いてください。

タブ`ポート`を押下して、`ポートの転送`を押下してください。ポート入力欄には、[application.properties](./src/main/resources/application.properties)の`server.port`で設定しているポート番号（デフォルトでは`8080`）を入力してください

<img alt="ポート番号" src="image/sample_bot_setting01.png" width="80%">

初めてポート転送設定を行う場合は、GitHubアカウントによるサインインを確認するポップアップが表示されるので、`許可`を押下してGitHubアカウントのサインインを行ってください。

<img alt="許可" src="image/sample_bot_setting02.png" width="60%">

しばらく待機すると、URLが発行されます。

次に、LINE WORKSからの通信を許可するために、表示範囲を変更します。右クリックから`ポートの表示範囲`を`公開`に設定してください。

<img alt="公開" src="image/sample_bot_setting03.png" width="80%">

#### Callback URL設定

LINE WORKSがCallbackをアプリケーションへ送信できるように、[Developer ConsoleのBot画面](https://dev.worksmobile.com/jp/console/bot/view)からCallbackの送信先URL（以降、Callback URL）を設定します。

Callback URL入力欄には、次の値を入力してください。

```txt
{Visual Studio Codeで発行したURL} + callback
```

入力例は次のようになります。

<img alt="Callback URL" src="image/sample_bot_setting04.png" width="60%">

### 動作確認方法

LINE WORKSから実際にメッセージを送信して動作確認を行います。Webブラウザ、Webアプリ、モバイルアプリいずれでも問題ありません。

Botとのトークルームからメッセージを送信すると、Botがそのメッセージをオウム返しします。

<img alt="通信完了" src="image/sample_bot_reply01.png" width="60%">

## 問合せ先

`jsn-support@solxyz.co.jp`までお問合せください。
