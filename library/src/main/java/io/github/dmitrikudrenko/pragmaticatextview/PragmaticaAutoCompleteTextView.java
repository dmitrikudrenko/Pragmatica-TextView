package io.github.dmitrikudrenko.pragmaticatextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class PragmaticaAutoCompleteTextView extends AutoCompleteTextView implements PragmaticaField {
    public PragmaticaAutoCompleteTextView(Context context) {
        super(context);
    }

    public PragmaticaAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
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
