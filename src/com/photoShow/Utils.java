package com.photoShow;

/**
 * Created with IntelliJ IDEA.
 * User: yanggz
 * Date: 13-10-14
 * Time: 下午1:27
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;


public class Utils {

    public static void CopyStream(InputStream is, File f)
    {
        final int buffer_size=1024;
        try
        {
            OutputStream os = new FileOutputStream(f);

            byte[] buffer=new byte[buffer_size];
            int len = 0;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            os.flush();
            os.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }


    public static byte[] getBytes(InputStream is) throws IOException {
        ByteArrayOutputStream outstream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024]; // 用数据装
        int len = -1;
        while ((len = is.read(buffer)) != -1) {
            outstream.write(buffer, 0, len);
        }
        outstream.close();
        // 关闭流一定要记得。
        return outstream.toByteArray();
    }
}
