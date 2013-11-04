package com.photoShow;

/**
 * Created with IntelliJ IDEA.
 * User: yanggz
 * Date: 13-10-14
 * Time: 下午1:27
 * 统一存储用到的文件,缓存图片等等需要。
 */
import java.io.File;
import android.content.Context;

public class FileCache {

    private File cacheDir;
    private static final String FILE_PATH="T3PhotoShow";

    public FileCache(Context context){
        //产生一个用来缓存图片的路径
        if (android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED))
            cacheDir=new File(android.os.Environment.getExternalStorageDirectory(),FILE_PATH);
        else
            cacheDir=context.getCacheDir();
        if(!cacheDir.exists())
            cacheDir.mkdirs();
    }

    public File getFile(String url){

        String filename=String.valueOf(url.hashCode());
        File f = new File(cacheDir, filename);
        return f;

    }

    public void clear(){
        File[] files=cacheDir.listFiles();
        if(files==null)
            return;
        for(File f:files)
            f.delete();
    }

}
