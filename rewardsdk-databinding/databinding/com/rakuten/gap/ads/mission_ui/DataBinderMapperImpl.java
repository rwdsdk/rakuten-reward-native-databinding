package com.rakuten.gap.ads.mission_ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiCurrentpointFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeActivityBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeFailBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeLoadingBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeSelectBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeSuccessBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointhistoryActivityBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPortalActivityBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiSettingActivityBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTabfragmentHomeBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTabfragmentMissionlistBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTabfragmentMoreBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTabfragmentUnclaimBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTwLegalTextBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiUnclaimitemFragmentBindingImpl;
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
  private static final int LAYOUT_RAKUTENREWARDUICURRENTPOINTFRAGMENT = 1;

  private static final int LAYOUT_RAKUTENREWARDUIERRORLAYOUT = 2;

  private static final int LAYOUT_RAKUTENREWARDUIINFOLAYOUT = 3;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEACTIVITY = 4;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEFAIL = 5;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGELOADING = 6;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESELECT = 7;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESUCCESS = 8;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTHISTORYACTIVITY = 9;

  private static final int LAYOUT_RAKUTENREWARDUIPORTALACTIVITY = 10;

  private static final int LAYOUT_RAKUTENREWARDUISETTINGACTIVITY = 11;

  private static final int LAYOUT_RAKUTENREWARDUITABFRAGMENTHOME = 12;

  private static final int LAYOUT_RAKUTENREWARDUITABFRAGMENTMISSIONLIST = 13;

  private static final int LAYOUT_RAKUTENREWARDUITABFRAGMENTMORE = 14;

  private static final int LAYOUT_RAKUTENREWARDUITABFRAGMENTUNCLAIM = 15;

  private static final int LAYOUT_RAKUTENREWARDUITOOLBAR = 16;

  private static final int LAYOUT_RAKUTENREWARDUITWLEGALTEXT = 17;

  private static final int LAYOUT_RAKUTENREWARDUIUNCLAIMITEMFRAGMENT = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_currentpoint_fragment, LAYOUT_RAKUTENREWARDUICURRENTPOINTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout, LAYOUT_RAKUTENREWARDUIERRORLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout, LAYOUT_RAKUTENREWARDUIINFOLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_activity, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_fail, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEFAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_loading, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGELOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_select, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_success, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_pointhistory_activity, LAYOUT_RAKUTENREWARDUIPOINTHISTORYACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_portal_activity, LAYOUT_RAKUTENREWARDUIPORTALACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_setting_activity, LAYOUT_RAKUTENREWARDUISETTINGACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_home, LAYOUT_RAKUTENREWARDUITABFRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_missionlist, LAYOUT_RAKUTENREWARDUITABFRAGMENTMISSIONLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_more, LAYOUT_RAKUTENREWARDUITABFRAGMENTMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_unclaim, LAYOUT_RAKUTENREWARDUITABFRAGMENTUNCLAIM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar, LAYOUT_RAKUTENREWARDUITOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tw_legal_text, LAYOUT_RAKUTENREWARDUITWLEGALTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_unclaimitem_fragment, LAYOUT_RAKUTENREWARDUIUNCLAIMITEMFRAGMENT);
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
        case  LAYOUT_RAKUTENREWARDUICURRENTPOINTFRAGMENT: {
          if ("layout/rakutenreward_ui_currentpoint_fragment_0".equals(tag)) {
            return new RakutenrewardUiCurrentpointFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_currentpoint_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIERRORLAYOUT: {
          if ("layout/rakutenreward_ui_error_layout_0".equals(tag)) {
            return new RakutenrewardUiErrorLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_error_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIINFOLAYOUT: {
          if ("layout/rakutenreward_ui_info_layout_0".equals(tag)) {
            return new RakutenrewardUiInfoLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_info_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEACTIVITY: {
          if ("layout/rakutenreward_ui_point_exchange_activity_0".equals(tag)) {
            return new RakutenrewardUiPointExchangeActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_point_exchange_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEFAIL: {
          if ("layout/rakutenreward_ui_point_exchange_fail_0".equals(tag)) {
            return new RakutenrewardUiPointExchangeFailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_point_exchange_fail is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIPOINTEXCHANGELOADING: {
          if ("layout/rakutenreward_ui_point_exchange_loading_0".equals(tag)) {
            return new RakutenrewardUiPointExchangeLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_point_exchange_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESELECT: {
          if ("layout/rakutenreward_ui_point_exchange_select_0".equals(tag)) {
            return new RakutenrewardUiPointExchangeSelectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_point_exchange_select is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESUCCESS: {
          if ("layout/rakutenreward_ui_point_exchange_success_0".equals(tag)) {
            return new RakutenrewardUiPointExchangeSuccessBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_point_exchange_success is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIPOINTHISTORYACTIVITY: {
          if ("layout/rakutenreward_ui_pointhistory_activity_0".equals(tag)) {
            return new RakutenrewardUiPointhistoryActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_pointhistory_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIPORTALACTIVITY: {
          if ("layout/rakutenreward_ui_portal_activity_0".equals(tag)) {
            return new RakutenrewardUiPortalActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_portal_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUISETTINGACTIVITY: {
          if ("layout/rakutenreward_ui_setting_activity_0".equals(tag)) {
            return new RakutenrewardUiSettingActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_setting_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUITABFRAGMENTHOME: {
          if ("layout/rakutenreward_ui_tabfragment_home_0".equals(tag)) {
            return new RakutenrewardUiTabfragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_tabfragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUITABFRAGMENTMISSIONLIST: {
          if ("layout/rakutenreward_ui_tabfragment_missionlist_0".equals(tag)) {
            return new RakutenrewardUiTabfragmentMissionlistBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_tabfragment_missionlist is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUITABFRAGMENTMORE: {
          if ("layout/rakutenreward_ui_tabfragment_more_0".equals(tag)) {
            return new RakutenrewardUiTabfragmentMoreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_tabfragment_more is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUITABFRAGMENTUNCLAIM: {
          if ("layout/rakutenreward_ui_tabfragment_unclaim_0".equals(tag)) {
            return new RakutenrewardUiTabfragmentUnclaimBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_tabfragment_unclaim is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUITOOLBAR: {
          if ("layout/rakutenreward_ui_toolbar_0".equals(tag)) {
            return new RakutenrewardUiToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUITWLEGALTEXT: {
          if ("layout/rakutenreward_ui_tw_legal_text_0".equals(tag)) {
            return new RakutenrewardUiTwLegalTextBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_tw_legal_text is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIUNCLAIMITEMFRAGMENT: {
          if ("layout/rakutenreward_ui_unclaimitem_fragment_0".equals(tag)) {
            return new RakutenrewardUiUnclaimitemFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_unclaimitem_fragment is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "errorText");
      sKeys.put(2, "infoText");
      sKeys.put(3, "portalViewModel");
      sKeys.put(4, "toolbarLeftIcon");
      sKeys.put(5, "toolbarText");
      sKeys.put(6, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/rakutenreward_ui_currentpoint_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_currentpoint_fragment);
      sKeys.put("layout/rakutenreward_ui_error_layout_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout);
      sKeys.put("layout/rakutenreward_ui_info_layout_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout);
      sKeys.put("layout/rakutenreward_ui_point_exchange_activity_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_activity);
      sKeys.put("layout/rakutenreward_ui_point_exchange_fail_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_fail);
      sKeys.put("layout/rakutenreward_ui_point_exchange_loading_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_loading);
      sKeys.put("layout/rakutenreward_ui_point_exchange_select_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_select);
      sKeys.put("layout/rakutenreward_ui_point_exchange_success_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_success);
      sKeys.put("layout/rakutenreward_ui_pointhistory_activity_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_pointhistory_activity);
      sKeys.put("layout/rakutenreward_ui_portal_activity_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_portal_activity);
      sKeys.put("layout/rakutenreward_ui_setting_activity_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_setting_activity);
      sKeys.put("layout/rakutenreward_ui_tabfragment_home_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_home);
      sKeys.put("layout/rakutenreward_ui_tabfragment_missionlist_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_missionlist);
      sKeys.put("layout/rakutenreward_ui_tabfragment_more_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_more);
      sKeys.put("layout/rakutenreward_ui_tabfragment_unclaim_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_unclaim);
      sKeys.put("layout/rakutenreward_ui_toolbar_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar);
      sKeys.put("layout/rakutenreward_ui_tw_legal_text_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tw_legal_text);
      sKeys.put("layout/rakutenreward_ui_unclaimitem_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_unclaimitem_fragment);
    }
  }
}
