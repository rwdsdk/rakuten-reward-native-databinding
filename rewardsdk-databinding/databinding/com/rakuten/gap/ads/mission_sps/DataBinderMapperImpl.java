package com.rakuten.gap.ads.mission_sps;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rakuten.gap.ads.mission_sps.databinding.LayoutRewardUnclaimedCounterBindingImpl;
import com.rakuten.gap.ads.mission_sps.databinding.RakutenRewardSpsHeaderBindingImpl;
import com.rakuten.gap.ads.mission_sps.databinding.RakutenRewardSpsModeSettingActivityBindingImpl;
import com.rakuten.gap.ads.mission_sps.databinding.RakutenRewardSpsPortalHeaderBindingImpl;
import com.rakuten.gap.ads.mission_sps.databinding.RakutenRewardSpsPortalMoreActivityBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_LAYOUTREWARDUNCLAIMEDCOUNTER = 1;

  private static final int LAYOUT_RAKUTENREWARDSPSHEADER = 2;

  private static final int LAYOUT_RAKUTENREWARDSPSMODESETTINGACTIVITY = 3;

  private static final int LAYOUT_RAKUTENREWARDSPSPORTALHEADER = 4;

  private static final int LAYOUT_RAKUTENREWARDSPSPORTALMOREACTIVITY = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_sps.R.layout.layout_reward_unclaimed_counter, LAYOUT_LAYOUTREWARDUNCLAIMEDCOUNTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_sps.R.layout.rakuten_reward_sps_header, LAYOUT_RAKUTENREWARDSPSHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_sps.R.layout.rakuten_reward_sps_mode_setting_activity, LAYOUT_RAKUTENREWARDSPSMODESETTINGACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_sps.R.layout.rakuten_reward_sps_portal_header, LAYOUT_RAKUTENREWARDSPSPORTALHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_sps.R.layout.rakuten_reward_sps_portal_more_activity, LAYOUT_RAKUTENREWARDSPSPORTALMOREACTIVITY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_LAYOUTREWARDUNCLAIMEDCOUNTER: {
          if ("layout/layout_reward_unclaimed_counter_0".equals(tag)) {
            return new LayoutRewardUnclaimedCounterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_reward_unclaimed_counter is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDSPSHEADER: {
          if ("layout/rakuten_reward_sps_header_0".equals(tag)) {
            return new RakutenRewardSpsHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakuten_reward_sps_header is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDSPSMODESETTINGACTIVITY: {
          if ("layout/rakuten_reward_sps_mode_setting_activity_0".equals(tag)) {
            return new RakutenRewardSpsModeSettingActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakuten_reward_sps_mode_setting_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDSPSPORTALHEADER: {
          if ("layout/rakuten_reward_sps_portal_header_0".equals(tag)) {
            return new RakutenRewardSpsPortalHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakuten_reward_sps_portal_header is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDSPSPORTALMOREACTIVITY: {
          if ("layout/rakuten_reward_sps_portal_more_activity_0".equals(tag)) {
            return new RakutenRewardSpsPortalMoreActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakuten_reward_sps_portal_more_activity is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.rakuten.gap.ads.mission_ui.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(12);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "errorMessage");
      sKeys.put(2, "errorText");
      sKeys.put(3, "headerTitle");
      sKeys.put(4, "infoMessage");
      sKeys.put(5, "infoText");
      sKeys.put(6, "portalViewModel");
      sKeys.put(7, "toolbarLeftIcon");
      sKeys.put(8, "toolbarText");
      sKeys.put(9, "toolbarTitle");
      sKeys.put(10, "unclaimItemNumber");
      sKeys.put(11, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/layout_reward_unclaimed_counter_0", com.rakuten.gap.ads.mission_sps.R.layout.layout_reward_unclaimed_counter);
      sKeys.put("layout/rakuten_reward_sps_header_0", com.rakuten.gap.ads.mission_sps.R.layout.rakuten_reward_sps_header);
      sKeys.put("layout/rakuten_reward_sps_mode_setting_activity_0", com.rakuten.gap.ads.mission_sps.R.layout.rakuten_reward_sps_mode_setting_activity);
      sKeys.put("layout/rakuten_reward_sps_portal_header_0", com.rakuten.gap.ads.mission_sps.R.layout.rakuten_reward_sps_portal_header);
      sKeys.put("layout/rakuten_reward_sps_portal_more_activity_0", com.rakuten.gap.ads.mission_sps.R.layout.rakuten_reward_sps_portal_more_activity);
    }
  }
}
