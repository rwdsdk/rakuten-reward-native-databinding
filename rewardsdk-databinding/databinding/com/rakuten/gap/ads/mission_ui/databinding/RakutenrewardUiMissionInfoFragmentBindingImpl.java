package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiMissionInfoFragmentBindingImpl extends RakutenrewardUiMissionInfoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_infomessage_infologo, 1);
        sViewsWithIds.put(R.id.rakutenreward_infomessage_message, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiMissionInfoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiMissionInfoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.rakutenrewardInfomessageRoot.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.missionViewModel == variableId) {
            setMissionViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.MissionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMissionViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.MissionViewModel MissionViewModel) {
        this.mMissionViewModel = MissionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.missionViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMissionViewModelMissionInfoVisible((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMissionViewModelMissionInfoVisible(androidx.databinding.ObservableBoolean MissionViewModelMissionInfoVisible, int fieldId) {
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
        boolean missionViewModelMissionInfoVisibleGet = false;
        androidx.databinding.ObservableBoolean missionViewModelMissionInfoVisible = null;
        int missionViewModelMissionInfoVisibleViewVISIBLEViewGONE = 0;
        com.rakuten.gap.ads.mission_ui.viewmodel.MissionViewModel missionViewModel = mMissionViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (missionViewModel != null) {
                    // read missionViewModel.missionInfoVisible
                    missionViewModelMissionInfoVisible = missionViewModel.getMissionInfoVisible();
                }
                updateRegistration(0, missionViewModelMissionInfoVisible);


                if (missionViewModelMissionInfoVisible != null) {
                    // read missionViewModel.missionInfoVisible.get()
                    missionViewModelMissionInfoVisibleGet = missionViewModelMissionInfoVisible.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(missionViewModelMissionInfoVisibleGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read missionViewModel.missionInfoVisible.get() ? View.VISIBLE : View.GONE
                missionViewModelMissionInfoVisibleViewVISIBLEViewGONE = ((missionViewModelMissionInfoVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.rakutenrewardInfomessageRoot.setVisibility(missionViewModelMissionInfoVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): missionViewModel.missionInfoVisible
        flag 1 (0x2L): missionViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): missionViewModel.missionInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): missionViewModel.missionInfoVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}