package com.android.core.control.image;

import android.content.Context;
/**
 * @author: 蜡笔小新
 * @date: 2016-08-01 16:42
 * @GitHub: https://github.com/meikoz
 */
public class ImageLoaderProxy implements LoaderI{

    static ImageLoaderProxy mProxy;
    final GlideLoaderStrategy mStrategy;

    ImageLoaderProxy() {
        mStrategy = new GlideLoaderStrategy();
    }

    // 单例获取唯一对象
    public static ImageLoaderProxy getInstance() {
        if (mProxy == null) {
            synchronized (ImageLoaderProxy.class) {
                mProxy = new ImageLoaderProxy();
            }
        }
        return mProxy;
    }

    @Override
    public void load(Context context, ImageLoader var1) {
        mStrategy.load(context, var1);
    }

    @Override
    public void animate(Context context, ImageLoader var2) {
        mStrategy.animate(context,var2);
    }

    @Override
    public void transform(Context context, ImageLoader var3) {
        mStrategy.transform(context,var3);
    }

}
