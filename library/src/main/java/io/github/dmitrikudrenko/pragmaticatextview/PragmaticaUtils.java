package io.github.dmitrikudrenko.pragmaticatextview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.util.SparseArray;

public class PragmaticaUtils {
    private static final SparseArray<Typeface> mTypefaces = new SparseArray<>(16);

    public static final int BLACK_OBLIQUE = 0;
    public static final int BLACK = 1;
    public static final int BOLD_OBLIQUE = 2;
    public static final int BOLD = 3;
    public static final int BOOK = 4;
    public static final int CONDENSED_BLACK_OBLIQUE = 5;
    public static final int CONDENSED_BLACK = 6;
    public static final int CONDENSED_BOOK = 7;
    public static final int CONDENSED_EXTRA_LIGHT_OBLIQUE = 8;
    public static final int CONDENSED_EXTRA_LIGHT = 9;
    public static final int CONDENSED_OBLIQUE = 10;
    public static final int EXTRA_LIGHT_OBLIQUE = 11;
    public static final int EXTRA_LIGHT = 12;
    public static final int LIGHT_OBLIQUE = 13;
    public static final int LIGHT = 14;
    public static final int OBLIQUE = 15;

    public static Typeface getTypeface(@NonNull Context context, int typeface) {
        Typeface font = mTypefaces.get(typeface);
        if (font == null) {
            font = initializeFont(context, typeface);
            mTypefaces.put(typeface, font);
        }
        return font;
    }

    private static Typeface initializeFont(@NonNull Context context, int typeface) {
        String typefacePath = "";
        switch (typeface) {
            case BLACK_OBLIQUE:
                typefacePath = "typeface/Pragmatica Black Oblique.ttf";
                break;
            case BLACK:
                typefacePath = "typeface/Pragmatica Black.ttf";
                break;
            case BOLD_OBLIQUE:
                typefacePath = "typeface/Pragmatica Bold Oblique.ttf";
                break;
            case BOLD:
                typefacePath = "typeface/Pragmatica Bold.ttf";
                break;
            case BOOK:
                typefacePath = "typeface/Pragmatica Book.ttf";
                break;
            case CONDENSED_BLACK_OBLIQUE:
                typefacePath = "typeface/Pragmatica Condensed Black Oblique.ttf";
                break;
            case CONDENSED_BLACK:
                typefacePath = "typeface/Pragmatica Condensed Black.ttf";
                break;
            case CONDENSED_BOOK:
                typefacePath = "typeface/Pragmatica Condensed Book.ttf";
                break;
            case CONDENSED_EXTRA_LIGHT_OBLIQUE:
                typefacePath = "typeface/Pragmatica Condensed ExtraLight Oblique.ttf";
                break;
            case CONDENSED_EXTRA_LIGHT:
                typefacePath = "typeface/Pragmatica Condensed ExtraLight.ttf";
                break;
            case CONDENSED_OBLIQUE:
                typefacePath = "typeface/Pragmatica Condensed Oblique.ttf";
                break;
            case EXTRA_LIGHT_OBLIQUE:
                typefacePath = "typeface/Pragmatica ExtraLight Oblique.ttf";
                break;
            case EXTRA_LIGHT:
                typefacePath = "typeface/Pragmatica ExtraLight.ttf";
                break;
            case LIGHT_OBLIQUE:
                typefacePath = "typeface/Pragmatica Light Oblique.ttf";
                break;
            case LIGHT:
                typefacePath = "typeface/Pragmatica Light.ttf";
                break;
            case OBLIQUE:
                typefacePath = "typeface/Pragmatica Oblique.ttf";
                break;
        }
        return Typeface.createFromAsset(context.getAssets(), typefacePath);
    }
}
