package com.victorai60.mylibrary;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author Victor
 * @date 2016-05-29 14:55
 */
public class MyLibraryTest extends TextView {
    public MyLibraryTest(Context context) {
        super(context);
    }

    public MyLibraryTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLibraryTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyLibraryTest(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
