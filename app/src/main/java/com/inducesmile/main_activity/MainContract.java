package com.inducesmile.main_activity;

import com.inducesmile.model.ApiObject;
import com.inducesmile.model.NoticeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bpn on 12/6/17.
 */

public interface MainContract {
    /**
     * Call when user interact with the view and other when view OnDestroy()
     * */
    interface presenter{
        void onDestroy();
        void onRefreshButtonClick();
        void requestDataFromServer();
    }
    /**
     * showProgress() and hideProgress() would be used for displaying and hiding the progressBar
     * while the setDataToRecyclerView and onResponseFailure is fetched from the GetNoticeInteractorImpl class
     **/
    interface MainView {
        void showProgress();
        void hideProgress();
        void setDataToRecyclerView(Object noticeArrayList);
        void onResponseFailure(Throwable throwable);
    }
    /**
     * Intractors are classes built for fetching data from your database, web services, or any other data source.
     **/
    interface GetNoticeIntractor {
        interface OnFinishedListener {
         //   void onFinished(List<NoticeList> noticeArrayList);
            void onFinished(Object noticeArrayList);
            void onFailure(Throwable t);
        }
        void getNoticeArrayList(OnFinishedListener onFinishedListener);
    }
}