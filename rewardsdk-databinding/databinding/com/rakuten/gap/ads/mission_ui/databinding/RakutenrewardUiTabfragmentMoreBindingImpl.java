package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiTabfragmentMoreBindingImpl extends RakutenrewardUiTabfragmentMoreBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_morelist, 2);
        sViewsWithIds.put(R.id.rakutenreward_logo_layout, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiTabfragmentMoreBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiTabfragmentMoreBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
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
        boolean rakutenRewardConfigINSTANCERegionRakutenRewardRegionJP = false;
        android.graphics.drawable.Drawable rakutenRewardConfigINSTANCERegionRakutenRewardRegionJPMboundView1AndroidDrawableRakutenrewardRewardlogoMboundView1AndroidDrawableRakutenrewardRewardlogoGlobal = null;

        if ((dirtyFlags & 0x1L) != 0) {

                // read RakutenRewardConfig.INSTANCE.region
                rakutenRewardConfigINSTANCERegion = com.rakuten.gap.ads.mission_core.RakutenRewardConfig.INSTANCE.getRegion();


                // read RakutenRewardConfig.INSTANCE.region == RakutenRewardRegion.JP
                rakutenRewardConfigINSTANCERegionRakutenRewardRegionJP = (rakutenRewardConfigINSTANCERegion) == (com.rakuten.gap.ads.mission_core.env.RakutenRewardRegion.JP);
            if((dirtyFlags & 0x1L) != 0) {
                if(rakutenRewardConfigINSTANCERegionRakutenRewardRegionJP) {
                        dirtyFlags |= 0x4L;
                }
                else {
                        dirtyFlags |= 0x2L;
                }
            }


                // read RakutenRewardConfig.INSTANCE.region == RakutenRewardRegion.JP ? @android:drawable/rakutenreward_rewardlogo : @android:drawable/rakutenreward_rewardlogo_global
                rakutenRewardConfigINSTANCERegionRakutenRewardRegionJPMboundView1AndroidDrawableRakutenrewardRewardlogoMboundView1AndroidDrawableRakutenrewardRewardlogoGlobal = ((rakutenRewardConfigINSTANCERegionRakutenRewardRegionJP) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.rakutenreward_rewardlogo)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.rakutenreward_rewardlogo_global)));
        }
        // batch finished
        if ((dirtyFlags & 0x1L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView1, rakutenRewardConfigINSTANCERegionRakutenRewardRegionJPMboundView1AndroidDrawableRakutenrewardRewardlogoMboundView1AndroidDrawableRakutenrewardRewardlogoGlobal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
        flag 1 (0x2L): RakutenRewardConfig.INSTANCE.region == RakutenRewardRegion.JP ? @android:drawable/rakutenreward_rewardlogo : @android:drawable/rakutenreward_rewardlogo_global
        flag 2 (0x3L): RakutenRewardConfig.INSTANCE.region == RakutenRewardRegion.JP ? @android:drawable/rakutenreward_rewardlogo : @android:drawable/rakutenreward_rewardlogo_global
    flag mapping end*/
    //end
}