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
int num = Integer.parseInt(sc.nextLine());
```
```
// for文
for (int i = 0; i < num; i++){}
```
