package com.getlocationbackground.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/getlocationbackground/util/Util;", "", "()V", "isLocationEnabledOrNot", "", "context", "Landroid/content/Context;", "isMyServiceRunning", "serviceClass", "Ljava/lang/Class;", "mActivity", "Landroid/app/Activity;", "showAlertLocation", "", "title", "", "message", "btnText", "app_debug"})
public final class Util {
    public static final com.getlocationbackground.util.Util INSTANCE = null;
    
    public final boolean isMyServiceRunning(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> serviceClass, @org.jetbrains.annotations.NotNull()
    android.app.Activity mActivity) {
        return false;
    }
    
    public final boolean isLocationEnabledOrNot(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void showAlertLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String btnText) {
    }
    
    private Util() {
        super();
    }
}