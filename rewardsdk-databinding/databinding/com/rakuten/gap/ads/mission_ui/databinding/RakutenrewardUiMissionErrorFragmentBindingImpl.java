package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiMissionErrorFragmentBindingImpl extends RakutenrewardUiMissionErrorFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_errormessage_dangerlogo, 1);
        sViewsWithIds.put(R.id.rakutenreward_errormessage_message, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiMissionErrorFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiMissionErrorFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.rakutenrewardErrormessageRoot.setTag(null);
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
                return onChangeMissionViewModelMissionSuccess((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMissionViewModelMissionSuccess(androidx.databinding.ObservableBoolean MissionViewModelMissionSuccess, int fieldId) {
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
        androidx.databinding.ObservableBoolean missionViewModelMissionSuccess = null;
        boolean missionViewModelMissionSuccessGet = false;
        int missionViewModelMissionSuccessViewGONEViewVISIBLE = 0;
        com.rakuten.gap.ads.mission_ui.viewmodel.MissionViewModel missionViewModel = mMissionViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (missionViewModel != null) {
                    // read missionViewModel.missionSuccess
                    missionViewModelMissionSuccess = missionViewModel.getMissionSuccess();
                }
                updateRegistration(0, missionViewModelMissionSuccess);


                if (missionViewModelMissionSuccess != null) {
                    // read missionViewModel.missionSuccess.get()
                    missionViewModelMissionSuccessGet = missionViewModelMissionSuccess.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(missionViewModelMissionSuccessGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read missionViewModel.missionSuccess.get() ? View.GONE : View.VISIBLE
                missionViewModelMissionSuccessViewGONEViewVISIBLE = ((missionViewModelMissionSuccessGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.rakutenrewardErrormessageRoot.setVisibility(missionViewModelMissionSuccessViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): missionViewModel.missionSuccess
        flag 1 (0x2L): missionViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): missionViewModel.missionSuccess.get() ? View.GONE : View.VISIBLE
        flag 4 (0x5L): missionViewModel.missionSuccess.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}