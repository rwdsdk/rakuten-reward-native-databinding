package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiPortalActivityBindingImpl extends RakutenrewardUiPortalActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"rakutenreward_ui_toolbar"},
            new int[] {2},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tab_layout, 3);
        sViewsWithIds.put(R.id.pager, 4);
        sViewsWithIds.put(R.id.fullscreen_loading, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiPortalActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiPortalActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.viewpager.widget.ViewPager) bindings[4]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) bindings[2]
            , (com.google.android.material.tabs.TabLayout) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.rakutenrewardToobar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        rakutenrewardToobar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (rakutenrewardToobar.hasPendingBindings()) {
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
        rakutenrewardToobar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRakutenrewardToobar((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRakutenrewardToobar(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding RakutenrewardToobar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.rakutenrewardToobar.setToolbarLeftIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.rakutenreward_close_grey));
            this.rakutenrewardToobar.setToolbarText(getRoot().getResources().getString(R.string.rakutenrewardsdk_tab_home));
        }
        executeBindingsOn(rakutenrewardToobar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rakutenrewardToobar
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}