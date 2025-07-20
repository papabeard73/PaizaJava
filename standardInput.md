```
// 1行の数値が半角スペース区切りで与えられる
// 標準入力を受け付けるスキャナ
BufferedReader reader = new BufferedReader(new InputStreamReader(in));
String line = reader.readLine(); // 1行読み込む

if (line == null) {
    throw new IOException("failed to read input");
}

String[] inputs = line.split(" "); // スペースで分割

```
```
// 文字列をスペースで分割する
String[] words = new Scanner(System.in).nextLine().split(" ");
```
```
// 数値に変換する
BufferedReader reader = new BufferedReader(new InputStreamReader(in));
String line = reader.readLine(); // 1行読み込む
int num = Integer.parseInt(line);
```
```
// for文
for (int i = 0; i < num; i++){}
```
- Scanner sc = new Scanner(in); とは？
  - in（InputStream）をラップし、空白（スペース/改行/タブ）で区切った「トークン」単位に読み取れるユーティリティ。
  - 既定の文字コードはプラットフォーム依存。Paizaなら UTF-8 なので問題なし（明示したければ new Scanner(in, StandardCharsets.UTF_8)）。
```
Scanner sc = new Scanner(in);          // ストリーム全体を対象
// sc.useDelimiter("[,;\\s]+");        // 区切り文字を変えたいとき
```
- sc.nextInt() / sc.nextDouble() の意味
  - 次のトークンを取得し、指定の型に変換して返すメソッド。
    - 変換できない文字列が来ると InputMismatchException が発生（Go の strconv.Atoi 等と同じ）。 
    - 読み取り位置はトークン単位で自動で進むので、改行有無を意識しなくてよい。
```
int q = sc.nextInt();      // 例：先頭の整数
double n = sc.nextDouble();// 続く浮動小数
int m = sc.nextInt();      // さらに整数
```
```
public static String exec(InputStream in) throws IOException {}
```