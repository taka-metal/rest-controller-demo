# rest-controller-demo
restControllerのレスポンスを確認したいデス

## 比較

### @RestController

RESTful Webサービスを簡単に作成するために使用される  

□特徴  
・メソッドの戻り値は自動的にJSONやXMLなどの形式に変換され、HTTPレスポンスボディに書き込まれる  
・RESTful APIのエンドポイントを作成する場合に使用される

### @Controller

Spring MVCで通常のWebアプリケーション（例えば、HTMLを返すビューのレンダリング）を作成する際に使用される  

□特徴  
・メソッドはビュー（通常はJSP、Thymeleaf、Freemarkerなど）を返す  
・コントローラーメソッドはビュー名を返し、ビューリゾルバがそれに対応するHTMLページなどをレンダリングする  

## 実行手順
□事前準備  
APIテストツールのインストール  
例えば、ChromeならAPI Testerという拡張機能をダウンロード
1. プロジェクトのルートディレクトリで以下のコマンドを実施
```
./gradlew bootRun
```
2. ブラウザでhttp://localhost:8080/api/greetingやhttp://localhost:8080/web/greetingで検索
3. API Testerで同様のURIを入力し、レスポンス形式がそれぞれJSONとHTMLであることを確認
