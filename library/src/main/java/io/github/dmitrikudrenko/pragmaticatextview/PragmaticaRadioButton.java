package io.github.dmitrikudrenko.pragmaticatextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class PragmaticaRadioButton extends RadioButton {
    public PragmaticaRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.PragmaticaRadioButton);
            int typeface = array.getInt(R.styleable.PragmaticaRadioButton_typeface, PragmaticaUtils.BOOK);
            setTypeface(PragmaticaUtils.getTypeface(context, typeface));
            array.recycle();
        }
    }
}
