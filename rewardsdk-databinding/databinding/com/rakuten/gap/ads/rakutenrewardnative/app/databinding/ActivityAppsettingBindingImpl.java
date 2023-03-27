package com.rakuten.gap.ads.rakutenrewardnative.app.databinding;
import com.rakuten.gap.ads.rakutenrewardnative.app.R;
import com.rakuten.gap.ads.rakutenrewardnative.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAppsettingBindingImpl extends ActivityAppsettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"appsetting_row_title_value", "appsetting_row_title_value"},
            new int[] {4, 5},
            new int[] {com.rakuten.gap.ads.rakutenrewardnative.app.R.layout.appsetting_row_title_value,
                com.rakuten.gap.ads.rakutenrewardnative.app.R.layout.appsetting_row_title_value});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.settings_env, 2);
        sViewsWithIds.put(R.id.settings_app, 3);
        sViewsWithIds.put(R.id.finish_button, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.rakuten.gap.ads.rakutenrewardnative.app.databinding.AppsettingRowTitleValueBinding mboundView11;
    @Nullable
    private final com.rakuten.gap.ads.rakutenrewardnative.app.databinding.AppsettingRowTitleValueBinding mboundView12;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAppsettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityAppsettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (bindings[3] != null) ? com.rakuten.gap.ads.rakutenrewardnative.app.databinding.AppsettingRowAppcodeValueBinding.bind((android.view.View) bindings[3]) : null
            , (bindings[2] != null) ? com.rakuten.gap.ads.rakutenrewardnative.app.databinding.AppsettingRowEnvSelectorBinding.bind((android.view.View) bindings[2]) : null
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.rakuten.gap.ads.rakutenrewardnative.app.databinding.AppsettingRowTitleValueBinding) bindings[4];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (com.rakuten.gap.ads.rakutenrewardnative.app.databinding.AppsettingRowTitleValueBinding) bindings[5];
        setContainedBinding(this.mboundView12);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView12.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        if ((dirtyFlags & 0x1L) != 0) {
            // api target 1

            this.mboundView11.setTitle(getRoot().getResources().getString(R.string.app_setting_menu_env));
            this.mboundView12.setTitle(getRoot().getResources().getString(R.string.app_setting_menu_app));
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}