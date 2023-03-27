package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiTwLegalTextBindingImpl extends RakutenrewardUiTwLegalTextBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiTwLegalTextBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiTwLegalTextBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
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
        com.rakuten.gap.ads.mission_core.env.RakutenRewardRegion rakutenRewardConfigINSTANCERegion = null;
        int rakutenRewardConfigINSTANCERegionRakutenRewardRegionTWViewVISIBLEViewGONE = 0;
        boolean rakutenRewardConfigINSTANCERegionRakutenRewardRegionTW = false;

        if ((dirtyFlags & 0x1L) != 0) {

                // read RakutenRewardConfig.INSTANCE.region
                rakutenRewardConfigINSTANCERegion = com.rakuten.gap.ads.mission_core.RakutenRewardConfig.INSTANCE.getRegion();


                // read RakutenRewardConfig.INSTANCE.region == RakutenRewardRegion.TW
                rakutenRewardConfigINSTANCERegionRakutenRewardRegionTW = (rakutenRewardConfigINSTANCERegion) == (com.rakuten.gap.ads.mission_core.env.RakutenRewardRegion.TW);
            if((dirtyFlags & 0x1L) != 0) {
                if(rakutenRewardConfigINSTANCERegionRakutenRewardRegionTW) {
                        dirtyFlags |= 0x4L;
                }
                else {
                        dirtyFlags |= 0x2L;
                }
            }


                // read RakutenRewardConfig.INSTANCE.region == RakutenRewardRegion.TW ? View.VISIBLE : View.GONE
                rakutenRewardConfigINSTANCERegionRakutenRewardRegionTWViewVISIBLEViewGONE = ((rakutenRewardConfigINSTANCERegionRakutenRewardRegionTW) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(rakutenRewardConfigINSTANCERegionRakutenRewardRegionTWViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
        flag 1 (0x2L): RakutenRewardConfig.INSTANCE.region == RakutenRewardRegion.TW ? View.VISIBLE : View.GONE
        flag 2 (0x3L): RakutenRewardConfig.INSTANCE.region == RakutenRewardRegion.TW ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}