package com.rakuten.gap.ads.mission_ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiActionpointErrorFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiBackheaderFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiCurrentpointFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfomessageFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiMissionErrorFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiMissionInfoFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeActivityBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeFailBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeLoadingBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeSelectBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeSuccessBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointhistoryActivityBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointhistoryErrorFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointhistoryInfoFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPortalActivityBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiSettingActivityBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiSettingPresentedrowBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTabfragmentHomeBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTabfragmentMissionlistBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTabfragmentMoreBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTabfragmentUnclaimBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiTwLegalTextBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiUnclaimErrorFragmentBindingImpl;
import com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiUnclaimInfoFragmentBindingImpl;
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
  private static final int LAYOUT_RAKUTENREWARDUIACTIONPOINTERRORFRAGMENT = 1;

  private static final int LAYOUT_RAKUTENREWARDUIBACKHEADERFRAGMENT = 2;

  private static final int LAYOUT_RAKUTENREWARDUICURRENTPOINTFRAGMENT = 3;

  private static final int LAYOUT_RAKUTENREWARDUIERRORFRAGMENT = 4;

  private static final int LAYOUT_RAKUTENREWARDUIERRORLAYOUT = 5;

  private static final int LAYOUT_RAKUTENREWARDUIINFOLAYOUT = 6;

  private static final int LAYOUT_RAKUTENREWARDUIINFOMESSAGEFRAGMENT = 7;

  private static final int LAYOUT_RAKUTENREWARDUIMISSIONERRORFRAGMENT = 8;

  private static final int LAYOUT_RAKUTENREWARDUIMISSIONINFOFRAGMENT = 9;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEACTIVITY = 10;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEFAIL = 11;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGELOADING = 12;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESELECT = 13;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESUCCESS = 14;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTHISTORYACTIVITY = 15;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTHISTORYERRORFRAGMENT = 16;

  private static final int LAYOUT_RAKUTENREWARDUIPOINTHISTORYINFOFRAGMENT = 17;

  private static final int LAYOUT_RAKUTENREWARDUIPORTALACTIVITY = 18;

  private static final int LAYOUT_RAKUTENREWARDUISETTINGACTIVITY = 19;

  private static final int LAYOUT_RAKUTENREWARDUISETTINGPRESENTEDROW = 20;

  private static final int LAYOUT_RAKUTENREWARDUITABFRAGMENTHOME = 21;

  private static final int LAYOUT_RAKUTENREWARDUITABFRAGMENTMISSIONLIST = 22;

  private static final int LAYOUT_RAKUTENREWARDUITABFRAGMENTMORE = 23;

  private static final int LAYOUT_RAKUTENREWARDUITABFRAGMENTUNCLAIM = 24;

  private static final int LAYOUT_RAKUTENREWARDUITOOLBAR = 25;

  private static final int LAYOUT_RAKUTENREWARDUITWLEGALTEXT = 26;

  private static final int LAYOUT_RAKUTENREWARDUIUNCLAIMERRORFRAGMENT = 27;

  private static final int LAYOUT_RAKUTENREWARDUIUNCLAIMINFOFRAGMENT = 28;

  private static final int LAYOUT_RAKUTENREWARDUIUNCLAIMITEMFRAGMENT = 29;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(29);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_actionpoint_error_fragment, LAYOUT_RAKUTENREWARDUIACTIONPOINTERRORFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_backheader_fragment, LAYOUT_RAKUTENREWARDUIBACKHEADERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_currentpoint_fragment, LAYOUT_RAKUTENREWARDUICURRENTPOINTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_fragment, LAYOUT_RAKUTENREWARDUIERRORFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout, LAYOUT_RAKUTENREWARDUIERRORLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout, LAYOUT_RAKUTENREWARDUIINFOLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_infomessage_fragment, LAYOUT_RAKUTENREWARDUIINFOMESSAGEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_mission_error_fragment, LAYOUT_RAKUTENREWARDUIMISSIONERRORFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_mission_info_fragment, LAYOUT_RAKUTENREWARDUIMISSIONINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_activity, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_fail, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGEFAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_loading, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGELOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_select, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESELECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_success, LAYOUT_RAKUTENREWARDUIPOINTEXCHANGESUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_pointhistory_activity, LAYOUT_RAKUTENREWARDUIPOINTHISTORYACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_pointhistory_error_fragment, LAYOUT_RAKUTENREWARDUIPOINTHISTORYERRORFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_pointhistory_info_fragment, LAYOUT_RAKUTENREWARDUIPOINTHISTORYINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_portal_activity, LAYOUT_RAKUTENREWARDUIPORTALACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_setting_activity, LAYOUT_RAKUTENREWARDUISETTINGACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_setting_presentedrow, LAYOUT_RAKUTENREWARDUISETTINGPRESENTEDROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_home, LAYOUT_RAKUTENREWARDUITABFRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_missionlist, LAYOUT_RAKUTENREWARDUITABFRAGMENTMISSIONLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_more, LAYOUT_RAKUTENREWARDUITABFRAGMENTMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_unclaim, LAYOUT_RAKUTENREWARDUITABFRAGMENTUNCLAIM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar, LAYOUT_RAKUTENREWARDUITOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tw_legal_text, LAYOUT_RAKUTENREWARDUITWLEGALTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_unclaim_error_fragment, LAYOUT_RAKUTENREWARDUIUNCLAIMERRORFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_unclaim_info_fragment, LAYOUT_RAKUTENREWARDUIUNCLAIMINFOFRAGMENT);
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
        case  LAYOUT_RAKUTENREWARDUIACTIONPOINTERRORFRAGMENT: {
          if ("layout/rakutenreward_ui_actionpoint_error_fragment_0".equals(tag)) {
            return new RakutenrewardUiActionpointErrorFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_actionpoint_error_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIBACKHEADERFRAGMENT: {
          if ("layout/rakutenreward_ui_backheader_fragment_0".equals(tag)) {
            return new RakutenrewardUiBackheaderFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_backheader_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUICURRENTPOINTFRAGMENT: {
          if ("layout/rakutenreward_ui_currentpoint_fragment_0".equals(tag)) {
            return new RakutenrewardUiCurrentpointFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_currentpoint_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIERRORFRAGMENT: {
          if ("layout/rakutenreward_ui_error_fragment_0".equals(tag)) {
            return new RakutenrewardUiErrorFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_error_fragment is invalid. Received: " + tag);
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
        case  LAYOUT_RAKUTENREWARDUIINFOMESSAGEFRAGMENT: {
          if ("layout/rakutenreward_ui_infomessage_fragment_0".equals(tag)) {
            return new RakutenrewardUiInfomessageFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_infomessage_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIMISSIONERRORFRAGMENT: {
          if ("layout/rakutenreward_ui_mission_error_fragment_0".equals(tag)) {
            return new RakutenrewardUiMissionErrorFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_mission_error_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIMISSIONINFOFRAGMENT: {
          if ("layout/rakutenreward_ui_mission_info_fragment_0".equals(tag)) {
            return new RakutenrewardUiMissionInfoFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_mission_info_fragment is invalid. Received: " + tag);
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
        case  LAYOUT_RAKUTENREWARDUIPOINTHISTORYERRORFRAGMENT: {
          if ("layout/rakutenreward_ui_pointhistory_error_fragment_0".equals(tag)) {
            return new RakutenrewardUiPointhistoryErrorFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_pointhistory_error_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIPOINTHISTORYINFOFRAGMENT: {
          if ("layout/rakutenreward_ui_pointhistory_info_fragment_0".equals(tag)) {
            return new RakutenrewardUiPointhistoryInfoFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_pointhistory_info_fragment is invalid. Received: " + tag);
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
        case  LAYOUT_RAKUTENREWARDUISETTINGPRESENTEDROW: {
          if ("layout/rakutenreward_ui_setting_presentedrow_0".equals(tag)) {
            return new RakutenrewardUiSettingPresentedrowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_setting_presentedrow is invalid. Received: " + tag);
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
        case  LAYOUT_RAKUTENREWARDUIUNCLAIMERRORFRAGMENT: {
          if ("layout/rakutenreward_ui_unclaim_error_fragment_0".equals(tag)) {
            return new RakutenrewardUiUnclaimErrorFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_unclaim_error_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_RAKUTENREWARDUIUNCLAIMINFOFRAGMENT: {
          if ("layout/rakutenreward_ui_unclaim_info_fragment_0".equals(tag)) {
            return new RakutenrewardUiUnclaimInfoFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for rakutenreward_ui_unclaim_info_fragment is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "errorText");
      sKeys.put(2, "infoText");
      sKeys.put(3, "missionViewModel");
      sKeys.put(4, "parentViewModel");
      sKeys.put(5, "portalViewModel");
      sKeys.put(6, "toolbarLeftIcon");
      sKeys.put(7, "toolbarText");
      sKeys.put(8, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(29);

    static {
      sKeys.put("layout/rakutenreward_ui_actionpoint_error_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_actionpoint_error_fragment);
      sKeys.put("layout/rakutenreward_ui_backheader_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_backheader_fragment);
      sKeys.put("layout/rakutenreward_ui_currentpoint_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_currentpoint_fragment);
      sKeys.put("layout/rakutenreward_ui_error_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_fragment);
      sKeys.put("layout/rakutenreward_ui_error_layout_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout);
      sKeys.put("layout/rakutenreward_ui_info_layout_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout);
      sKeys.put("layout/rakutenreward_ui_infomessage_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_infomessage_fragment);
      sKeys.put("layout/rakutenreward_ui_mission_error_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_mission_error_fragment);
      sKeys.put("layout/rakutenreward_ui_mission_info_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_mission_info_fragment);
      sKeys.put("layout/rakutenreward_ui_point_exchange_activity_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_activity);
      sKeys.put("layout/rakutenreward_ui_point_exchange_fail_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_fail);
      sKeys.put("layout/rakutenreward_ui_point_exchange_loading_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_loading);
      sKeys.put("layout/rakutenreward_ui_point_exchange_select_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_select);
      sKeys.put("layout/rakutenreward_ui_point_exchange_success_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_success);
      sKeys.put("layout/rakutenreward_ui_pointhistory_activity_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_pointhistory_activity);
      sKeys.put("layout/rakutenreward_ui_pointhistory_error_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_pointhistory_error_fragment);
      sKeys.put("layout/rakutenreward_ui_pointhistory_info_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_pointhistory_info_fragment);
      sKeys.put("layout/rakutenreward_ui_portal_activity_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_portal_activity);
      sKeys.put("layout/rakutenreward_ui_setting_activity_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_setting_activity);
      sKeys.put("layout/rakutenreward_ui_setting_presentedrow_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_setting_presentedrow);
      sKeys.put("layout/rakutenreward_ui_tabfragment_home_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_home);
      sKeys.put("layout/rakutenreward_ui_tabfragment_missionlist_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_missionlist);
      sKeys.put("layout/rakutenreward_ui_tabfragment_more_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_more);
      sKeys.put("layout/rakutenreward_ui_tabfragment_unclaim_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tabfragment_unclaim);
      sKeys.put("layout/rakutenreward_ui_toolbar_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar);
      sKeys.put("layout/rakutenreward_ui_tw_legal_text_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_tw_legal_text);
      sKeys.put("layout/rakutenreward_ui_unclaim_error_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_unclaim_error_fragment);
      sKeys.put("layout/rakutenreward_ui_unclaim_info_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_unclaim_info_fragment);
      sKeys.put("layout/rakutenreward_ui_unclaimitem_fragment_0", com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_unclaimitem_fragment);
    }
  }
}
