package io.github.dmitrikudrenko.pragmaticatextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

public class PragmaticaEditText extends AppCompatEditText implements PragmaticaField {
    public PragmaticaEditText(Context context) {
        super(context);
    }

    public PragmaticaEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            initTypeface(context, attrs);
        }
    }

    public PragmaticaEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            initTypeface(context, attrs);
        }
    }

    private void initTypeface(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.PragmaticaEditText);
        int typeface = array.getInt(R.styleable.PragmaticaEditText_typeface, PragmaticaUtils.BOOK);
        setTypeface(PragmaticaUtils.getTypeface(context, typeface));
        array.recycle();
    }

    public void setTypeface(int typeface) {
        setTypeface(PragmaticaUtils.getTypeface(getContext(), typeface));
    }
}
