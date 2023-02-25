package org.example;

import java.io.*;

/**
 * author: f19t
 * Date: 2023/2/20 21:13
 */
public class test {
    public String readFromByteFile(String pathname) throws IOException{
        File filename = new File(pathname);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(filename));
        ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
        byte[] temp = new byte[1024];
        int size = 0;
        while((size = in.read(temp)) != -1){
            out.write(temp, 0, size);
        }
        in.close();
        byte[] content = out.toByteArray();
        String s = "byte[] testClassBytes = new byte[]{";
        int m=0;

        for (int i = 0; i < content.length; i++) {
            s = s + content[i];
            s = s + " ,";
            m++;
            if (m ==15) {
                m = 0;
                s = s + "\n";
            }
        }
        s = s + "};";
        return s;
    }



}
