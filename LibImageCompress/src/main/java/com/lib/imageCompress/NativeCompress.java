package com.lib.imageCompress;

import android.graphics.Bitmap;

/**
 * author: heshantao
 * data: 2017/9/8.
 * 调用jni 的图片压缩
 */

public class NativeCompress {

    static {
        System.loadLibrary("picture-compress");
    }

    public NativeCompress() {
    }

    /**
     * 使用native方法进行图片压缩。
     * Bitmap的格式必须是ARGB_8888 {@link Bitmap.Config}。
     *
     * @param bitmap   图片数据
     * @param quality  压缩质量
     * @param dstFile  压缩后存放的路径
     * @param optimize 是否使用哈夫曼算法
     * @return 结果
     */
    public static native int nativeCompressBitmap(Bitmap bitmap, int quality, String dstFile, boolean optimize);

    public static native int nativeCompressBitmapWithWidthAndHeight(Bitmap bitmap, int w, int h, int quality, String dstFile, boolean optimize);


}
