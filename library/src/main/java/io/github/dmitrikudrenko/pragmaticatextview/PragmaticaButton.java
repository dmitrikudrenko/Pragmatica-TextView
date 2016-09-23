package io.github.dmitrikudrenko.pragmaticatextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class PragmaticaButton extends AppCompatButton implements PragmaticaField {
    public PragmaticaButton(Context context) {
        super(context);
    }

    public PragmaticaButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            initTypeface(context, attrs);
        }
    }

    public PragmaticaButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            initTypeface(context, attrs);
        }
    }

    private void initTypeface(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.PragmaticaButton);
        int typeface = array.getInt(R.styleable.PragmaticaButton_typeface, PragmaticaUtils.BOOK);
        setTypeface(PragmaticaUtils.getTypeface(context, typeface));
        array.recycle();
    }

    public void setTypeface(int typeface) {
        setTypeface(PragmaticaUtils.getTypeface(getContext(), typeface));
    }
}
