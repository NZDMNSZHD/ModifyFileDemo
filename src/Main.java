import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * 约定：
         *      1.Main.java 直接放在 src 目录
         *      2.需要替换的文件 直接放在 src目录
         */
        // 将符合条件的字符串srcStr 替换成 replaceStr
        String srcStr = "Byte";
        String replaceStr = "Integer";

        // 读
        File file = new File("src/SysOperatorExample.java");

        FileReader in = new FileReader(file);
        BufferedReader bufIn = new BufferedReader(in);

        // 内存流, 作为临时流
        CharArrayWriter tempStream = new CharArrayWriter();

        // 替换
        String line = null;

        while ( (line = bufIn.readLine()) != null) {
            // 替换每行中, 符合条件的字符串
            line = line.replaceAll(srcStr, replaceStr);
            // 将该行写入内存
            tempStream.write(line);
            // 添加换行符
            tempStream.append(System.getProperty("line.separator"));
        }

        // 关闭 输入流
        bufIn.close();

        // 将内存中的流 写入 文件
        FileWriter out = new FileWriter(file);
        tempStream.writeTo(out);
        out.close();
    }
}
